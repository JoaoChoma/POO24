package org.example.controller;

import org.example.model.Usuario;
import org.example.view.UsuarioView;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> users = new ArrayList<>();
    private UsuarioView view;

    public UsuarioController(UsuarioView view) {
        this.view = view;
    }

    public void addUsuario(int id, String nome, int idade) {
        Usuario user = new Usuario(id, nome, idade);
        users.add(user);
        System.out.println("Usuario cadastrado com sucesso!");
        listarUsuarios(users);
    }

    public void listarUsuarios(List<Usuario> users) {
        view.imprimirTodos(users);
    }

    public void cadastrarUsuario(){
        addUsuario(view.getId(), view.getNome(), view.getIdade());
    }
}
