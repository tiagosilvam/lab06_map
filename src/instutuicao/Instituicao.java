package instutuicao;

import instutuicao.administrativo.Entrevista;
import instutuicao.administrativo.Reuniao;
import instutuicao.pessoa.Pessoa;
import instutuicao.pessoa.diretor.Diretor;
import instutuicao.sistema.Sistema;

import java.util.ArrayList;

public class Instituicao {

    private String nome;
    private Sistema sistema;
    private Diretor diretor;
    private ArrayList<Reuniao> reunioes;
    private ArrayList<Entrevista> entrevistas;

    public Instituicao(String nome) {
        setNome(nome);
        setSistema(new Sistema());
        setReunioes(new ArrayList<>());
        setEntrevistas(new ArrayList<>());
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

    public Diretor setDiretor(String nome) {
        Diretor diretor = new Diretor(nome);
        this.diretor = diretor;
        return diretor;
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

    public Entrevista criarEntrevista(Pessoa entrevistado) {
        Entrevista entrevista = new Entrevista();
        entrevistas.add(entrevista);
        entrevista.setEntrevistado(entrevistado);
        return entrevista;
    }

    public ArrayList<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public void setEntrevistas(ArrayList<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
