public class Quadrado {
    private double tamanhoLado;

    public Quadrado(Double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarValorLado(double valor){
        this.tamanhoLado= valor;
    }
    public Double getTamanhoLado(){
        return this.tamanhoLado;
    }
    public double calcularArea(){
        return this.tamanhoLado*this.tamanhoLado;
    }
}
