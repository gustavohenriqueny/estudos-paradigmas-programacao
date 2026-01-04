package org.estudos.paradigmas.funcional;

import java.util.Arrays;
import java.util.List;

/**
 * Exemplo de Programação Funcional.
 * Foco em "o que" fazer, usando funções puras, imutabilidade e composição.
 * Evitamos mudar o estado de variáveis externas (Side Effects).
 */
public class ProcessamentoDadosFuncional {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("--- Funcional ---");

        // Encadeamento de funções (Pipeline)
        // filter: seleciona os pares
        // map: transforma os dados (dobra o valor)
        // reduce: agrega os valores em um resultado único (soma)
        int total = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println("Resultado Final: " + total);
    }
}
