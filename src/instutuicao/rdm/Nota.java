package instutuicao.rdm;

public class Nota {

    private Disciplina disciplina;
    private float nota;

    public Nota(Disciplina disciplina, float nota) {
        setNota(nota);
        setDisciplina(disciplina);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%s: %.1f", getDisciplina().getNome(), getNota());
    }
}