public class Televisao {
    private int canal;
    private int volume;

    public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void alterarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para " + this.canal);
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            this.volume++;
            System.out.println("Volume aumentado para " + this.volume);
        } else {
            System.out.println("Volume máximo alcançado!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            this.volume--;
            System.out.println("Volume diminuído para " + this.volume);
        } else {
            System.out.println("Volume mínimo alcançado!");
        }
    }

    public int getCanal() {
        return this.canal;
    }
    public int getVolume() {
        return this.volume;
    }
}