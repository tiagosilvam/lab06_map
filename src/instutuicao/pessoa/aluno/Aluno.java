package instutuicao.pessoa.aluno;

import instutuicao.pessoa.Pessoa;
import instutuicao.rdm.Disciplina;
import instutuicao.rdm.Nota;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private long matricula;
    private ArrayList<Nota> notas;

    public Aluno(long matricula, String nome) {
        super(nome);
        setMatricula(matricula);
        setNotas(new ArrayList<>());
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Nota addNota(Disciplina disciplina, float nota) throws Exception {
        if(disciplina.getTurmas().stream().anyMatch(turma -> turma.getAlunos().contains(this))) {
            if (nota >= 0 && nota <= 10) {
                Nota notaDisciplina = new Nota(disciplina, nota);
                notas.add(notaDisciplina);
                return notaDisciplina;
            }
            throw new Exception("Valor de nota inválido.");
        }
        throw new Exception("Não foi possível atribuir nota ao pessoa.aluno " + getNome() + " pois ele não está matriculado em " + disciplina.getNome() + ".");
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + System.lineSeparator() +
                "Matrícula: " + getMatricula();
    }
}