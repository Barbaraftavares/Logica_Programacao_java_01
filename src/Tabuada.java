import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite um valor entre 1 e 10: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 10) {
                valido = true;
            } else {
                System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
            }
        }

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}