import java.util.Scanner;

public class ValoresImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int impar = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        for (int valor : valores) {
            if (valor % 2 != 0) {
                impar++;
            }
        }

        System.out.println("Quantidade de valores ímpares: " + impar);
    }
}