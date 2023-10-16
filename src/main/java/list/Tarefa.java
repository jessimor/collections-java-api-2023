package main.java.list;

public class Tarefa {
    //atributo
    private String descricao;

   // Alt + insert para criar o construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
