package Lista_1;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato DD/MM/AAAA: ");
        String dataInput = scanner.nextLine();

        if (isValidDate(dataInput)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
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
