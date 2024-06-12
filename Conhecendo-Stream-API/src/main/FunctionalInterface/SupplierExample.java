package main.FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá";

        // Usar o supplier para obter uma lista com 5 saudações
        List<String> saudacoes = Stream.generate(saudacao).limit(5).toList();

        // Imprimir saudações geradas
        saudacoes.forEach(s -> System.out.println(s));
    }
}
