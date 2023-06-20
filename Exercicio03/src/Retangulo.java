public class Retangulo {
    private double ladoA, ladoB;

    public Retangulo(Double ladoA, Double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudarValorLado(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public Double[] getTamanhoLado(){
        Double[] lados = {this.ladoA,this.ladoB};
        return lados;
    }
    public double calcularArea(){
        return this.ladoA*this.ladoB;
    }

    public double perimetro(){
        return (this.ladoA*2) + (this.ladoB *2);
    }
}
