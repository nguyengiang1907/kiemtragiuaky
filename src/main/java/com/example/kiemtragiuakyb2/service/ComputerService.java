package com.example.kiemtragiuakyb2.service;

import com.example.kiemtragiuakyb2.model.Computer;
import com.example.kiemtragiuakyb2.repository.IComputerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ComputerService implements IComputerService{
    @Autowired
    private IComputerRepo iComputerRepo;

    @Override
    public Page<Computer> findAll(Pageable pageable) {
        return iComputerRepo.findAll(pageable);
    }

    @Override
    public Page<Computer> search(String search, Pageable pageable) {
        return iComputerRepo.searchComputer(search,pageable);
    }

    @Override
    public Iterable<Computer> findAll() {
        return iComputerRepo.findAll();
    }

    @Override
    public Optional<Computer> findById(long id) {
        return iComputerRepo.findById(id);
    }

    @Override
    public Computer save(Computer computer) {
        return iComputerRepo.save(computer);
    }

    @Override
    public void delete(long id) {
        iComputerRepo.deleteById(id);
    }
}
