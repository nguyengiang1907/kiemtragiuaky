package com.example.kiemtragiuakyb2.service;

import com.example.kiemtragiuakyb2.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IComputerService {
    Page<Computer> findAll(Pageable pageable);
    Page<Computer> search(String search , Pageable pageable);
    Iterable<Computer> findAll();
    Optional<Computer> findById(long id);
    Computer save(Computer computer);
    void delete(long id);
}
