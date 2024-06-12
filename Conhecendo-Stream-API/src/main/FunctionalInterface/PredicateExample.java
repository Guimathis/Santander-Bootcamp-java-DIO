package main.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "Python", "Kotlyn", "go", "c");

//    Criando um predicate para filtrar linguagens com mais de 5 letras
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    // Usar o stream para fitrar e imprimira a lista final
    palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }

}
