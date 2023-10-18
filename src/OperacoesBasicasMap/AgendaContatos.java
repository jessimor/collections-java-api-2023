package OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer>    agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato (String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 12566);
        agendaContatos.adicionarContato("Camila Silva", 11111);
        agendaContatos.adicionarContato("Maria Souza", 2222);
        agendaContatos.adicionarContato("Camila DIO", 14444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Souza");
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila Silva"));
    }
}
