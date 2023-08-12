package Lista_1.test;

import Lista_1.main.Exercicio_9;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercicio_9Test {

    @Test
    public void testCalcularDiaDaSemana() {
        assertEquals("Segunda-feira", Exercicio_9.calcularDiaDaSemana2024(1, 1));
        assertEquals("Terça-feira", Exercicio_9.calcularDiaDaSemana2024(2, 1));
        assertEquals("Quarta-feira", Exercicio_9.calcularDiaDaSemana2024(3, 1));
    }
}
