package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    private void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    private void removerContato(String nome){
        if(!agendaContatos.isEmpty())
            agendaContatos.remove(nome);
        else System.out.println("Agenda vazia.");
    }

    private void exibirContatos(){
        if(!agendaContatos.isEmpty())
            System.out.println(agendaContatos);
        else System.out.println("Agenda vazia.");
    }

    private Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatos.isEmpty())
            numeroPorNome = agendaContatos.get(nome);
        else System.out.println("Agenda vazia.");
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Camila", 123122);
        agendaContatos.adicionarContato("Camila", 232334);
        agendaContatos.adicionarContato("Camila Cavalcante", 22222);
        agendaContatos.adicionarContato("Maria", 123333);
        agendaContatos.adicionarContato("Maria Ferreira", 11111);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        System.out.println("O numero é : " + agendaContatos.pesquisarPorNome("Maria Ferreira"));
    }
}
