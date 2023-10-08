package entidades;

public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private double salarioPorHora;

    public FuncionarioHorista(String nome, String cpf, double salarioPorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaRendimentos() {
        if (horasTrabalhadas <= 40) {
            return salarioPorHora * horasTrabalhadas;
        } else {
            double salarioNormal = salarioPorHora * 40;
            double horasExtras = horasTrabalhadas - 40;
            return salarioNormal + (horasExtras * salarioPorHora * 1.5);
        }
    }
}

