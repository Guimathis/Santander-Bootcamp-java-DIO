package main.java.list.Ordenacao;
import java.lang.Comparable;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.idade, o.idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    public Double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    static class ComparatorPorAltura implements  Comparator<Pessoa> {

        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return Double.compare(o1.getAltura(), o2.getAltura());
        }
    }
}
