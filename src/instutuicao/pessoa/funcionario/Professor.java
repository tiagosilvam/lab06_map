package instutuicao.pessoa.funcionario;

import instutuicao.pessoa.Pessoa;

public class Professor extends Pessoa {

    private long matricula;
    private double salario;

    public Professor(long matricula, String nome, double salario) {
        super(nome);
        setMatricula(matricula);
        setSalario(salario);
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + System.lineSeparator() +
                "Matrícula: " + getMatricula() + System.lineSeparator() +
                "Salário: R$" + getSalario();
    }
}
