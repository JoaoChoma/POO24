package org.example;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<Pedido> pedidos;

    public GerenciadorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(int id, String descricao) {
        Pedido pedido = new Pedido(id, descricao);
        pedidos.add(pedido);
        System.out.println("Pedido criado: " + pedido);
    }

    public void atualizarStatusPedido(int id, StatusPedido novoStatus) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                pedido.setStatus(novoStatus);
                System.out.println("Status atualizado para: " + pedido);
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void listarPedidosPorStatus(StatusPedido status) {
        System.out.println("\nPedidos com status: " + status.getDescricao());
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus() == status) {
                System.out.println(pedido);
            }
        }
    }

    public void listarTodosPedidos() {
        System.out.println("\nLista de todos os pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}

