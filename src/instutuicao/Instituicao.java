package instutuicao;

import instutuicao.administrativo.Reuniao;
import instutuicao.pessoa.diretor.Diretor;
import instutuicao.sistema.Sistema;

import java.util.ArrayList;

public class Instituicao {

    private String nome;
    private Sistema sistema;
    private Diretor diretor;
    private ArrayList<Reuniao> reunioes;

    public Instituicao(String nome) {
        setNome(nome);
        setSistema(new Sistema());
        setReunioes(new ArrayList<>());
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

    public ArrayList<Reuniao> getReunioes() {
        return reunioes;
    }

    public void setReunioes(ArrayList<Reuniao> reunioes) {
        this.reunioes = reunioes;
    }

    public Reuniao criarReuniao() {
        Reuniao reuniao = new Reuniao();
        reunioes.add(reuniao);
        return reuniao;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
