package org.example;

import org.example.controller.UsuarioController;
import org.example.view.UsuarioView;

public class Main {
    public static void main(String[] args) {

        UsuarioView usuarioView = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController(usuarioView);


        while (true){
            usuarioController.cadastrarUsuario();
        }


    }
}