import java.util.Scanner;

public class BloqueioDeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean logado = false;

        while (!logado && tentativas < 3) {
            System.out.print("Digite o seu nome: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals("aluno") && senha.equals("segredo")) {
                System.out.println("Seja bem vindo ao programa, " + usuario + "!");
                logado = true;
            } else {
                tentativas++;
                System.out.println("usuário e/ou senha inválidos. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (tentativas == 3) {
            System.out.println("Excedeu o limite de três tentativas! Acesso Bloqueado.");
        }

        scanner.close();
    }
}
