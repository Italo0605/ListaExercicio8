import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o canal inicial da televisão: ");
        int canalInicial = scanner.nextInt();

        System.out.print("Digite o volume inicial da televisão: ");
        int volumeInicial = scanner.nextInt();

        Televisao tv = new Televisao(canalInicial, volumeInicial);

        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());

        tv.aumentarVolume();
        tv.diminuirVolume();
        
        tv.alterarCanal(12);
        tv.alterarCanal(101);

    }
}
