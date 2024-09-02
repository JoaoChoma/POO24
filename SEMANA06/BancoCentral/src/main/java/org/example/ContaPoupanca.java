package org.example;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaDeRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente. Não é permitido saldo negativo.");
        }
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaDeRendimento;
        System.out.println("Rendimento aplicado. Novo saldo: " + saldo);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Poupança");
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
}
