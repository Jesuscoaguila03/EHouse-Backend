package com.practica.controller.services;

import com.practica.controller.entities.Resenia;
import com.practica.controller.entities.Reserva;

import java.util.List;

public interface ReservaService {
    public Reserva insertar(Reserva reserva);
    public Reserva editar(Reserva reserva);
    public void eliminar(long id);
    public List<Reserva> listar();
    public Reserva buscarPorId(long id);

}
