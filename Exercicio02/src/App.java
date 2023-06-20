public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(3.0);

        System.out.println("valor lado:"+quadrado.getTamanhoLado());
        quadrado.mudarValorLado(5);
        System.out.println("valor lado:"+quadrado.getTamanhoLado());
        System.out.println("Área : " + quadrado.calcularArea());
    }
}
