import cargos.Cargos;
import cargos.Vendedor;

import java.util.ArrayList;

public class Worker {

    public double totalMes(ArrayList<Cargos> funcionarios, String mesEAno) {
        double total = 0;

        for (Cargos funcionario : funcionarios) {
            total += funcionario.salario(mesEAno);
            total += funcionario.beneficios(mesEAno);
        }

        return total;
    }

    public double totalSalarioMes(ArrayList<Cargos> funcionarios, String mesEAno) {
        return funcionarios.stream().mapToDouble(funcionario -> funcionario.salario(mesEAno)).sum();
    }

    public double totalBeneficioMes(ArrayList<Cargos> funcionarios, String mesEAno) {
        return funcionarios.stream().mapToDouble(funcionario -> funcionario.beneficios(mesEAno)).sum();
    }

    public Cargos maisBemPago(ArrayList<Cargos> funcionarios, String mesEAno) {
        final Cargos[] theOne = {funcionarios.get(1)};

        funcionarios.forEach(funcionario -> {
            if (theOne[0].totalRecebido(mesEAno) < funcionario.totalRecebido(mesEAno)) {
                theOne[0] = funcionario;
            }
        });

        return theOne[0];
    }

    public Cargos maisBeneficios(ArrayList<Cargos> funcionarios, String mesEAno) {
        final Cargos[] theOne = {funcionarios.get(1)};

        funcionarios.forEach(funcionario -> {
            if (theOne[0].beneficios(mesEAno) < funcionario.beneficios(mesEAno)) {
                theOne[0] = funcionario;
            }
        });

        return theOne[0];
    }

    public Vendedor maisVendeu(ArrayList<Vendedor> vendedores, String mesEAno) {
        final Vendedor[] theOne = {vendedores.get(1)};

        vendedores.forEach(vendedor -> {
            if (theOne[0].beneficios(mesEAno) < vendedor.beneficios(mesEAno)) {
                theOne[0] = vendedor;
            }
        });

        return theOne[0];
    }

}
