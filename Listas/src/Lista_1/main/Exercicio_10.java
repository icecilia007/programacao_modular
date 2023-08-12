package Lista_1.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_10 {

    public static void main(String[] args) {
        try {
            String caminho = "C:\\Users\\Thinkpad\\Documents\\Universidade\\Programação Modular\\Teorico\\Listas\\src\\Lista_1\\main\\numeros.txt";
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] numerosString = linha.split(";");
                int[] vetorOriginal = new int[numerosString.length];

                for (int i = 0; i < numerosString.length; i++) {
                    vetorOriginal[i] = Integer.parseInt(numerosString[i]);
                }

                int[] vetorSoma = calculateNeighborSum(vetorOriginal);

                System.out.println("Vetor original:");
                printArray(vetorOriginal);
                System.out.println("Vetor com soma de vizinhos:");
                printArray(vetorSoma);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] calculateNeighborSum(int[] array) {
        int tamanho = array.length;
        int[] vetorSoma = new int[tamanho % 2 == 0 ? tamanho / 2 : tamanho / 2 + 1];

        for (int i = 0; i < tamanho; i += 2) {
            vetorSoma[i / 2] = array[i] + (i + 1 < tamanho ? array[i + 1] : array[i]);
        }

        return vetorSoma;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
