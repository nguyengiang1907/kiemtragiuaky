package com.example.kiemtragiuakyb1.service;

import com.example.kiemtragiuakyb1.model.Staff;
import com.example.kiemtragiuakyb1.repository.IStaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StaffService implements IStaffService{
    @Autowired
    private IStaffRepo iStaffRepo;

    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return iStaffRepo.findAll(pageable);
    }

    @Override
    public Page<Staff> search(String search, Pageable pageable) {
        return iStaffRepo.searchStaff(search,pageable);
    }

    @Override
    public Iterable<Staff> findAll() {
        return iStaffRepo.findAll();
    }

    @Override
    public Optional<Staff> findById(long id) {
        return iStaffRepo.findById(id);
    }

    @Override
    public Staff save(Staff computer) {
        return iStaffRepo.save(computer);
    }

    @Override
    public void delete(long id) {
        iStaffRepo.deleteById(id);
    }
}
