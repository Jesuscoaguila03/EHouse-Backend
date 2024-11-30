package com.practica.controller.dtos;

import com.practica.controller.entities.Usuario;
import com.practica.controller.entities.Habitacion;
import com.practica.controller.entities.SAdicionales;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO {
    private int idReserva;
    private int cantidadPersonas;
    private LocalDate fecha_reserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioTotal;
    private String estadoReserva;
    private Usuario usuario;
    private Habitacion habitacion;
    private SAdicionales sAdicionales;
}
