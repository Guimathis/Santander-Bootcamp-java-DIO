package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    private void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty())
            dicionarioMap.remove(palavra);
        else System.out.println("Dicionário vazio.");
    }

    private void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            for(Object d : dicionarioMap.values()){
                System.out.println(d);
            }
        } else System.out.println("Dicionário vazio.");
    }

    private String pesquisarPalavra(String palavra){
        String palavraEncontrada = null;
        if(!dicionarioMap.isEmpty())
            palavraEncontrada = dicionarioMap.get(palavra);
        else System.out.println("Dicionário vazio.");
        return palavraEncontrada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("Sorte", "uma força sem propósito, imprevisível e incontrolável, que modela eventos de forma favorável ou não para determinado indivíduo, grupo ou causa");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPalavra("Sorte"));
        dicionario.removerPalavra("Sorte");
        dicionario.exibirPalavras();

    }
}
