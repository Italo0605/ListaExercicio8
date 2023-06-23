public class App {
    public static void main(String[] args) throws Exception {
    Tamagotchi tamagushi = new Tamagotchi("Meu Tamagushi", 5, 7, 2);

        System.out.println("Nome: " + tamagushi.retornarNome());
        System.out.println("Fome: " + tamagushi.retornarFome());
        System.out.println("Saúde: " + tamagushi.retornarSaude());
        System.out.println("Idade: " + tamagushi.retornarIdade());
        System.out.println("Humor: " + tamagushi.retornarHumor());

        tamagushi.alterarFome(3);
        tamagushi.alterarSaude(9);

        System.out.println("Nome: " + tamagushi.retornarNome());
        System.out.println("Fome: " + tamagushi.retornarFome());
        System.out.println("Saúde: " + tamagushi.retornarSaude());
        System.out.println("Idade: " + tamagushi.retornarIdade());
        System.out.println("Humor: " + tamagushi.retornarHumor());
    }
}
