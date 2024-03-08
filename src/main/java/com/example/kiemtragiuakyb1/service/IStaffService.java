package com.example.kiemtragiuakyb1.service;

import com.example.kiemtragiuakyb1.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IStaffService {
    Page<Staff> findAll(Pageable pageable);
    Page<Staff> search(String search , Pageable pageable);
    Iterable<Staff> findAll();
    Optional<Staff> findById(long id);
    Staff save(Staff staff);
    void delete(long id);
}
