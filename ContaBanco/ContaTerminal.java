import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite sua conta: ");
        String conta = sc.nextLine();
        System.out.println("digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta no nosso banco! Sua agência é "+agencia+", conta "+conta+", e seu saldo "+saldo+" já está disponível para saque.");
    }
}
