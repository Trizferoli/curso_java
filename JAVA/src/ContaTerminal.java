import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual a sua agência?");
        String agency = scanner.next();

        System.out.println("Qual o número?");
        int number = scanner.nextInt();
        
        System.out.println("Qual o seu nome?");
        String clientName = scanner.next();
        
        System.out.println("Qual o seu saldo?");
        Double balance = scanner.nextDouble();

        scanner.close();
        System.out.print(createWelcomeMessage(number, agency, clientName, balance));
    }

    public static String createWelcomeMessage(int number, String agency, String clientName, Double balance) {
        String message = "Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta "+ number+ " e seu saldo "+ balance + " já está disponível para saque.";
        return message;
    }
}
