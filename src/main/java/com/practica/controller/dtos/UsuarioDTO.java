package com.practica.controller.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String telefonoUsuario;
    private LocalDate fechaNacimientoUsuario;
    private String emailUsuario;
    private String usernameUsuario;
    private String passwordUsuario;
    private Boolean enabledUsuario;
}