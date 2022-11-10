package instutuicao.administrativo;

import instutuicao.pessoa.Pessoa;

import java.util.ArrayList;

public class Reuniao {

    private ArrayList<Pessoa> pessoas;

    public Reuniao() {
        setPessoas(new ArrayList<>());
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}