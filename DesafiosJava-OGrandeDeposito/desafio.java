import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = 0.0; // Inicializa o saldo com zero

        while (true) {
            double valor = Double.parseDouble(scanner.nextLine());

            if (valor > 0) {
                saldoAtual += valor; // Adiciona o valor ao saldo atual
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
                break; // Sai do loop após um valor válido ser informado.
            } else if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
                break;
            } else {
                System.out.println("Encerrando o programa...");
                break; // Sai do loop quando o usuário digita zero ou valor negativo.
            }
        }
    }
}
