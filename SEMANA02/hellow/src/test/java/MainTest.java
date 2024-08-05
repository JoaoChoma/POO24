import org.example.Main;
import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        // Redireciona a saída padrão para capturar a saída do programa
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Executa o método main
        Main.main(new String[]{});

        // Verifica se a saída é "Hello world!"
        assertEquals("Hello world!\n", outContent.toString());

    }
}
