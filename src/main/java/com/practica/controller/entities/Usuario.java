package com.practica.controller.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String telefonoUsuario;
    private LocalDate fechaNacimientoUsuario;
    private String emailUsuario;
    private String usernameUsuario;
    private String passwordUsuario;
    private Boolean enabledUsuario;

/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="nombre",length = 30, nullable = false)
    private String nombreUsuario;
    @Column(name="apellido",length = 30, nullable = false)
    private String apellidoUsuario;
    @Column(name="telefono",length = 9, nullable = false)
    private String telefonoUsuario;

    @Column(name="fechaNacimiento", nullable = false)
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaNacimientoUsuario;
    @Column(name="email",length = 50, nullable = false)
    private String emailUsuario;
    @Column(name="username",length = 30, nullable = false)
    private String usernameUsuario;
    @Column(name="password",length = 15, nullable = false)
    private String passwordUsuario;
    @Column(name="enabled",length = 15, nullable = false)
    private Boolean enabledUsuario;
    /*@ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;*/

}
