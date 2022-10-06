/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.cnolasco.repository;

import com.example.cnolasco.entity.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tpp
 */
@Repository
public interface EditorialRepository extends CrudRepository<Editorial, Long> {
    
}
