import java.util.Scanner;

public class ProgramaMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha a bebida (cerveja, água ou refrigerante): ");
        String bebida = scanner.next().toLowerCase();

        if (bebida.equals("cerveja")) {
            System.out.print("Qual a sua idade? ");
            int idade = scanner.nextInt();
            System.out.println(idade >= 18 ? "compra efetuada com sucesso" : "compra negada");
        } else if (bebida.equals("agua") || bebida.equals("refrigerante")) {
            System.out.println("compra efetuada com sucesso");
        } else {
            System.out.println("opção de bebida inválida");
        }
    }
}
