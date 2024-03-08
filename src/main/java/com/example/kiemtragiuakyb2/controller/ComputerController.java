package com.example.kiemtragiuakyb2.controller;

import com.example.kiemtragiuakyb2.model.Computer;
import com.example.kiemtragiuakyb2.service.IComputerService;
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
@RequestMapping("/api/computers")
public class ComputerController {
    @Autowired
    private IComputerService iComputerService;

    @GetMapping
    public ResponseEntity<Page<Computer>> findAllCustomer(@PageableDefault(value = 1) Pageable pageable){
        Page<Computer> computers = iComputerService.findAll(pageable);
        if (computers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computers,HttpStatus.OK);
    }
    @GetMapping("/search/{name}")
    public ResponseEntity<Page<Computer>> searchComputer(@PathVariable String name , @PageableDefault(value = 1) Pageable pageable){
        Page<Computer> computers = iComputerService.search("%"+name+"%",pageable);
        if (computers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computers,HttpStatus.OK);
    }
    public ResponseEntity<Computer> findById(@PathVariable("id") Long id){
        Optional<Computer> computer = iComputerService.findById(id);
        if (!computer.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(computer.get(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Computer> saveCustomer(@RequestBody Computer computer){
        return new ResponseEntity<>(iComputerService.save(computer),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Computer> updateCustomer(@PathVariable("id") Long id , @RequestBody Computer computer){
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        computer.setId(computerOptional.get().getId());
        return new ResponseEntity<>(iComputerService.save(computer),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Computer> deleteCustomer(@PathVariable long id){
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iComputerService.delete(id);
        return new ResponseEntity<>(computerOptional.get(),HttpStatus.OK);
    }
}
