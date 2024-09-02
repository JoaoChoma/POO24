package org.example;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente. Limite de cheque especial excedido.");
        }
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente");
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
