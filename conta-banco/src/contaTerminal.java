     import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        // Consumir a nova linha pendente deixada pelo nextInt
        scanner.nextLine();
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();

        // Exibindo a mensagem final
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagem);
    }




}
