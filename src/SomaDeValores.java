public class SomaDeValores {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}