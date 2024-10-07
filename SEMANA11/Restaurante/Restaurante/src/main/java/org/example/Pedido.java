package org.example;

public class Pedido {
    private int id;
    private String descricao;
    private StatusPedido status;

    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = StatusPedido.NOVO;  // Status inicial é NOVO
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [ID=" + id + ", Descrição=" + descricao + ", Status=" + status.getDescricao() + "]";
    }
}

