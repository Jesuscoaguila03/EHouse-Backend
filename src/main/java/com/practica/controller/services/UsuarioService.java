package com.practica.controller.services;

import com.practica.controller.entities.SAdicionales;
import com.practica.controller.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario insertar(Usuario usuario);
    public Usuario editar(Usuario usuario);
    public void eliminar(long id);
    public List<Usuario> listar();
    public Usuario buscarPorId(long id);

}
