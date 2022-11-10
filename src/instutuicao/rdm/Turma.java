package instutuicao.rdm;

import instutuicao.pessoa.aluno.Aluno;
import instutuicao.infraestrutura.Sala;

import java.util.ArrayList;

public class Turma {

    private String horario;
    private Sala sala;
    private ArrayList<Aluno> alunos;

    public Turma(String horario) {
        setHorario(horario);
        setAlunos(new ArrayList<>());
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno matricularAluno(Aluno aluno) throws Exception {
        if(!getAlunos().contains(aluno)) {
            alunos.add(aluno);
            return aluno;
        }
        throw new Exception("O pessoa.aluno " + aluno.getNome() + " já está matriculado na turma.");
    }

    @Override
    public String toString() {
        return "Horário: " + getHorario() + System.lineSeparator() +
                "Sala: " + getSala();
    }
}