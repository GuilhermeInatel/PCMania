package computador;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nomeMemoria, int capacidadeMemoria) {
        nome = nomeMemoria;
        capacidade = capacidadeMemoria;
    }

    public void mostraInfo() {
        System.out.println(nome + " - " + capacidade + " GB");
    }
}