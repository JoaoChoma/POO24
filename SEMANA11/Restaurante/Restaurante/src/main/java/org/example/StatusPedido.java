package org.example;

public enum StatusPedido {
    NOVO("Novo pedido recebido"),
    PREPARANDO("Pedido em preparação"),
    PRONTO("Pedido pronto para entrega"),
    ENTREGUE("Pedido entregue");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

