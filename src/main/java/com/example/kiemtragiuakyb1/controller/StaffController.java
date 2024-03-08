package com.example.kiemtragiuakyb1.controller;

import com.example.kiemtragiuakyb1.model.Staff;
import com.example.kiemtragiuakyb1.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    @GetMapping
    public ResponseEntity<Page<Staff>> findAllCustomer(@PageableDefault(value = 1) Pageable pageable){
        Page<Staff> staff = iStaffService.findAll(pageable);
        if (staff.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff,HttpStatus.OK);
    }
    @GetMapping("/search/{name}")
    public ResponseEntity<Page<Staff>> searchComputer(@PathVariable String name , @PageableDefault(value = 1) Pageable pageable){
        Page<Staff> computers = iStaffService.search("%"+name+"%",pageable);
        if (computers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computers,HttpStatus.OK);
    }
    public ResponseEntity<Staff> findById(@PathVariable("id") Long id){
        Optional<Staff> staff = iStaffService.findById(id);
        if (!staff.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staff.get(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Staff> saveCustomer(@RequestBody Staff staff){
        return new ResponseEntity<>(iStaffService.save(staff),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateCustomer(@PathVariable("id") Long id , @RequestBody Staff staff){
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        staff.setId(staffOptional.get().getId());
        return new ResponseEntity<>(iStaffService.save(staff),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteCustomer(@PathVariable long id){
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iStaffService.delete(id);
        return new ResponseEntity<>(staffOptional.get(),HttpStatus.OK);
    }
}
