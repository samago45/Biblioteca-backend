package com.py.bibliotecajs.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.py.bibliotecajs.Entity.LibroEntity} entity
 */
@Data
public class LibroEntityDto implements Serializable {
    private final AutorEntityDto autorEntity;
}