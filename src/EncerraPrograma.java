
import java.util.Scanner;

public class EncerraPrograma {
    public static void main(String[] args) {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        while (numero != 10) {
            System.out.print("Digite um valor: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            if (numero == 10) {
                System.out.println("Você digitou o valor correto: " + numero);
            }
        }
    }
}