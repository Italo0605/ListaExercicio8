public class Pessoa {
    private String nome;
    private Double peso, altura;
    private int idade;

    public Pessoa(String nome, Double peso, Double altura, int idade){
        this.nome  = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public void envelhecer(int anos){
        this.idade -=anos;
        if(this.idade <= 21){
            this.altura+= 0.5;
        }
    }

    public void engordar(Double pesoSub){
        this.peso +=pesoSub;
    }

    public void emagrecer(Double pesoSoma){
        this.peso -=pesoSoma;
    }

    public void crescer(Double alturaSoma){
        this.altura +=alturaSoma;
    }

    public String getData(String atributo){
        switch (atributo) {
            case "idade":
                return String.format("%d",this.idade);
            case "nome":
                return String.format("%d", this.nome);
            case "peso":
                return String.format("%d", this.peso);
            case "altura":
                return String.format("%d%",this.altura);
            default:
                return "por favor escreva o nome do atibuto em minusco e sem acentos!";
        }
    }
}
