package cargos;

public class Secretario extends Cargos {

    public Secretario(String nome, String dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double salario(String data) {
        int anos = super.anosDeServico(data);
        return 7000 + 1000 * anos;
    }

    @Override
    public double beneficios(String data) {
        return this.salario(data) * .2;
    }

}
