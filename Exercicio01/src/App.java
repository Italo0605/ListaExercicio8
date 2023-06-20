public class App {
    public static void main(String[] args) throws Exception {
        Bola bola = new Bola("Azul","3.2","borracha");
        System.out.println("Cor da bola: "+bola.mostraCor());
        bola.trocaCor("Verde");
        System.out.println("Nova cor: "+bola.mostraCor());
    }
}
