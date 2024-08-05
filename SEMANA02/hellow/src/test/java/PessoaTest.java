import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    public void testAtributos() {
        Pessoa pessoa = new Pessoa("João", 25, "joao@example.com");

        // Testa os atributos diretamente
        assertEquals("João", pessoa.nome);
        assertEquals(25, pessoa.idade);
        assertEquals("joao@example.com", pessoa.email);

        // Modifica os atributos diretamente
        pessoa.nome = "Maria";
        pessoa.idade = 30;
        pessoa.email = "maria@example.com";

        assertEquals("Maria", pessoa.nome);
        assertEquals(30, pessoa.idade);
        assertEquals("maria@example.com", pessoa.email);
    }

    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa("Ana", 22, "ana@example.com");
        String expectedString = "Pessoa{nome='Ana', idade=22, email='ana@example.com'}";
        assertEquals(expectedString, pessoa.toString());
    }
}
