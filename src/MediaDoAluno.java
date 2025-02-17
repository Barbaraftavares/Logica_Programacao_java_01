import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a primeira nota: ");
            float nota1 = scanner.nextFloat();

            System.out.print("Digite a segunda nota: ");
            float nota2 = scanner.nextFloat();

            float media = (nota1 + nota2) / 2;
            String situacaoAluno = media >= 7 ? "Aprovado" : "Reprovado";

            System.out.println("Programa de Cálculo de Notas Finais");
            System.out.printf("\nMédia: %.2f%n", media);
            System.out.println("Situação: " + situacaoAluno);

            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            String resposta = scanner.next().toLowerCase();

            if (!resposta.equals("s")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}