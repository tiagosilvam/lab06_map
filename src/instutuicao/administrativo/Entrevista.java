package instutuicao.administrativo;

import instutuicao.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Entrevista {

    private Pessoa entrevistado;
    private ArrayList<Pessoa> pessoas;

    public Entrevista() {
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

    public Pessoa getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(Pessoa entrevistado) {
        this.entrevistado = entrevistado;
    }

    @Override
    public String toString() {
        return "Entrevista: ↓" + System.lineSeparator() +
                "Entrevistado: " + getEntrevistado().getNome() + System.lineSeparator() +
                "Pessoas: " + (!getPessoas().isEmpty() ? getPessoas().stream().map(Pessoa::getNome).collect(Collectors.joining(", ")) : "Nenhuma pessoa.");
    }
}
