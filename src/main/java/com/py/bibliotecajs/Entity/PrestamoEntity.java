package com.py.bibliotecajs.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "prestamos")
public class PrestamoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , unique = true , nullable = false)
    private Long id;

    @Column(name = "inicio_prestamo")
    private Date inicioPrestamo;

    @Column(name = "vencimiento_prestamo")
    private Date  vencimientoPrestamo;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pretamo_id")
    private ClienteEntity clienteEntity;


    @OneToMany(mappedBy = "prestamoEntity")
    @ToString.Exclude
    private Set<LibroEntity> libroEntity;
}
