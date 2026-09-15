package cliente;

import computador.Computador;

public class Cliente {

    private String nome;
    private long cpf;

    private Computador[] computadores = new Computador[10];

    private int qtdComputadores = 0;

    public Cliente(String nomeCliente, long cpfCliente) {
        nome = nomeCliente;
        cpf = cpfCliente;
    }

    public void addComputador(Computador computador) {
        computadores[qtdComputadores] = computador;
        qtdComputadores++;
    }

    public float calculaTotalCompra() {

        float total = 0;

        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }

        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void mostraInfo() {

        System.out.println("\nCliente: " + nome);
        System.out.println("CPF: " + cpf);

        System.out.println("\nComputadores comprados:");

        for (int i = 0; i < qtdComputadores; i++) {
            computadores[i].mostraPCConfigs();
            System.out.println();
        }

        System.out.println("\nTotal da compra: R$" + calculaTotalCompra());
    }
}
