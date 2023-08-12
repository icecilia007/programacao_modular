package Lista_1.main;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetorOriginal = new int[tamanho];

        System.out.println("Digite os números inteiros:");

        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorSoma = calculateNeighborSum(vetorOriginal);

        System.out.println("Vetor original:");
        printArray(vetorOriginal);
        System.out.println("Vetor com soma de vizinhos:");
        printArray(vetorSoma);

        scanner.close();
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
