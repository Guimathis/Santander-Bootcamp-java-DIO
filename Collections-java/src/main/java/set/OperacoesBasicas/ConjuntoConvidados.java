package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado convidado : convidadoSet){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        for(Convidado convidado : convidadoSet)
            System.out.println(convidado);

    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.convidadoSet.size() + " convidado(s)");
        conjuntoConvidados.adicionarConvidados("Pedro", 1);
        conjuntoConvidados.adicionarConvidados("Maria", 2);
        conjuntoConvidados.adicionarConvidados("João", 2);
        conjuntoConvidados.adicionarConvidados("Carlos", 4);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.convidadoSet.size() + " convidado(s)");

        conjuntoConvidados.removerConvidadoPorCodigo(3);

        System.out.println("Existem " + conjuntoConvidados.convidadoSet.size() + " convidado(s)");

        conjuntoConvidados.exibirConvidados();
    }

}
