package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> CarrinhoCompras;

    public CarrinhoDeCompras() {
        this.CarrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        CarrinhoCompras.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        if(!CarrinhoCompras.isEmpty()) {
            for (Item item1 : CarrinhoCompras) {
                if (item1.getNome().equals(nome)) {
                    itensRemover.add(item1);
                }
            }
             CarrinhoCompras.removeAll(itensRemover);
        } else System.out.println("O carrinho está vazio.");

    }

    public Double calcularTotal() {
        double total = 0d;
        if(!CarrinhoCompras.isEmpty()) {
            for (Item item : CarrinhoCompras) {
                total += item.getPreco() * item.getQuantidade();
            }
        } else System.out.println("O carrinho está vazio.");

        return total;
    }

    public void exibirCarrinho() {
        if(!CarrinhoCompras.isEmpty()) {
            System.out.println("Carrinho de compras: \n" + this.CarrinhoCompras);
        } else System.out.println("O carrinho está vazio.");

    }

     public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirCarrinho();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirCarrinho();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotal());
  }
}
