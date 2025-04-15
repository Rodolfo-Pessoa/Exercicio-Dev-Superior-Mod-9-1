import java.util.Scanner;
import java.util.Locale;
import Conta.Conta;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta c1 = new Conta();

        System.out.print("Informe o Nº da conta:");
            c1.setContaBanco(sc.nextInt());
        sc.nextLine();

        System.out.print("Informe o nome do cliente: ");
            c1.setNomeCliente(sc.nextLine());

        System.out.println("É o primeiro deposito? (y/n)");
            c1.setResposta(sc.nextLine());
    }
}