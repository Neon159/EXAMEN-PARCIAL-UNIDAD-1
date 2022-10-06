/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cnolasco.service.impl;

import com.example.cnolasco.entity.Editorial;
import com.example.cnolasco.repository.EditorialRepository;
import com.example.cnolasco.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tpp
 */
@Service
public class EditorialServiceImpl implements EditorialService {
    
    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialRepository.findAll();
    }

    @Override
    public Editorial findById(Long id) {
        return editorialRepository.findById(id).orElse(null);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
        editorialRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        editorialRepository.deleteById(id);
    }
}
