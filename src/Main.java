import instutuicao.Instituicao;
import instutuicao.administrativo.Entrevista;
import instutuicao.administrativo.Reuniao;
import instutuicao.pessoa.aluno.Aluno;
import instutuicao.pessoa.diretor.Diretor;
import instutuicao.rdm.Disciplina;
import instutuicao.pessoa.funcionario.Professor;
import instutuicao.rdm.Turma;

public class Main {
    public static void main(String[] args) throws Exception {

        Instituicao uepb = new Instituicao("Universidade Estadual da Paraíba");

        uepb.setDiretor("Mário");

        Aluno aluno1 = uepb.getSistema().getRdm().addAluno("Tiago");
        Aluno aluno2 = uepb.getSistema().getRdm().addAluno("João");
        Aluno aluno3 = uepb.getSistema().getRdm().addAluno("Maria");

        Professor professor1 = uepb.getSistema().getRdm().addProfessor("Vanessa", 3800);
        Professor professor2 = uepb.getSistema().getRdm().addProfessor("Augusto", 9000);
        Disciplina disciplina1 = uepb.getSistema().getRdm().addDisciplina("Métodos Avançados de Programação");
        Disciplina disciplina2 = uepb.getSistema().getRdm().addDisciplina("Cálculo Numérico");
        Diretor diretor1 = uepb.setDiretor("Mário");

        // Alunos
        System.out.println("========== Alunos ==========");
        uepb.getSistema().getRdm().getAlunos().forEach(System.out::println);

        // Turmas
        System.out.println("========== Turmas ==========");
        Turma turma1 = disciplina1.addTurma("9h", "A103");
        Turma turma2 = disciplina2.addTurma("7h", "B207");
        turma1.matricularAluno(aluno1);
        turma1.matricularAluno(aluno2);
        turma2.matricularAluno(aluno3);
        disciplina1.getTurmas().forEach(System.out::println);
        disciplina2.getTurmas().forEach(System.out::println);

        // Professores
        System.out.println("========== Professores ==========");
        uepb.getSistema().getRdm().getProfessores().forEach(System.out::println);

        // Disciplinas
        System.out.println("========== Disciplinas ==========");
        uepb.getSistema().getRdm().getDisciplinas().forEach(System.out::println);

        // Folha de pagamento
        System.out.println("========== Folha de pagamento ==========");
        uepb.getSistema().getFinanceiro().getEstoque().addItem("Caneta", 1.0, 100);
        uepb.getSistema().getFinanceiro().getEstoque().addItem("Papel", 100.0, 200);
        uepb.getSistema().getFinanceiro().getFolhaPagamento().gerar();
        System.out.println(uepb.getSistema().getFinanceiro().getBalanco().calcular());

        // Demais opções
        System.out.println("========== Reuniões e Entrevistas ==========");
        Reuniao reuniao1 = uepb.criarReuniao();
        reuniao1.setTema("Criação de projeto");
        reuniao1.addPessoa(aluno1);
        reuniao1.addPessoa(professor1);
        reuniao1.addPessoa(diretor1);
        uepb.getReunioes().forEach(System.out::println);
        //
        Entrevista entrevista = uepb.criarEntrevista(diretor1);
        System.out.println(entrevista.toString());
    }
}