import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.print("Digite o valor do imóvel: ");
        double valorImovel = scanner.nextDouble();

        double comissao;
        if (valorImovel >= 50000) {
            comissao = 0.20;
        } else if (valorImovel >= 30000) {
            comissao = 0.15;
        } else {
            comissao = 0.10;
        }

        double totalComissao = valorImovel * comissao;

        System.out.println("Vendedor: " + vendedor);
        System.out.printf("Valor do Imóvel: R$%.2f%n", valorImovel);
        System.out.printf("Total da Comissão: R$%.2f%n", totalComissao);
    }
}