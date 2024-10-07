package org.example;

import org.example.exception.SaldoInsuficienteException;
import org.example.exception.ValorInvalidoException;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor de depósito deve ser positivo.");
        }
        this.saldo += valor;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor de saque deve ser positivo.");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
        }
        this.saldo -= valor;
    }

    // Método para transferir dinheiro para outra conta
    public void transferir(ContaBancaria destino, double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: R$" + String.format("%.2f", saldo);
    }
}

