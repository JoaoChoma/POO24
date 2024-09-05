package org.example;

public class SistemaPagamento {
    public static void main(String[] args) {
        // Criando diferentes tipos de pagamento
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoBoleto = new Boleto();
        Pagamento pagamentoPix = new Pix();

        // Aplicando o polimorfismo para processar diferentes tipos de pagamentos
        processar(pagamentoCartao, 250.00);
        processar(pagamentoBoleto, 150.00);
        processar(pagamentoPix, 50.00);
    }

    // Método genérico que processa o pagamento, aplicando o polimorfismo
    public static void processar(Pagamento pagamento, double valor) {
        pagamento.processarPagamento(valor);
    }
}

