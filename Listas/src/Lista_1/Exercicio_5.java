package Lista_1;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de disciplinas: ");
        int disciplinas = scanner.nextInt();

        System.out.print("Digite o total de horas disponíveis: ");
        int horasDisponiveis = scanner.nextInt();

        System.out.print("Digite o total de minutos disponíveis: ");
        int minutosDisponiveis = scanner.nextInt();

        studiePlans(disciplinas, horasDisponiveis, minutosDisponiveis);
    }
    public static void studiePlans(int disciplinas, int horas, int minutos) {
        double totalMinutos = horas * 60 + minutos;
        double minutosPorDisciplina = totalMinutos / disciplinas;
        //calcula tempo de pausa exceto pela ultima disciplina
        double minutosDePausa = (totalMinutos % disciplinas) / (disciplinas - 1);

        printStudiePlans(disciplinas, minutosPorDisciplina, minutosDePausa);
    }

    private static void printStudiePlans(double disciplinas, double minutosPorDisciplina, double minutosDePausa) {
        System.out.println("Plano de estudos:");
        for (int i = 1; i <= disciplinas; i++) {
            System.out.printf("Disciplina %d: %.0f minutos de estudo\n", i, minutosPorDisciplina);

            if (i < disciplinas) {
                System.out.printf("Pausa de %.2f minutos\n" , minutosDePausa);
            }
        }
    }
}
