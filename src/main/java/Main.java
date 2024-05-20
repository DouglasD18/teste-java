import cargos.Cargos;
import cargos.Gerente;
import cargos.Secretario;
import cargos.Vendedor;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cargos> funcionarios = new ArrayList<>();
        ArrayList<Cargos> funcionariosComBeneficios = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        Secretario jorge = new Secretario("Jorge Carvalho", "01/2018");
        Secretario maria = new Secretario("Maria Souza", "12/2015");
        HashMap<String, Double> registroDeVendasAna = new HashMap<>();
        registroDeVendasAna.put("12/2021", 5200.00);
        registroDeVendasAna.put("01/2022", 4000.00);
        registroDeVendasAna.put("02/2022", 4200.00);
        registroDeVendasAna.put("03/2022", 5850.00);
        registroDeVendasAna.put("04/2022", 7000.00);
        Vendedor ana = new Vendedor("Ana Silva", "12/2021", registroDeVendasAna);
        HashMap<String, Double> registroDeVendasJoao = new HashMap<>();
        registroDeVendasJoao.put("12/2021", 3400.00);
        registroDeVendasJoao.put("01/2022", 7700.00);
        registroDeVendasJoao.put("02/2022", 5000.00);
        registroDeVendasJoao.put("03/2022", 5900.00);
        registroDeVendasJoao.put("04/2022", 6500.00);
        Vendedor joao = new Vendedor("João Mendes", "12/2021", registroDeVendasJoao);
        Gerente juliana = new Gerente("Juliana Alves", "07/2017");
        Gerente bento = new Gerente("Bento Albino", "03/2014");
        funcionarios.add(jorge);
        funcionarios.add(maria);
        funcionarios.add(ana);
        funcionarios.add(joao);
        funcionarios.add(juliana);
        funcionarios.add(bento);
        funcionariosComBeneficios.add(jorge);
        funcionariosComBeneficios.add(maria);
        funcionariosComBeneficios.add(ana);
        funcionariosComBeneficios.add(joao);
        vendedores.add(ana);
        vendedores.add(joao);

        Worker worker = new Worker();
        double totalMes = worker.totalMes(funcionarios, "12/2021");
        double totalSalarioMes = worker.totalSalarioMes(funcionarios, "12/2021");
        double totalBeneficioPago = worker.totalBeneficioMes(funcionariosComBeneficios, "12/2021");
        Cargos maisBemPago = worker.maisBemPago(funcionarios, "12/2021");
        Cargos maisBeneficios = worker.maisBeneficios(funcionariosComBeneficios, "12/2021");
        Vendedor maisVendeu = worker.maisVendeu(vendedores, "12/2021");

        System.out.println("Valores para a data: 12/2021");
        System.out.println("Total de salario  pago: " + totalMes);
        System.out.println("Total pago apenas com salários: " + totalSalarioMes);
        System.out.println("Total pago apenas com benefícios: " + totalBeneficioPago);
        System.out.println("Funcionário mais bem pago: " + maisBemPago.getNome());
        System.out.println("Funcionario que recebeu mais benefícios: " + maisBeneficios.getNome());
        System.out.println("Vendedor que realizou mais vendas: " + maisVendeu.getNome());
    }

}