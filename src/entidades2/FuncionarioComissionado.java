package entidades2;


import entidades.Funcionario;

public class FuncionarioComissionado extends Funcionario {

        private double vendasBrutas;
        private double taxaComissao;

        public FuncionarioComissionado(String nome, String cpf, double vendasBrutas, double taxaComissao) {
            super(nome, cpf);
            this.vendasBrutas = vendasBrutas;
            this.taxaComissao = taxaComissao;
        }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
        public double calculaRendimentos() {
            return vendasBrutas * taxaComissao;
        }
}

