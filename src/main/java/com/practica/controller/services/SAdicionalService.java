package com.practica.controller.services;

import com.practica.controller.entities.Reserva;
import com.practica.controller.entities.SAdicionales;

import java.util.List;

public interface SAdicionalService {
    public SAdicionales insertar(SAdicionales sAdicionales);
    public SAdicionales editar(SAdicionales sAdicionales);
    public void eliminar(long id);
    public List<SAdicionales> listar();
    public SAdicionales buscarPorId(long id);

}
