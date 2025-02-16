import java.util.Scanner;

public class DivisaoDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor válido: ");
        float numero1 = scanner.nextFloat();

        float numero2;
        while (true) {
            System.out.print("Digite o segundo valor válido: ");
            numero2 = scanner.nextFloat();

            if (numero2 == 0) {
                System.out.println("Número inválido. Por favor, digite um valor diferente de zero.");
            } else {
                float divisao = numero1 / numero2;
                System.out.printf("%.2f / %.2f = resultado da divisão é: %.2f%n", numero1, numero2, divisao);
                break;
            }
        }

        scanner.close();
    }
}