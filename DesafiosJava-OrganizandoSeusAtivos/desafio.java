import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da quantidade de ativos
        int quantidadeAtivos = Integer.parseInt(scanner.nextLine());

        // Entrada dos tipos de ativos
        List<String> ativos = new ArrayList<>();
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        // Ordenar os ativos em ordem alfabética
        Collections.sort(ativos);

        // Imprimir a lista de ativos ordenada
        for (String codigoAtivo : ativos) {
            System.out.println(codigoAtivo);
        }
    }
}
