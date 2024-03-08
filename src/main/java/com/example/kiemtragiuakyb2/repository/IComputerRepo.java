package com.example.kiemtragiuakyb2.repository;

import com.example.kiemtragiuakyb2.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IComputerRepo extends CrudRepository<Computer,Long> {
    Page<Computer> findAll(Pageable pageable);
    @Query("select c from  Computer  c where  c.name like  ?1 ")
    Page<Computer> searchComputer(String name, Pageable pageable);
}
