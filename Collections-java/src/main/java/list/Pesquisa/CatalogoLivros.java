package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
     private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao ) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosMesmoAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList)
                if (livro.getAutor().equalsIgnoreCase(autor)) livrosMesmoAutor.add(livro);
        }
        return livrosMesmoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                    livrosIntervaloAnos.add(livro);
            }
        }
        return livrosIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroMesmoTitulo = null;
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroMesmoTitulo = livro;
                    break;
                }
            }
        }
        return livroMesmoTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro( "Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2",  2021);
        catalogoLivros.adicionarLivro( "Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994) ;

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2") + "\n");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022) + "\n");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1") + "\n");








    }

}
