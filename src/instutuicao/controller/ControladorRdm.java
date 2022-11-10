package instutuicao.controller;

import instutuicao.pessoa.aluno.Aluno;
import instutuicao.rdm.Disciplina;
import instutuicao.pessoa.funcionario.Professor;

import java.util.ArrayList;

public class ControladorRdm {

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    private long matriculaAluno;
    private long matriculaProfessor;

    public ControladorRdm() {
        setAlunos(new ArrayList<>());
        setProfessores(new ArrayList<>());
        setDisciplinas(new ArrayList<>());
        setMatriculaAluno(202211000000L);
        setMatriculaProfessor(202211000L);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public long getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(long matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public long getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(long matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public Aluno addAluno(String nome) {
        Aluno aluno = new Aluno(++matriculaAluno, nome);
        alunos.add(aluno);
        return aluno;
    }

    public Professor addProfessor(String nome, double salario) {
        Professor professor = new Professor(++matriculaProfessor, nome, salario);
        professores.add(professor);
        return professor;
    }

    public Disciplina addDisciplina(String nome) throws Exception {
        if(disciplinas.stream().noneMatch(disciplina -> disciplina.getNome().contains(nome))) {
            Disciplina disciplina = new Disciplina(nome);
            disciplinas.add(disciplina);
            return disciplina;
        }
        throw new Exception(String.format("Não foi possível adicionar a disciplina %s, pois uma com o mesmo nome já existe.", nome));
    }
}
