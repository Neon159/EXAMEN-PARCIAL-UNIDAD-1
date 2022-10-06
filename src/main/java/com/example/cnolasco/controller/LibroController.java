/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cnolasco.controller;

import com.example.cnolasco.entity.Libro;
import com.example.cnolasco.service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tpp
 */
@RestController
@RequestMapping("/libro")
@Api(value = "Microservicio de libro", description = "Microservicio de libro")
public class LibroController {
    
    @Autowired
    LibroService libroService;

    @ApiOperation(value = "Lista de libros")
    @GetMapping
    public List<Libro> findAll() {
        return (List<Libro>) libroService.findAll();
    }

    @ApiOperation(value = "Lista un libro")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id) {
        Libro libro = libroService.findById(id);
        return ResponseEntity.ok(libro);
    }

    @ApiOperation(value = "registrar un libro")
    @PostMapping
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @ApiOperation(value = "Elimina una libro")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        libroService.deleteById(id);
    }
}
