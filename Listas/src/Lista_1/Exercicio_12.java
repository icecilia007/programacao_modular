package Lista_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_12 {
    public static void main(String[] args) {
        try {
            String caminho = "C:\\Users\\Thinkpad\\Documents\\Universidade\\Programação Modular\\Teorico\\Listas\\src\\Lista_1\\frases.txt";
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            String linha;

            while ((linha = reader.readLine()) != null && !linha.equalsIgnoreCase("fim")) {
                String fraseInvertida = reverseString(linha);
                System.out.println("Frase original: " + linha);
                System.out.println("Frase invertida: " + fraseInvertida);
            }

            System.out.println("Programa encerrado.");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}

