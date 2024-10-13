package org.example;

import java.security.SecureRandom;
import java.util.Random;

public class GeradorDeSenhas {
    private String letrasMinusculas;
    private String letrasMaiusculas;
    private String numeros;
    private String simbolos;

    private Random random;

    public GeradorDeSenhas() {
        this.letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        this.letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.numeros = "0123456789";
        this.simbolos = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
        this.random = new Random();
    }

    public String gerarSenha(int tamanho, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        String caracteresPermitidos = "";

        if(tamanho > 0) {
            if (incluirMinusculas) {
                caracteresPermitidos += letrasMinusculas;
            }
            if (incluirMaiusculas) {
                caracteresPermitidos += letrasMaiusculas;
            }
            if (incluirNumeros) {
                caracteresPermitidos += numeros;
            }
            if (incluirSimbolos) {
                caracteresPermitidos += simbolos;
            }
        }else{
            System.out.println("Tamanho invalido");
        }

        String senha = "";

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            senha += caracteresPermitidos.charAt(index);
        }


        return senha;
    }
}

