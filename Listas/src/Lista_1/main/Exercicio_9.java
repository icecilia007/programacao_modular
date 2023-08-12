package Lista_1.main;

import java.util.Scanner;

public class Exercicio_9 {
    //2024 é um ano bissexto
    public static int[] diasPorMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] nomesDiasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato DD/MM: ");
        String dataInput = scanner.nextLine();
        isValidDate(dataInput);

        String[] partes = dataInput.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        scanner.close();
        String diaDaSemana = calcularDiaDaSemana2024(dia, mes);

        System.out.println("Em 2024, a data " + dataInput + " será um(a) " + diaDaSemana + ".");
    }

    public static boolean isValidDate(String data) {
        if (data == null || !data.matches("\\d{2}/\\d{2}")) {
            System.out.println("Formato inválido. Use o formato DD/MM.");
            return false;
        }

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido. Deve estar entre 1 e 12.");
            return false;
        }

        if (dia < 1 || dia > diasPorMes[mes]) {
            System.out.println("Dia inválido para o mês especificado.");
            return false;
        }
        return true;
    }

    public static String calcularDiaDaSemana2024(int dia, int mes) {
        int diasTotais = 0;
        for (int i = 1; i < mes; i++) {
            diasTotais += diasPorMes[i];
        }
        diasTotais += dia;

        int diaDaSemana = diasTotais % 7; // por semana

        return nomesDiasDaSemana[diaDaSemana];
    }
}
