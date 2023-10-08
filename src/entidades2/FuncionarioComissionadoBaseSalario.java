package entidades2;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salarioBase;
    public FuncionarioComissionadoBaseSalario(String nome, String cpf, double salarioBase, double vendas, double taxaComissao) {
        super(nome, cpf, vendas, taxaComissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaRendimentos() {
       return salarioBase + getVendasBrutas() * getTaxaComissao();
    }
}

