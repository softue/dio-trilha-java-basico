import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        sc.useDelimiter(System.getProperty("line.separator"));
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Agência: ");
        int agencia = sc.nextInt();

        System.out.print("Conta: ");
        int conta = sc.nextInt();
        
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        String mensagem = "\nOlá, [Nome Cliente]. Obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo de R$ [Saldo] já está disponível para saque.\n";
        mensagem = mensagem
                        .replace("[Nome Cliente]", nome)
                        .replace("[Agencia]", Integer.toString(agencia))
                        .replace("[Numero]", Integer.toString(conta))
                        .replace("[Saldo]", Double.toString(saldo));

        System.out.println(mensagem);

        sc.close();
    }
}
