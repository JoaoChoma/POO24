package org.example;

class Pix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Pix no valor de R$" + valor);
        // Lógica para processar o pagamento via Pix
    }
}

