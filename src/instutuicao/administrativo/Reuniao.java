package instutuicao.administrativo;

import instutuicao.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Reuniao {

    private String tema;
    private ArrayList<Pessoa> pessoas;

    public Reuniao() {
        setTema(tema);
        setPessoas(new ArrayList<>());
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
    }

    @Override
    public String toString() {
        return "Reuniao: ↓" + System.lineSeparator() +
                "Tema: " + getTema() + System.lineSeparator() +
                "Pessoas: " + (!getPessoas().isEmpty() ? getPessoas().stream().map(Pessoa::getNome).collect(Collectors.joining(", ")) : "Nenhuma pessoa.");
    }
}