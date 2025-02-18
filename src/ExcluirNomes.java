import java.util.Arrays;

public class ExcluirNomes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Barbara", "Pedro", "Ana", "Vinicius", "Barbara", "Joao", "Pedro", "Rafael", "Isabella", "Matheus", "Laura", "Guilherme", "Sofia", "Vinicius", "Amanda", "Leonardo", "Gabriela"};

        System.out.println("Lista de nomes antiga: " + Arrays.toString(nomes));

        String[] novaLista = new String[nomes.length];
        int indice = 0;

        for (String nome : nomes) {
            boolean existe = false;
            for (String n : novaLista) {
                if (n != null && n.equals(nome)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                novaLista[indice++] = nome;
            }
        }

        String[] listaSemNulos = new String[indice];
        System.arraycopy(novaLista, 0, listaSemNulos, 0, indice);

        System.out.println("Nova lista: " + Arrays.toString(listaSemNulos));
    }
}