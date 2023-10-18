package main.java.list.CarrinhoDeCompras;

public class Item {
    //atributo
    private String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    //como o atributo está privado e vou querer saber a descrição do item vamos adicionar o get

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
