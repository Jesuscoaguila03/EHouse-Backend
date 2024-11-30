package com.practica.controller.repositories;

import com.practica.controller.entities.SAdicionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SAdicionalesRepositorio extends JpaRepository<SAdicionales, Long> {
}
