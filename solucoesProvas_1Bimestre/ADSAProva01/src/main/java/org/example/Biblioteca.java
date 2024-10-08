package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Midia> catalogo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        catalogo.add(midia);
        System.out.println(midia.getTitulo() + " foi adicionada ao catálogo.");
    }

    public void removerMidia(Midia midia) {
        catalogo.remove(midia);
        System.out.println(midia.getTitulo() + " foi removida do catálogo.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " registrado.");
    }

    public Midia buscarMidia(String titulo) {
        for (Midia midia : catalogo) {
            if (midia.getTitulo().equalsIgnoreCase(titulo) && !midia.isEmprestado()) {
                return midia;
            }
        }
        return null;
    }
}
