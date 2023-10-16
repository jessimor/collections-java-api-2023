package CarrinhoDeCompras;

import main.java.list.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Item> itemList;

    public ListaDeCompras() {
        this.itemList = new ArrayList<>();
//sempre que eu criar um objeto do tipo listadecompras automaticamente eu ja tenho um
//atributo chamado ItemList com um Arraylist vazio só esperando
    }
//agora que ja temos a nossa classe Item qie representa o elemento que vai estar dentro da
//nossa List<Item> vamos implementar os metodos

    //primeiro metodo é o de adicionar item
    public void adicionarItem(String descricao){
        itemList.add(new Item(descricao));
    }
    //metodo de remover item da lista
    public void removerItem(String descricao){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i: itemList){
            if(i.getDescricao().equalsIgnoreCase(descricao)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
        //utilizo o removeAll pois dentro de uma lista posso ter 2 itens com a mesma descrição
        //faço um laço de repetição que passo por cada elemento da minha lista e faço uma comparação
        //se a descrição é igual a descrção que passo eu removo se não passo para o próximo.
    }
    public int obterNumeroTotalItens(){
        return itemList.size();
    }
    public void obterDescricoesItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        System.out.println(listaDeCompras.obterNumeroTotalItens());

        //adicionando itens
        listaDeCompras.adicionarItem("Item 1");
        listaDeCompras.adicionarItem("Item 2");
        listaDeCompras.adicionarItem("Item 2");
        System.out.println(listaDeCompras.obterNumeroTotalItens());

        listaDeCompras.removerItem("Item 1");
        System.out.println(listaDeCompras.obterNumeroTotalItens());

        listaDeCompras.obterDescricoesItens();
    }

}
