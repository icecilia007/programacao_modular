package Lista_1;

public class Exercicio_3 {
    public static void main(String[] args) {
        printFilledRectangle(5, 3, 'X');
        System.out.println();
        printHollowRectangle(5, 3, 'X');
    }

    public static void printFilledRectangle(int x, int y, char character) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void printHollowRectangle(int x, int y, char character) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == y - 1 || j == 0 || j == x - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
