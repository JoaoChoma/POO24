package org.example;

// Implementação do pagamento por boleto
class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor);
        // Lógica para gerar o boleto
    }
}

