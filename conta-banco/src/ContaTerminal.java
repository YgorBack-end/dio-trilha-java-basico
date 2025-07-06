import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: "); 
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numero da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é de R$" + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();



    }
}
