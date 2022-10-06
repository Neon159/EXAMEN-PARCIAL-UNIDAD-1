/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.cnolasco.service;

import com.example.cnolasco.entity.Libro;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author tpp
 */
@Service
public interface LibroService {
     public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro save(Libro libro);

    public void delete(Libro libro);

    public void deleteById(Long id);
}
