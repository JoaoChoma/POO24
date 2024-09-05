package org.example;

class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento por Cartão de Crédito no valor de R$" + valor);
        // Lógica para processar o pagamento via cartão de crédito
    }
}

