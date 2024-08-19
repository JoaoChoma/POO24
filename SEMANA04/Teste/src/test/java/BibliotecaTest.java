import org.example.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void testFluxoPrincipal() {
        // Criando objetos da classe Livro
        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", 2017);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 2008);

        // Verificando as informações dos livros
        assertEquals("Java: Como Programar", livro1.getTitulo());
        assertEquals("Deitel & Deitel", livro1.getAutor());
        assertEquals(2017, livro1.getAnoPublicacao());

        assertEquals("Clean Code", livro2.getTitulo());
        assertEquals("Robert C. Martin", livro2.getAutor());
        assertEquals(2008, livro2.getAnoPublicacao());

        // Emprestando o primeiro livro
        livro1.emprestar();
        assertFalse(livro1.isDisponivel());

        // Tentando emprestar o mesmo livro novamente
        livro1.emprestar();
        assertFalse(livro1.isDisponivel()); // Deve continuar indisponível

        // Devolvendo o livro
        livro1.devolver();
        assertTrue(livro1.isDisponivel());

        // Tentando emprestar o livro novamente
        livro1.emprestar();
        assertFalse(livro1.isDisponivel()); // Deve estar indisponível novamente
    }
}

