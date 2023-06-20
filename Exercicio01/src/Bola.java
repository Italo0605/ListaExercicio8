public class Bola {
    private String cor , circuferencia, material;

    public Bola(String cor, String circuferencia, String material) {
        this.cor = cor;
        this.circuferencia = circuferencia;
        this.material = material;
    }

    public void trocaCor(String newColor){
        this.cor = newColor;
    }

    public String mostraCor(){
        return cor;
    }
}
