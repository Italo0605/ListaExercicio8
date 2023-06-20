import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe as medidas do local:");
        System.out.print("Lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Lado B: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Informe o tamanho do piso: ");
        double tamanhoPiso = scanner.nextDouble();
        System.out.print("Informe o tamanho do rodapé: ");
        double tamanhoRodape = scanner.nextDouble();
        
        Quadrado piso = new Quadrado(tamanhoPiso);
        Quadrado rodape = new Quadrado(tamanhoRodape);
        Retangulo retangulo = new Retangulo(ladoA, ladoB);
        
        
        double quantidadePisos = retangulo.calcularArea() / piso.calcularArea();
        double quantidadeRodapes = retangulo.perimetro() / piso.perimetro();
        
        System.out.printf("\nQuantidade de pisos necessários: %.2f\n", quantidadePisos);
        System.out.printf("Quantidade de rodapés necessários: %.2f\n", quantidadeRodapes);
        
        scanner.close();
    }
}
