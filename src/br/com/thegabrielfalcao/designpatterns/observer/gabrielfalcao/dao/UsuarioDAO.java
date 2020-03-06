package br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.dao;

import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public List<Usuario> retornarUsuariosEmail() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Phill", "phill@email.com", "21999988887"));
        usuarios.add(new Usuario("Falcão", "falcao@email.com", "21888887777"));
        usuarios.add(new Usuario("Mazinho", "mazinho@email.com", "22999988887"));
        usuarios.add(new Usuario("Hugo", "hugo@email.com", "23999988887"));
        usuarios.add(new Usuario("Lauro", "lauro@email.com", "24999988887"));

        return usuarios;
    }

    public List<Usuario> retornarUsuariosSMS() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Phill", "phill@email.com", "21999988887"));
        usuarios.add(new Usuario("Falcão", "falcao@email.com", "21888887777"));
        usuarios.add(new Usuario("Lauro", "lauro@email.com", "24999988887"));

        return usuarios;
    }
}
