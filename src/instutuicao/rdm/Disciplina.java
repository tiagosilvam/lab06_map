package instutuicao.rdm;

import instutuicao.pessoa.funcionario.Professor;
import instutuicao.infraestrutura.Sala;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Disciplina {

    private String nome;
    private Professor professor;
    private ArrayList<Turma> turmas;

    public Disciplina(String nome) {
        setNome(nome);
        setTurmas(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public Turma addTurma(String horario, String sala) throws Exception {
        if(turmas.stream().noneMatch(turma -> turma.getHorario().contains(horario)) || turmas.stream().noneMatch(turma -> turma.getSala().toString().equals(sala))) {
            Turma turma = new Turma(horario);
            Sala salaTurma = new Sala(sala);
            turma.setSala(salaTurma);
            turmas.add(turma);
            return turma;
        }
        throw new Exception("Não é possível adicionar turmas no mesmo horário e sala.");
    }

    @Override
    public String toString() {
        return "Nome da disciplina: " + getNome() + System.lineSeparator() +
                "Professor: " + (getProfessor() != null ? getProfessor() : "Sem professor no momento.") + System.lineSeparator() +
                "Turma(s): ↓" + System.lineSeparator() +
                (getTurmas().size() != 0 ? getTurmas().stream().map(Turma::toString).collect(Collectors.joining("\n")) : "Nenhuma turma.");
    }
}