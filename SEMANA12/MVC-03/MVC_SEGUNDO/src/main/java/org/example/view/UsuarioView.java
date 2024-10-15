package org.example.view;

import org.example.controller.UsuarioController;
import org.example.model.Usuario;

import java.util.List;
import java.util.Scanner;

public class UsuarioView {

    Scanner sc = new Scanner(System.in);

    public void imprimirUsuario(Usuario user) {
        System.out.println("User: ");
        System.out.println("Name: " + user.getNome());
        System.out.println("Age: " + user.getIdade());
    }

    public void imprimirTodos(List<Usuario> users) {
        System.out.println("\n-- User List --");
        for (Usuario user : users) {
            System.out.println(user);
        }
    }

    public int getId(){
        System.out.println("ID: ");
        return sc.nextInt();
    }

    public String getNome(){
        System.out.println("Nome: ");
        return sc.next();
    }

    public int getIdade(){
        System.out.println("Idade: ");
        return sc.nextInt();
    }

}
