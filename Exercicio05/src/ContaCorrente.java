public class ContaCorrente {
    private int numConta;
    private String nomeCorrentista;
    private double saudo;

    public ContaCorrente(int numConta, String nomeCorrentista, double saudo){
        this.numConta  = numConta;
        this.nomeCorrentista= nomeCorrentista;
        this.saudo = saudo;
    }

    public void alterarNome(String nome){
        this.nomeCorrentista = nome;
    }

    public void deposito(double value){
        this.saudo += value;
    }

    public void saque (double value){
        this.saudo -= value;
    }

    public String nome(){
        return this.nomeCorrentista;
    }

    public Double saudo(){
        return this.saudo;
    }
}