package main.java.set.OperacoesBasicas;

import com.sun.jdi.request.StepRequest;
import main.java.set.Pesquisa.Contato;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()){
            if(this.palavras.contains(palavra))
                this.palavras.remove(palavra);
            else System.out.println("Palavra não encontrada no conjunto.");
        }else System.out.println("Conjunto vazio.");

    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public void  exibirPalavrasUnicas(){
        if(!palavras.isEmpty()){
            for(String p : palavras){
                System.out.println(p);
            }
        }else System.out.println("Conjunto vazio.");
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.adicionaPalavra("Arvore");
        conjuntoPalavras.adicionaPalavra("Carta");
        conjuntoPalavras.adicionaPalavra("Mouse");
        conjuntoPalavras.adicionaPalavra("Arvore");

        conjuntoPalavras.exibirPalavrasUnicas();

        if(conjuntoPalavras.verificarPalavra("Carta"))
            System.out.println("Palavra encontrada");
        else System.out.println("Palavra não encontrada");

        conjuntoPalavras.removerPalavra("Mouse");

        conjuntoPalavras.exibirPalavrasUnicas();
    }

}
