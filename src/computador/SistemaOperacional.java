package computador;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nomeSistema, int tipoSistema) {
        nome = nomeSistema;
        tipo = tipoSistema;
    }

    public void mostraInfo() {
        System.out.println(nome + " (" + tipo + " bits)");
    }
}
