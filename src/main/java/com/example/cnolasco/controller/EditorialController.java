/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cnolasco.controller;

import com.example.cnolasco.entity.Editorial;
import com.example.cnolasco.service.EditorialService;
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
@RequestMapping("/editorial")
@Api(value = "Microservicio de editorial", description = "Microservicio de editorial")
public class EditorialController {
    
    @Autowired
    EditorialService editorialService;

    @ApiOperation(value = "Lista de editoriales")
    @GetMapping
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialService.findAll();
    }

    @ApiOperation(value = "Lista un editorial")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id) {
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @ApiOperation(value = "registrar un editorial")
    @PostMapping
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

    @ApiOperation(value = "Elimina una editorial")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);
    }
}
