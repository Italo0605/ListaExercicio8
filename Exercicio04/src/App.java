public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Ítalo", 65.00, 1.80, 18);

        System.out.println(pessoa.getData("idade"));
        System.out.println(pessoa.getData("altura"));

        pessoa.envelhecer(1);
        System.out.println(pessoa.getData("idade"));
        System.out.println(pessoa.getData("altura"));

    }
}
