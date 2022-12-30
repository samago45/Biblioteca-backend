package com.py.bibliotecajs.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.py.bibliotecajs.Entity.AutorEntity} entity
 */
@Data
public class AutorEntityDto implements Serializable {
    private final Long id;
    private final String nombre;
    private final String apallido;
    private final Set<LibroEntityDto> libroDto;
}