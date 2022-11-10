package instutuicao.administrativo;

import instutuicao.pessoa.Pessoa;

import java.util.ArrayList;

public class Entrevista {

    private ArrayList<Pessoa> pessoas;

    public Entrevista(ArrayList<Pessoa> pessoas) {
        setPessoas(new ArrayList<>());
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
}
