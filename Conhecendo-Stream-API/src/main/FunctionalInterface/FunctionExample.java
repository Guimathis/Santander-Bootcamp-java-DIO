package main.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar function com lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = n -> n * 2;

        // Usar a function para dobra os valores da lista
        List<Integer> numerosDobro = numeros.stream().map(dobrar).toList();

        // Imprimir a lista dos numeros dobrados
        numerosDobro.forEach(System.out::println);
//       numerosDobro.forEach(n -> System.out.println(n));


    }
}
