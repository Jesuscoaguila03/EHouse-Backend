package com.practica.controller.dtos;

import com.practica.controller.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReseniaDTO {
    private int idResenia;
    private int puntuacion;
    private LocalDate fechaResenia;
    private String descripcionResenia;
    private Usuario usuario;
}
