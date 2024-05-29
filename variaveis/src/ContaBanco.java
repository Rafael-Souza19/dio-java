import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá seja bem vindo, por favor digite as informações a seguir: \n");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência ! \n");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta ! \n");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente ! \n");
        String cliente = scanner.next();
        double saldo = 133.7;

        System.out.println("Olá "+ cliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é de " + saldo + " Reais. Já disponível para saque");


    }
}
