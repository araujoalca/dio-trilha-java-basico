

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        conta = leitor.nextInt();
        leitor.nextLine(); // Consome a nova linha deixada pelo nextInt()

        System.out.println("Digite a agência: ");
        agencia = leitor.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = leitor.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = leitor.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(conta, agencia, nomeCliente, saldo);

        System.out.println("Olá, " + contaTerminal.getNomeCliente() + "! Obrigado por criar uma conta em nosso banco! Os dados da sua conta são:");

        System.out.println("Conta: " + contaTerminal.getNumero());
        System.out.println("Agência: " + contaTerminal.getAgencia());
        System.out.println("Nome do cliente: " + contaTerminal.getNomeCliente());
        System.out.println("Saldo: " + contaTerminal.getSaldo());

        leitor.close();
    }
}
