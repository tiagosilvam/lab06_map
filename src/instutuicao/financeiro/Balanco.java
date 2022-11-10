package instutuicao.financeiro;

import instutuicao.almoxarifado.Estoque;
import instutuicao.almoxarifado.Item;
import instutuicao.pessoa.funcionario.Professor;

public class Balanco {

    Estoque estoque;
    FolhaPagamento folhaPagamento;

    public Balanco(Estoque estoque, FolhaPagamento folhaPagamento) {
        setEstoque(estoque);
        setFolhaPagamento(folhaPagamento);
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public FolhaPagamento getFolhaPagamento() {
        return folhaPagamento;
    }

    public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
        this.folhaPagamento = folhaPagamento;
    }

    public String calcular() {
        double gastoSalario = getFolhaPagamento().getFuncionarios().stream().mapToDouble(Professor::getSalario).sum();
        double gastoEstoque = estoque.getEstoque().stream().mapToDouble(Item::getPreco).sum();
        return String.format("Despesas: R$ %.2f", gastoSalario + gastoEstoque);
    }

}
