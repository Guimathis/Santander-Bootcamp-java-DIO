package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<Tarefa>();
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefasRemover);

    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("tarefa 2");
        lista.obterDescricaoTarefas();
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.removerTarefa("tarefa 1");
        System.out.println("O numero de tarefas na lista é: " + lista.obterNumeroTotalTarefas());
    }

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

}




