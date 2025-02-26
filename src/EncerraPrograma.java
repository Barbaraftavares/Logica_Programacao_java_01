import java.util.Scanner;

public class EncerraPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("número inválido.");
            } else if (numero == 10) {
                System.out.println("Você digitou o valor correto: " + numero);
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Você digitou: " + numero);
            }
        } while (numero != 10);
    }
}