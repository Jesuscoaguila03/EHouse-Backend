package com.practica.controller.services;

import com.practica.controller.entities.Habitacion;
import com.practica.controller.entities.Resenia;

import java.util.List;

public interface ReseniaService {
    public Resenia insertar(Resenia resenia);
    public Resenia editar(Resenia resenia);
    public void eliminar(long id);
    public List<Resenia> listar();
    public Resenia buscarPorId(long id);
}
