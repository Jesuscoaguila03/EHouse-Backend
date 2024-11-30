package com.practica.controller.services;

import com.practica.controller.entities.Habitacion;

import java.util.List;
import java.util.Map;

public interface HabitacionService {
    public Habitacion insertar(Habitacion habitacion);
    public Habitacion editar(Habitacion habitacion);
    public void eliminar(long id);
    public List<Habitacion> listar();
    public Habitacion buscarPorId(long id);
    public List<String[]> habitacionFavorita();
    /*Map<String, Long> obtenerCantidadHabitacionesPorTipo(String tipoHabitacion);
*/
}
