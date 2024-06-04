import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.next();
        
        System.out.println("Digite o saldo do cliente:");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");    
    }
}
