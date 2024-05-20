package cargos;

import java.util.HashMap;

public class Vendedor extends Cargos {

    private final HashMap<String, Double> registroDeVendas;

    public Vendedor(String nome, String dataContratacao, HashMap<String, Double> registroDeVendas) {
        super(nome, dataContratacao);
        this.registroDeVendas = registroDeVendas;
    }

    @Override
    public double salario(String data) {
        int anos = super.anosDeServico(data);
        return 12000 + 1800 * anos;
    }

    @Override
    public double beneficios(String data) {
        return this.registroDeVendas.get(data) * .3;
    }

}
