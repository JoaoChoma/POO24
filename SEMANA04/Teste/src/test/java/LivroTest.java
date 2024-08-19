import org.example.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    private Livro livro;

    @BeforeEach
    void setUp() {
        // Inicializa um objeto Livro antes de cada teste
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    }

    @Test
    void testGetTitulo() {
        // Verifica se o título é retornado corretamente
        assertEquals("O Senhor dos Anéis", livro.getTitulo());
    }

    @Test
    void testGetAutor() {
        // Verifica se o autor é retornado corretamente
        assertEquals("J.R.R. Tolkien", livro.getAutor());
    }

    @Test
    void testGetAnoPublicacao() {
        // Verifica se o ano de publicação é retornado corretamente
        assertEquals(1954, livro.getAnoPublicacao());
    }

    @Test
    void testIsDisponivel() {
        // Verifica se o livro está disponível inicialmente
        assertTrue(livro.isDisponivel());
    }

    @Test
    void testEmprestarDisponivel() {
        // Verifica se o livro pode ser emprestado quando está disponível
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    void testEmprestarIndisponivel() {
        // Configura o livro como emprestado
        livro.emprestar();
        // Tenta emprestar novamente e verifica se continua indisponível
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    void testDevolver() {
        // Empresta o livro e depois devolve
        livro.emprestar();
        livro.devolver();
        // Verifica se o livro voltou a estar disponível
        assertTrue(livro.isDisponivel());
    }

    @Test
    void testToString() {
        // Verifica se o método toString retorna a string correta
        String expected = "Livro{titulo='O Senhor dos Anéis', autor='J.R.R. Tolkien', anoPublicacao=1954, disponivel=true}";
        assertEquals(expected, livro.toString());
    }
}
