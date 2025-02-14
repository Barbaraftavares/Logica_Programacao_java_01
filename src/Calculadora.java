
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        System.out.print("Digite o primeiro valor: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int numero2 = scanner.nextInt();

        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else if (operacao.equals("/")) {
            if (numero2 != 0) {
                System.out.println("Resultado: " + ((double) numero1 / numero2));
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operação inválida.");
        }
    }
}