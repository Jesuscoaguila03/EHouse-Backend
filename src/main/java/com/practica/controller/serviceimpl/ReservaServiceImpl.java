package com.practica.controller.serviceimpl;

import com.practica.controller.entities.Hotel;
import com.practica.controller.entities.Reserva;
import com.practica.controller.repositories.HotelRepositorio;
import com.practica.controller.repositories.ReservaRepositorio;
import com.practica.controller.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaRepositorio RR;

    @Override
    public Reserva insertar(Reserva reserva) {
        return RR.save(reserva);
    }

    @Override
    public Reserva editar(Reserva reserva) {
        if (RR.findById(reserva.getIdReserva()).isPresent()) {
            return RR.save(reserva);
        }
        return null;
    }

    @Override
    public void eliminar(long id) {
        if(RR.existsById(id)){
            RR.deleteById(id);
        }
    }

    @Override
    public List<Reserva> listar() {
        return RR.findAll();
    }

    @Override
    public Reserva buscarPorId(long id) {
        if(RR.findById(id).isPresent()){
            return RR.findById(id).get();
        }
        return null;
    }
}
