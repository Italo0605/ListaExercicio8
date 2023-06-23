public class Tamagotchi{
  public String nome;
  public int fome, saude, idade;

  public Tamagotchi(String nome, int fome, int saude, int idade) {
    this.nome = nome;
    this.fome = fome;
    this.saude = saude;
    this.idade = idade;
  }
  
  public void fornecerComida(int quantidadeComida) {
        this.fome -= quantidadeComida * 2; 
        if (fome < 0) {
            fome = 0;
        }
    }

  public void brincar(int tempoBrincadeira) {
    this.saude -= tempoBrincadeira * 3; 
      if (saude < 0) {
          saude = 0;
      }
    }

  public void alterarNome(String novoNome) {
    this.nome = novoNome;
  }

  public void alterarFome(int novaFome) {
    this.fome = novaFome;
  }

  public void alterarSaude(int novaSaude) {
    this.saude = novaSaude;
  }

  public void alterarIdade(int novaIdade) {
    this.idade = novaIdade;
  }

  public String retornarNome() {
    return this.nome;
  }

  public int retornarFome() {
    return this.fome;
  }

  public int retornarSaude() {
    return this.saude;
  }

  public int retornarIdade() {
    return this.idade;
  }

  public int retornarHumor() {
    return this.fome + this.saude;
  }
}