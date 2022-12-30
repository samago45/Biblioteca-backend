package com.py.bibliotecajs.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Entity
@Data
@Table(name = "Clientes")
public class ClienteEntity {
   @Id
   @Column(name = "id", nullable = false , unique = true)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "cedula" , unique = true , nullable = false)
    private Long cedula;

    @Column(name = "nombre" , nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;


    @OneToMany(mappedBy = "clienteEntity")
    @ToString.Exclude
    private Set<PrestamoEntity> prestamoEntity;

}
