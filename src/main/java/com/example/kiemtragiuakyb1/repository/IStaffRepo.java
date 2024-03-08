package com.example.kiemtragiuakyb1.repository;

import com.example.kiemtragiuakyb1.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IStaffRepo extends CrudRepository<Staff,Long> {
    Page<Staff> findAll(Pageable pageable);
    @Query("select c from  Staff  c where  c.name like  ?1 ")
    Page<Staff> searchStaff(String name, Pageable pageable);
}
