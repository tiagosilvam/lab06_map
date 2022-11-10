package instutuicao.financeiro;

import instutuicao.pessoa.funcionario.Professor;

import java.util.ArrayList;

public class FolhaPagamento {

    private ArrayList<Professor> funcionarios;

    public FolhaPagamento(ArrayList<Professor> funcionarios) {
        setFuncionarios(funcionarios);
    }

    public ArrayList<Professor> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Professor> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void gerar() {
        double salarios = getFuncionarios().stream().mapToDouble(Professor::getSalario).sum();
        getFuncionarios().forEach(System.out::println);
        System.out.println("Total: R$" + salarios);
    }
}