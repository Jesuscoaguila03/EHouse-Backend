package com.practica.controller.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "servicios_adicionales")
public class SAdicionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiciosAdicionales;
    private String nombreServicio;
    private double precioServicio;

}
