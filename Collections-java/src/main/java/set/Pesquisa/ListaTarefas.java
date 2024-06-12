package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao,false));
    }

    public void removerTarefa(String descricao){
        if(!tarefasSet.isEmpty()){
            tarefasSet.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
//            for(Tarefa tarefa : tarefasSet){
//                if(tarefa.getDescricao().equals(descricao))
//                    tarefasSet.remove(tarefa);
//            }
        }
    }

    public void exibirTarefas(){
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet)
                System.out.println(tarefa);
        } else System.out.println("Lista de tarefas vazia");

    }

    public void contarTarefas(){
        if(!tarefasSet.isEmpty()){
            System.out.println(tarefasSet.size() + " Tarefas na lista.");
        } else System.out.println("Lista de tarefas vazia");

    }

    public Set<Tarefa> getTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()){
           for(Tarefa tarefa : tarefasSet){
               if (tarefa.isConluida())
                   tarefasConcluidas.add(tarefa);
           }
        } else System.out.println("Lista de tarefas vazia");
        return tarefasConcluidas;
    }

    public Set<Tarefa> getTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()){
           for(Tarefa tarefa : tarefasSet){
               if (!tarefa.isConluida())
                   tarefasPendentes.add(tarefa);
           }
        } else System.out.println("Lista de tarefas vazia");
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefasSet.isEmpty()){
           for(Tarefa tarefa : tarefasSet){
               if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                   tarefa.setConluida(true);
               }
           }
        } else System.out.println("Lista de tarefas vazia");
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefasSet.isEmpty()){
           for(Tarefa tarefa : tarefasSet){
               if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                   tarefa.setConluida(false);
               }
           }
        } else System.out.println("Lista de tarefas vazia");
    }

    public void  limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 1");

        System.out.println(listaTarefas.getTarefasConcluidas());

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Tarefa 1");

        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }


}
