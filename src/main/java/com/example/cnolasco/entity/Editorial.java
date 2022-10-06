/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cnolasco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tpp
 */
@Data
@Entity
@Table(name = "Editorial")
public class Editorial {
    
    @Id
    @Column(name = "edit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;

    @Column(name = "edit_nombre_editorial")
    private String editNombreeditorial;
   
    @Column(name = "edit_usuario")
    private String editUsuario;

   

    

}
