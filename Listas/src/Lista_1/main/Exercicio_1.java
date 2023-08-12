package Lista_1.main;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];

        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor original:");
        printArray(vetor);
        invertArray(vetor);
        System.out.println("Vetor invertido:");
        printArray(vetor);

        scanner.close();
    }
    public static void invertArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
