import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        double valorInicial = Double.parseDouble(scanner.nextLine());
        double taxaJuros = Double.parseDouble(scanner.nextLine());
        int periodo = Integer.parseInt(scanner.nextLine());

        double valorFinal = valorInicial;

        // Iterar, baseado no período em anos, para cálculo do valorFinal com os juros compostos.
        for (int i = 1; i <= periodo; i++) {
            valorFinal += valorFinal * taxaJuros; // Calcula o valor dos juros compostos
        }

        System.out.println("Valor final do investimento: R$ " + String.format("%.2f", valorFinal));
    }
}
