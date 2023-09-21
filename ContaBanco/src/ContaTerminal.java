import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite sua Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo.");
        double saldo = scanner.nextDouble();
    
       System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
