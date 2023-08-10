package Lista_1;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro prêmio da loteria federal (6 dígitos): ");
        long primeiroPremio = scanner.nextLong();

        System.out.print("Digite o segundo prêmio da loteria federal (6 dígitos): ");
        long segundoPremio = scanner.nextLong();
        scanner.close();
        long numeroVencedor = calcularNumeroVencedor(primeiroPremio, segundoPremio);

        System.out.println("Número vencedor da organização: " + numeroVencedor);
    }

    public static long calcularNumeroVencedor(long primeiroPremio, long segundoPremio) {
        long tresUltimosPrimeiro = primeiroPremio % 1000;
        long tresPrimeirosSegundo = segundoPremio / 100;

        System.out.println(tresPrimeirosSegundo*1000);

        long numeroVencedor = tresPrimeirosSegundo * 1000 + tresUltimosPrimeiro;
        return numeroVencedor;
    }
}
