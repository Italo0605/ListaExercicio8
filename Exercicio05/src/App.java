import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor digite o seu saudo: ");
        Double saudo = scanner.nextDouble();

        System.out.println("Por favor digite o numero da sua conta: ");
        int numConta = scanner.nextInt();


        ContaCorrente conta = new ContaCorrente(numConta, nome, saudo);
        System.out.println("Nome Correntista: "+conta.nome());
        System.out.println("Saudo: "+conta.saudo());

        conta.deposito(10);
        System.out.println("Saudo: "+conta.saudo());

        conta.saque(3);
        System.out.println("Saudo: "+conta.saudo());
        
        scanner.close();
    }
}
