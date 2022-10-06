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
@Table(name = "Libro")
public class Libro {
    
    @Id
    @Column(name = "libr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long librId;

    @Column(name = "libr_nombre")
    private String librNombre;

    @Column(name = "libr_autor")
    private String librAutor;

    @Column(name = "libr_anho_edicion")
    private String librAnhoEdicion;

    @Column(name = "libr_anho_escritura")
    private String librAnhoEscritura;

    @Column(name = "libr_ibsn")
    private String librIbsn;
}
