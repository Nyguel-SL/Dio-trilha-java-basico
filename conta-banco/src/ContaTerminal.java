import java.util.Scanner;

public class ContaTerminal {
    public static void  main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua numero de sua agência:");
        int NumberAgence = scanner.nextInt();
        System.out.println("Informe sua agencia:");
        var agence = scanner .next();
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe seu saldo:");
        float Saldo = scanner .nextFloat();
        System.out.printf("olá %s, obrigaddo por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo é %s \n", name, agence,NumberAgence, Saldo);
    }    
}   
