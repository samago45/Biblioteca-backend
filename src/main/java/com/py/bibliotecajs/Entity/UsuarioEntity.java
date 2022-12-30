package com.py.bibliotecajs.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , unique = true , nullable = false)
    private Long id;

    @Column(name = "username" , unique = true , nullable = false)
    private String username;

    @Column(name = "password" , unique = true , nullable = false)
    private String password;
}
