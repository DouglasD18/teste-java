package cargos;

public class Gerente extends Cargos {

    public Gerente(String nome, String dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double salario(String data) {
        int anos = super.anosDeServico(data);
        return 20000 + 3000 * anos;
    }

    @Override
    public double beneficios(String data) {
        return 0;
    }

}
