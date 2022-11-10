import instutuicao.Instituicao;
import instutuicao.pessoa.aluno.Aluno;
import instutuicao.rdm.Disciplina;
import instutuicao.pessoa.funcionario.Professor;
import instutuicao.sistema.Sistema;

public class Main {
    public static void main(String[] args) throws Exception {

        Instituicao uepb = new Instituicao("Universidade Estadual da Paraíba");

        uepb.setDiretor("Mário");

        Aluno aluno1 = uepb.getSistema().getRdm().addAluno("Tiago");
        Professor professor1 = uepb.getSistema().getRdm().addProfessor("Vanessa", 3800);
        Professor professor2 = uepb.getSistema().getRdm().addProfessor("Augusto", 9000);
        Disciplina disciplina1 = uepb.getSistema().getRdm().addDisciplina("Métodos Avançados de Programação");

        // Alunos
        System.out.println("========== Alunos ==========");
        uepb.getSistema().getRdm().getAlunos().forEach(System.out::println);
        disciplina1.addTurma("9h", "bf3");

        // Professores
        System.out.println("========== Professores ==========");
        uepb.getSistema().getRdm().getProfessores().forEach(System.out::println);

        // Disciplinas
        System.out.println("========== Disciplinas ==========");
        uepb.getSistema().getRdm().getDisciplinas().forEach(System.out::println);

        // Demais opções
        System.out.println("========== Outros ==========");
        uepb.getSistema().getFinanceiro().getFolhaPagamento().gerar();
    }
}