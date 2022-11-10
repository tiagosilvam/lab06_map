package instutuicao.almoxarifado;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Item> estoque;

    public Estoque() {
        setEstoque(new ArrayList<>());
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Item> estoque) {
        this.estoque = estoque;
    }

    public void addItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        estoque.add(item);
    }
}