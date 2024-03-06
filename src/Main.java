import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == num) {
            System.out.println("O número pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número não pertence à sequência de Fibonacci.");
        }
    }
}
