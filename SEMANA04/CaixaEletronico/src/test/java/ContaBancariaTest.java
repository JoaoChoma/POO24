import org.example.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContaBancariaTest {
    ContaBancaria conta = new ContaBancaria("João Silva", 123456, 1000.0);


    @Test
    public void testDepositar() {
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo(), "O saldo deve ser 1500 após o depósito.");
    }

    @Test
    public void testSacar() {
        conta.sacar(300.0);
        assertEquals(700.0, conta.getSaldo(), "O saldo deve ser 700 após o saque.");
    }

    @Test
    public void testSacarSaldoInsuficiente() {
        conta.sacar(1500.0);
        assertEquals(1000.0, conta.getSaldo(), "O saldo não deve mudar quando o saque é maior que o saldo.");
    }

    @Test
    public void testToString() {
        String expected = "ContaBancaria{titular='João Silva', numeroConta=123456, saldo=1000.0}";
        assertEquals(expected, conta.toString(), "A representação em string deve ser correta.");
    }

    @Test
    public void testEquals() {
        ContaBancaria outraConta = new ContaBancaria("Maria Oliveira", 123456, 500.0);
        assertTrue(conta.equals(outraConta), "Contas com o mesmo número devem ser iguais.");
    }

    @Test
    public void testHashCode() {
        ContaBancaria outraConta = new ContaBancaria("Maria Oliveira", 123456, 500.0);
        assertEquals(conta.hashCode(), outraConta.hashCode(), "O hashCode deve ser igual para contas com o mesmo número.");
    }
}
