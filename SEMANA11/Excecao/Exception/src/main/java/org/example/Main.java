package org.example;

public class Main {
    public static void main(String[] args) {

                GerenciadorConta gerenciador = new GerenciadorConta();


                ContaBancaria contaJoao = new ContaBancaria("João");
                ContaBancaria contaMaria = new ContaBancaria("Maria");


                gerenciador.exibirSaldo(contaJoao);
                gerenciador.exibirSaldo(contaMaria);

                // operações
                gerenciador.realizarDeposito(contaJoao, 1000);
                gerenciador.realizarSaque(contaJoao, 300);
                gerenciador.realizarTransferencia(contaJoao, contaMaria, 200);

                // exceções
                gerenciador.realizarSaque(contaJoao, 1000);  // saldo insuficiente
                gerenciador.realizarDeposito(contaMaria, -50);  //  valor inválido


                gerenciador.exibirSaldo(contaJoao);
                gerenciador.exibirSaldo(contaMaria);
            }
        }
