package org.example;

public class Main {
    public static void main(String[] args) {

        GerenciadorPedidos gerenciador = new GerenciadorPedidos();

        gerenciador.criarPedido(1, "Pizza Margherita");
        gerenciador.criarPedido(2, "Hambúrguer com batatas");
        gerenciador.criarPedido(3, "Coca-cola");

        gerenciador.atualizarStatusPedido(1, StatusPedido.PREPARANDO);
        gerenciador.atualizarStatusPedido(2, StatusPedido.PRONTO);
        gerenciador.atualizarStatusPedido(3, StatusPedido.ENTREGUE);

        gerenciador.listarPedidosPorStatus(StatusPedido.NOVO);
        gerenciador.listarPedidosPorStatus(StatusPedido.PRONTO);

        gerenciador.listarTodosPedidos();
    }
}