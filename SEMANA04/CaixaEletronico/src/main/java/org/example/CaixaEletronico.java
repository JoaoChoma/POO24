package org.example;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("João Silva", 123456, 1000.0);

        // Loop para simular operações no caixa eletrônico
        int opcao = 0;
        do {
            System.out.println("\n--- Caixa Eletrônico ---");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Depositar Dinheiro");
            System.out.println("3. Sacar Dinheiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Caixa Eletrônico!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
