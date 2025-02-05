import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Bem Vindo a criação de sua conta bancaria!");

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o Numero: ");
        int numero = scan.nextInt();

        System.out.printf("Digite a Agencia (4 digitos): ");
        String agencia = scan.next();

        System.out.printf("Digite o seu Nome: ");
        String nomeCliente = scan.next().toUpperCase();

        System.out.printf("Digite o seu Saldo: ");
        Double saldo = scan.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s-%s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia.substring(0, 3), agencia.substring(3), numero, saldo);

        scan.close();

    }
}
