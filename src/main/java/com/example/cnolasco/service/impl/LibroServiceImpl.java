/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cnolasco.service.impl;

import com.example.cnolasco.entity.Libro;
import com.example.cnolasco.repository.LibroRepository;
import com.example.cnolasco.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tpp
 */
@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void delete(Libro libro) {
        libroRepository.delete(libro);
    }

    @Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }
    
}
