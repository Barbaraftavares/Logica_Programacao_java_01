import java.util.Scanner;

public class NotaFinalAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de Cálculo de Notas Finais");

        while (true) {
            System.out.print("Digite a primeira nota: ");
            float nota1 = (float) scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            float nota2 = (float) scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            float nota3 = (float) scanner.nextDouble();

            float mediaAluno = (nota1 + nota2 + nota3) / 3;

            String situacao = situacaoAluno(mediaAluno);

            System.out.printf("Média: %.2f%n", mediaAluno);
            System.out.println("Situação: " + situacao);

            System.out.print("Deseja calcular novamente? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    private static String situacaoAluno(float media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}