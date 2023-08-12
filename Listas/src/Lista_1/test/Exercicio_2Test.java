package Lista_1.test;

import Lista_1.main.Exercicio_2;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Exercicio_2Test {

    @Test
    public void testCalculateNeighborSum() {
        int[] inputArray = {4, 8, 15, 16, 23, 42};
        int[] expectedOutputArray = {12, 31, 65};

        int[] result = Exercicio_2.calculateNeighborSum(inputArray);

        assertArrayEquals(expectedOutputArray, result);
    }

    @Test
    public void testCalculateNeighborSumWithOddSize() {
        int[] inputArray = {4, 8, 15, 16, 23};
        int[] expectedOutputArray = {12, 31, 46};

        int[] result =  Exercicio_2.calculateNeighborSum(inputArray);

        assertArrayEquals(expectedOutputArray, result);
    }
}
