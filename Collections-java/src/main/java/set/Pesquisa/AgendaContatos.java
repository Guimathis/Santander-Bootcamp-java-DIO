package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, String telefone){
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : contatosSet){
            if(contato.getNome().startsWith(nome))
                contatosPorNome.add(contato);
        }
        return contatosPorNome;
    }

    private Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatosSet){
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Camila", "11111111");
        agenda.adicionarContato("Camila d", "22222222");
        agenda.adicionarContato("Camila Cavalcante", "3333333");
        agenda.adicionarContato("Guilherme", "4444444");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado:  " + agenda.atualizarNumeroContato("Camila", "7777777"));

    }

}
