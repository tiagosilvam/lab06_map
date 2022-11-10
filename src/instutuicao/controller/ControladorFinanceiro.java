package instutuicao.controller;

import instutuicao.almoxarifado.Estoque;
import instutuicao.financeiro.Balanco;
import instutuicao.financeiro.FolhaPagamento;

public class ControladorFinanceiro {

    FolhaPagamento folhaPagamento;
    Estoque estoque;
    Balanco balanco;

    public ControladorFinanceiro(ControladorRdm rdm) {
        setFolhaPagamento(new FolhaPagamento(rdm.getProfessores()));
        setEstoque(new Estoque());
        setBalanco(new Balanco(getEstoque(), getFolhaPagamento()));
    }

    public FolhaPagamento getFolhaPagamento() {
        return folhaPagamento;
    }

    public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
        this.folhaPagamento = folhaPagamento;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Balanco getBalanco() {
        return balanco;
    }

    public void setBalanco(Balanco balanco) {
        this.balanco = balanco;
    }
}
