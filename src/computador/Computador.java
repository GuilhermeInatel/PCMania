package computador;

public class Computador {

    private String marca;
    private float preco;

    private SistemaOperacional sistema;

    private HardwareBasico[] hardwareBasico = new HardwareBasico[3];

    private MemoriaUSB memoriaUSB;

    public Computador(String marcaComputador, float precoComputador) {
        marca = marcaComputador;
        preco = precoComputador;
    }

    public void addHardwareBasico(HardwareBasico hb, int posicao) {
        hardwareBasico[posicao] = hb;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void setSistema(SistemaOperacional tipoSistema) {
        sistema = tipoSistema;
    }

    public void mostraPCConfigs() {

        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$" + preco);

        System.out.println("Hardware:");

        for (int i = 0; i < hardwareBasico.length; i++) {
            hardwareBasico[i].mostraInfo();
        }

        System.out.print("Sistema Operacional: ");
        sistema.mostraInfo();

        System.out.print("Acompanha: ");
        memoriaUSB.mostraInfo();
    }
}
