package com.py.bibliotecajs.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "libros")
public class LibroEntity {
    @Id
    @Column(name = "id" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "portada" , nullable = false)
    private String portada;

    @Column(name = "ISBN" , nullable = false)
    private String ISBN;

    @Column(name = "img" , nullable = false)
    private String img;

    @Column(name = "descripcion" , nullable = false)
    private String descripcion;




    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    private AutorEntity autorEntity;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prestamo_id")
    private PrestamoEntity prestamoEntity;
}
