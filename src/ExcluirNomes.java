import java.util.*;

public class ExcluirNomes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Barbara", "Pedro", "Ana", "Vinicius", "Barbara", "Joao", "Pedro", "Rafael", "Isabella", "Matheus", "Laura", "Guilherme", "Sofia", "Vinicius", "Amanda", "Leonardo", "Gabriela"};

        System.out.println("Lista antiga: " + Arrays.toString(nomes));

        Set<String> novaLista = new HashSet<>(Arrays.asList(nomes));

        System.out.println("Nova lista: " + novaLista);
    }
}