import java.util.Scanner;

public class MercadoCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Produto: ");
        String nome = scanner.next();

        System.out.print("Quantidade de itens: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço Produto: ");
        double preco = scanner.nextDouble();

        double total = preco * quantidade;
        double desconto = quantidade <= 10 ? 0 : quantidade <= 20 ? 0.1 : quantidade <= 50 ? 0.2 : 0.25;

        System.out.println("Quantidade de itens: " + quantidade);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Total a pagar: %.2f%n", total - (total * desconto));
    }
}