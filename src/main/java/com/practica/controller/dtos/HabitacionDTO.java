package com.practica.controller.dtos;

import com.practica.controller.entities.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO {
    private int idHabitacion;
    private String tipoHabitacion;
    private String disponibilidad;
    private String descripcionHabitacion;
    private Hotel hotel;
}
