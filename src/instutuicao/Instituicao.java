package instutuicao;

import instutuicao.pessoa.diretor.Diretor;
import instutuicao.sistema.Sistema;

public class Instituicao {

    private String nome;
    private Sistema sistema;
    private Diretor diretor;

    public Instituicao(String nome) {
        setNome(nome);
        setSistema(new Sistema());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(String nome) {
        this.diretor = new Diretor(nome);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
