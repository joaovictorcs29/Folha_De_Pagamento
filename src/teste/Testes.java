package teste;

import entidades.FuncionarioAssalariado;
import entidades.FuncionarioHorista;
import entidades2.FuncionarioComissionado;
import entidades2.FuncionarioComissionadoBaseSalario;

public class Testes {

        public static void testarFuncionarioComissionado() {
            FuncionarioComissionado funcionario = new FuncionarioComissionado("Péricles", "123456789", 1500, 0.15);
            double rendimentos = funcionario.calculaRendimentos();
            System.out.println("Funcionário Comissionado:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Rendimentos: " + rendimentos);
            System.out.println();
        }

        public static void testarFuncionarioComissionadoBaseSalario() {
            FuncionarioComissionadoBaseSalario funcionario = new FuncionarioComissionadoBaseSalario("Maria", "675749203", 200, 8000, 0.15 );
            double rendimentos = funcionario.calculaRendimentos();
            System.out.println("Funcionário Comissionado com Salário Base:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Rendimentos: " + rendimentos);
            System.out.println();
        }

        public static void testarFuncionarioAssalariado() {
            FuncionarioAssalariado funcionario = new FuncionarioAssalariado("João", "93202458", 300 );
            double rendimentos = funcionario.calculaRendimentos();
            System.out.println("Funcionário Assalariado:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Rendimentos: " + rendimentos);
            System.out.println();
        }

        public static void testarFuncionarioHorista() {
            FuncionarioHorista funcionario = new FuncionarioHorista("Ana", "87554783", 45, 20);
            double rendimentos = funcionario.calculaRendimentos();
            System.out.println("Funcionário Horista:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Rendimentos: " + rendimentos);
            System.out.println();
        }

    public static void main(String[] args) {
        System.out.println("\nTeste Folha de pagamento\n");
        testarFuncionarioComissionado();
        testarFuncionarioComissionadoBaseSalario();
        testarFuncionarioAssalariado();
        testarFuncionarioHorista();
    }

}