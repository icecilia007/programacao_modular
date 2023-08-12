package Lista_1.main;
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite frases para serem invertidas (digite 'fim' para encerrar):");

        String frase = scanner.nextLine();

        while (!frase.equalsIgnoreCase("fim")) {
            System.out.println("Frase invertida: " + reverseString(frase));
            frase = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
