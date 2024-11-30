package com.practica.controller.serviceimpl;

import com.practica.controller.entities.Hotel;
import com.practica.controller.entities.Usuario;
import com.practica.controller.repositories.HotelRepositorio;
import com.practica.controller.repositories.UsuarioRepositorio;
import com.practica.controller.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepositorio UR;

    @Override
    public Usuario insertar(Usuario usuario) {
        return UR.save(usuario);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        if (UR.findById(usuario.getIdUsuario()).isPresent()) {
            return UR.save(usuario);
        }
        return null;
    }

    @Override
    public void eliminar(long id) {
        if(UR.existsById(id)){
            UR.deleteById(id);
        }
    }

    @Override
    public List<Usuario> listar() {
        return UR.findAll();
    }

    @Override
    public Usuario buscarPorId(long id) {
        if(UR.findById(id).isPresent()){
            return UR.findById(id).get();
        }
        return null;
    }
}
