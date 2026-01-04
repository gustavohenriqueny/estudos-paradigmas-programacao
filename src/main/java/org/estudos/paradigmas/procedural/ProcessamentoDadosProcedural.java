package org.estudos.paradigmas.procedural;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de Programação Procedural.
 * Foco em procedimentos (métodos) que alteram o estado e executam passos sequenciais.
 * Os dados e as funções são frequentemente separados.
 */
public class ProcessamentoDadosProcedural {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println("--- Procedural ---");
        
        // Passo 1: Filtrar pares
        List<Integer> pares = filtrarPares(numeros);
        
        // Passo 2: Dobrar valores
        dobrarValores(pares);
        
        // Passo 3: Somar tudo
        int total = somarLista(pares);
        
        System.out.println("Resultado Final: " + total);
    }

    // Procedimento para filtrar pares (cria uma nova lista)
    public static List<Integer> filtrarPares(List<Integer> lista) {
        List<Integer> filtrados = new ArrayList<>();
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                filtrados.add(numero);
            }
        }
        return filtrados;
    }

    // Procedimento que altera o estado da lista passada (Side Effect)
    public static void dobrarValores(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) * 2);
        }
    }

    // Procedimento para calcular soma
    public static int somarLista(List<Integer> lista) {
        int soma = 0;
        for (Integer numero : lista) {
            soma += numero;
        }
        return soma;
    }
}
