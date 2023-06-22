public class App {
    public static void main(String[] args) throws Exception {
        Macaco macaco1 = new Macaco("Macaco 1");
        Macaco macaco2 = new Macaco("Macaco 2");

        macaco1.comer("Banana");
        macaco1.comer("Maçã");
        macaco1.comer("Laranja");

        macaco2.comer("Peixe");
        macaco2.comer("Carne");
        macaco2.comer("Arroz");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();
    }
}
