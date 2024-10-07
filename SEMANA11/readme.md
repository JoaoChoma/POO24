# O que é ENUM?


- O ENUM em Java (abreviação de enumeration) é um tipo de dado especial que permite definir um conjunto de constantes fixas, representando valores predefinidos que não mudam. Ele é uma forma de organizar e limitar um grupo de valores possíveis que uma variável pode assumir. Cada constante em um ENUM é uma instância única de sua própria classe, e é usada principalmente quando há um conjunto restrito de opções ou estados que precisam ser representados.

public enum StatusPedido {
    NOVO, PREPARANDO, PRONTO, ENTREGUE;
}

# Para que Serve o ENUM?

- O ENUM serve para garantir que uma variável só possa assumir um conjunto limitado e predefinido de valores. Isso ajuda a evitar erros no código, melhora a legibilidade e organização, e oferece um controle mais rigoroso sobre os possíveis estados que uma variável pode ter.


# O que é o Tratamento de Exceções?

- O tratamento de exceções em Java é uma forma de lidar com erros ou condições inesperadas que ocorrem durante a execução de um programa. Em vez de deixar o programa falhar abruptamente, o tratamento de exceções permite que você capture e gerencie esses erros de maneira controlada.

- O bloco try-catch é a estrutura principal usada para capturar e tratar essas exceções. Ele permite que você "tente" (try) executar um bloco de código e, caso ocorra uma exceção (erro), você pode "capturá-la" (catch) e executar um código alternativo ou de recuperação.

try {
    // Código que pode lançar uma exceção
} catch (TipoDeExcecao e) {
    // Código que lida com a exceção
}

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;  // Isso lançará uma ArithmeticException (divisão por zero)
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }
    }
}