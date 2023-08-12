package Lista_1.test;

import Lista_1.main.Exercicio_1;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Exercicio_1Test {
    //junit utilizado para teste
    @Test
    public void testInvertArray() {
        int[] inputArray = {4, 8, 15, 16, 23, 42};
        int[] expectedOutputArray = {42, 23, 16, 15, 8, 4};

        // Chamar o método a ser testado
        Exercicio_1.invertArray(inputArray);
        // Verificar se o array foi invertido corretamente
        assertArrayEquals(expectedOutputArray, inputArray);
    }
}
