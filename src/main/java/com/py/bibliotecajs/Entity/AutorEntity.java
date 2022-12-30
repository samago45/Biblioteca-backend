package com.py.bibliotecajs.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;


@Entity
@Data
@Table(name = "Autores")
public class AutorEntity {

    @Id
    @Column(name = "id" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido" , nullable = false)
    private String apallido;


    @OneToMany(mappedBy = "autorEntity")
    @ToString.Exclude
    private Set<LibroEntity> libro;

}
