package br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.subscriber.impl;

import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.dao.UsuarioDAO;
import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.model.Usuario;
import br.com.thegabrielfalcao.designpatterns.observer.gabrielfalcao.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class EmailNotifier implements Subscriber {

    List<Usuario> usuarios = new UsuarioDAO().retornarUsuariosEmail();

    @Override
    public void notificar() {
        usuarios.forEach((usuario) -> {
            System.out.println("Enviando e-mail para usuário do feed: " + usuario.getNome());
        });
    }
}
