package org.example;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345-6", 1000.0, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("78901-2", 2000.0, 0.03);

        // Operações com a Conta Corrente
        contaCorrente.exibirTipoConta();
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1300.0);
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
        contaCorrente.sacar(300.0); // Tentativa de saque além do limite

        // Operações com a Conta Poupança
        contaPoupanca.exibirTipoConta();
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());
        contaPoupanca.aplicarRendimento();
        contaPoupanca.sacar(500.0);
        System.out.println("Saldo após saque: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(3000.0); // Tentativa de saque além do saldo
    }
}

