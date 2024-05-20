package cargos;

public abstract class Cargos {
    private final Integer mes, ano;
    private final String nome;

    protected Cargos(String nome, String dataContratacao) {
        this.mes = Integer.valueOf(dataContratacao.split("/")[0]);
        this.ano = Integer.valueOf(dataContratacao.split("/")[1]);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    protected int anosDeServico(String data) {
        int anos = Integer.parseInt(data.split("/")[1]);
        int mes = Integer.parseInt(data.split("/")[0]);

        if (this.mes < mes) {
            return anos - this.ano - 1;
        }

        return anos - this.ano;
    }

    public abstract double salario(String data);

    public abstract double beneficios(String data);

    public double totalRecebido(String data) {
        return this.salario(data) + this.beneficios(data);
    }

}
