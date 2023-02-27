import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: " );

        int agencia = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite o número da Conta: " );
        String conta = sc.nextLine();

        System.out.println("Por favor, digite o seu nome completo: " );
        String nome = sc.nextLine();

        System.out.println("Por favor, valor do deposito: " );
        double saldo = Double.parseDouble(sc.nextLine());


        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta + " e seu saldo de  " + new DecimalFormat("#,##0.00").format(saldo) + " já está disponível para saque.");
    }
}
