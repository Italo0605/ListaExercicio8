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
        this.idade +=anos;
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
        String retorno;
        switch (atributo) {
            case "idade":
                retorno = String.valueOf(this.idade);
                break;
            case "nome":
                retorno = this.nome;
                break;
            case "peso":
                retorno = String.valueOf(this.peso);
                break;
            case "altura":
                retorno = String.valueOf(this.altura);
                break;
            default:
                retorno = "por favor escreva o nome do atibuto em minusculo e sem acentos!";
                break;
        }
        return retorno;
    }
}
