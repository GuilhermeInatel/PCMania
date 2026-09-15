package computador;

public class HardwareBasico {

    private String nome;
    private int capacidade;

    public HardwareBasico(String nomeHardware, int capacidadeHardware) {
        nome = nomeHardware;
        capacidade = capacidadeHardware;
    }

    public void mostraInfo() {
        System.out.println(nome + ": " + capacidade);
    }
}
