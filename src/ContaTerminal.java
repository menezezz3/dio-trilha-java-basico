import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e recebe o saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá " + nomeCliente +
                          ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                          ", conta " + numero +
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
