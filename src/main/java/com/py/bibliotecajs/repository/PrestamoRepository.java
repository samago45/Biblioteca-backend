package com.py.bibliotecajs.repository;

import com.py.bibliotecajs.Entity.PrestamoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<PrestamoEntity, Long> {
}