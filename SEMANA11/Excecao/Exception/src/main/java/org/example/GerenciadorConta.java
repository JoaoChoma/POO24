package org.example;

import org.example.exception.*;

public class GerenciadorConta {

    // Método para exibir o saldo de uma conta
    public void exibirSaldo(ContaBancaria conta) {
        System.out.println(conta);
    }

    // Método para realizar um depósito em uma conta
    public void realizarDeposito(ContaBancaria conta, double valor) {
        try {
            conta.depositar(valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para realizar um saque de uma conta
    public void realizarSaque(ContaBancaria conta, double valor) {
        try {
            conta.sacar(valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para realizar uma transferência entre contas
    public void realizarTransferencia(ContaBancaria origem, ContaBancaria destino, double valor) {
        try {
            origem.transferir(destino, valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.getTitular() + " realizada com sucesso.");
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

