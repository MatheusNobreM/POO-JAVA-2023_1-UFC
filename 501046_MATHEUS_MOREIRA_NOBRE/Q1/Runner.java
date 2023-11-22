package Lista.Q1;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Double> arrayNumeros = new ArrayList<>();
        // Adicionando os números:
        arrayNumeros.add(20.5);
        arrayNumeros.add(10.0);
        arrayNumeros.add(12.0);
        arrayNumeros.add(47.8);
        arrayNumeros.add(2.0);

        // Somando os números:
        double soma = 0.0;
        for (Double i : arrayNumeros) {
            soma += i;
        }

        // Calculando a média:
        double media = soma / arrayNumeros.size();

        //Resultados:
        System.out.println("QUESTAO 1.1");
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media dos valores: " + media);
        System.out.println("\n==============================\n");

        System.out.println("QUESTAO 1.2");
        List<String> arrayStrings = new ArrayList<>();

        // Adicionando strings à lista:
        arrayStrings.add("Matheus");
        arrayStrings.add("laranja");
        arrayStrings.add("JOGO");
        arrayStrings.add("uva");
        arrayStrings.add("Carro");

        //Imprindo a lista sem estar ordenada:
        System.out.println("Lista nao ordenada:");
        for (String fruta : arrayStrings) {
            System.out.println(fruta);
        }

        System.out.println("---------------------");

        // Ordenarando a lista em ordem alfabética:
        Collections.sort(arrayStrings);

        // Imprimindo a lista usando foreach:
        System.out.println("Lista ordenada:");
        for (String fruta : arrayStrings) {
            System.out.println(fruta);
        }

        System.out.println("\n==============================\n");
        System.out.println("QUESTAO 1.3");

        // Inicializando o mapa com a chave do tipo Integer e o valor String:
        Map<Integer, String> mapa = new HashMap<>();

        // Preenchendo o mapa:
        mapa.put(43, "Cabelo");
        mapa.put(15, "Mouse");
        mapa.put(1200, "Garrafa");
        mapa.put(2, "Anel"); // Esperado como menor chave
        mapa.put(200, "Papel");

        // Encontrando a menor chave:
        int menorChave = 999999999;
        for (int chave : mapa.keySet()) {
            if (chave < menorChave) {
                menorChave = chave;
            }
        }

        // Pegando o menor elemento ligado a chave:
        String valorMenorChave = mapa.get(menorChave);

        // Mostrando a menor chave e o menor elemento:
        System.out.println("Menor Chave: " + menorChave + ", Menor Elemento: " + valorMenorChave);
    }
}