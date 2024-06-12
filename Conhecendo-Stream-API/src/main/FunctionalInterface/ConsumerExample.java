package main.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Cria uma lista de inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usa o consumer para imprimir os numeros pares:
    Consumer<Integer> imprimirNumeroPar = numero ->{
        if( numero % 2 == 0){
            System.out.println(numero);
        }
    };

    // Usar o consumer para imprimir os numeros pares no stream
    numeros.forEach(n -> {
        if(n % 2 == 0)
            System.out.println(n);
    });
    }
}
