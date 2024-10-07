package org.example;

public class Main {
    public static void main(String[] args) {

                GerenciadorConta gerenciador = new GerenciadorConta();

                // Criando contas
                ContaBancaria contaJoao = new ContaBancaria("João");
                ContaBancaria contaMaria = new ContaBancaria("Maria");

                // Exibindo saldos iniciais
                gerenciador.exibirSaldo(contaJoao);
                gerenciador.exibirSaldo(contaMaria);

                // Realizando operações
                gerenciador.realizarDeposito(contaJoao, 1000);
                gerenciador.realizarSaque(contaJoao, 300);
                gerenciador.realizarTransferencia(contaJoao, contaMaria, 200);

                // Testando exceções
                gerenciador.realizarSaque(contaJoao, 1000);  // Deve lançar exceção de saldo insuficiente
                gerenciador.realizarDeposito(contaMaria, -50);  // Deve lançar exceção de valor inválido

                // Exibindo saldos finais
                gerenciador.exibirSaldo(contaJoao);
                gerenciador.exibirSaldo(contaMaria);
            }
        }
