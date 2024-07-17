
import java.util.Scanner;
import models.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("*** BancoTerminal ***");
        Conta novaConta = cadastrarNovaConta();
        exibirInformacaoConta(novaConta);
    }

    private static Conta cadastrarNovaConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite a agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        Conta novaConta = new Conta(numeroConta, agencia, nomeCliente);
        novaConta.deposito(saldo);

        return novaConta;
    }

    private static void exibirInformacaoConta(Conta conta) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getConta(), String.format("%.2f", conta.getSaldo()));
    }
}
