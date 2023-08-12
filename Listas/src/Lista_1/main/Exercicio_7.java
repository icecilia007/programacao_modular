package Lista_1.main;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 2 dígitos: ");
        int numero = scanner.nextInt();
        scanner.close();
        int resultado = multiplicacaoPorOnze(numero);

        System.out.println("Resultado: " + resultado);
    }

    public static int multiplicacaoPorOnze(int numero) {
        int digito1 = numero / 10;
        int digito2 = numero % 10;
        int somaDigitos = digito1 + digito2;
        int vaiUm = somaDigitos / 10;
        int resultado = 0;

        if(vaiUm!=0) resultado = digito1 * 100 + vaiUm * 10 + digito2;
        resultado = digito1 * 100 + (digito1 + digito2) * 10 + digito2;

        return resultado;
    }
}
