package Lista_1.main;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_11 {
    public static void main(String[] args) {
        try {
            String caminho = "C:\\Users\\Thinkpad\\Documents\\Universidade\\Programação Modular\\Teorico\\Listas\\src\\Lista_1\\maindatas.txt";
            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            int numDatas = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numDatas; i++) {
                String data = reader.readLine();

                if (isValidDate(data)) {
                    System.out.println("A data " + data + " é válida.");
                } else {
                    System.out.println("A data " + data + " é inválida.");
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isValidDate(String data) {
        if (data == null || !data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Formato inválido. Use o formato DD/MM/AAAA.");
            return false;
        }

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido. Deve estar entre 1 e 12.");
            return false;
        }

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[2] = 29; // Ano bissexto
        }

        if (dia < 1 || dia > diasPorMes[mes]) {
            System.out.println("Dia inválido para o mês especificado.");
            return false;
        }

        return true;
    }
}
