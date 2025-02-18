import java.util.Scanner;

public class BuscaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] valores = new String[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um nome " + (i + 1) + ": ");
            valores[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para buscar: ");
        String nome = scanner.nextLine();

        boolean achei = false;
        for (String valor : valores) {
            if (valor.equalsIgnoreCase(nome)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}