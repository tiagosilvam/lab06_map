package instutuicao.controller;

import instutuicao.administrativo.Entrevista;
import instutuicao.administrativo.Reuniao;
import instutuicao.pessoa.Pessoa;

import java.util.ArrayList;

public class ControladorAdministrativo {

    private Entrevista entrevista;
    private Reuniao reuniao;
    private ArrayList<Pessoa> pessoas;

    public ControladorAdministrativo() {
        setEntrevista(new Entrevista());
        setReuniao(new Reuniao());
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Reuniao getReuniao() {
        return reuniao;
    }

    public void setReuniao(Reuniao reuniao) {
        this.reuniao = reuniao;
    }
}
