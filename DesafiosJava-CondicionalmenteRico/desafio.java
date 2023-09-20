import java.util.Scanner;

public class Main {
    // Função para realizar o saque
    public static SaqueResult realizarSaque(int saldoDisponivel, int valorSaque) {
        if (valorSaque <= saldoDisponivel) {
            saldoDisponivel -= valorSaque;
            return new SaqueResult(true, saldoDisponivel);
        } else {
            return new SaqueResult(false, saldoDisponivel);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        int saldoTotal = Integer.parseInt(scanner.nextLine());
        int valorSaque = Integer.parseInt(scanner.nextLine());

        // Realizar o saque
        SaqueResult resultadoSaque = realizarSaque(saldoTotal, valorSaque);

        // Condições para impressão da saída
        if (resultadoSaque.isSucesso()) {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + resultadoSaque.getNovoSaldo());
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}

class SaqueResult {
    private boolean sucesso;
    private int novoSaldo;

    public SaqueResult(boolean sucesso, int novoSaldo) {
        this.sucesso = sucesso;
        this.novoSaldo = novoSaldo;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public int getNovoSaldo() {
        return novoSaldo;
    }
}
