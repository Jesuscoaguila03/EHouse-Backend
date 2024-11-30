package com.practica.controller.repositories;

import com.practica.controller.entities.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseniaRepositorio extends JpaRepository<Resenia, Long> {

}
