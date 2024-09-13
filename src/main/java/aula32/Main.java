/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula32;

/**
 *
 * @author Eduarda
 */
public class Main {
    public static void main(String[] args) {
        // Testando a lista de Strings
        Lista<String> l1 = new Lista<>(10);
        l1.Adiciona("A");
        l1.Adiciona("C");
        l1.Adiciona("D");
        l1.Adiciona("E");
        System.out.println(l1);
        l1.Adiciona(1, "B");
        System.out.println(l1);
        System.out.println("Elemento da posicao 2: " + l1.obter(2));

        try {
            System.out.println("Elemento da posicao -1: " + l1.obter(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

        System.out.println("Posicao do elemento 'C' é " + l1.posicaoDe("C"));
        System.out.println("Posicao do elemento 'c' é " + l1.posicaoDe("c"));
        l1.Adiciona("F");
        l1.Adiciona("G");
        l1.Adiciona("H");
        l1.Adiciona("I");
        l1.Adiciona("J");
        System.out.println(l1);
        System.out.println("Removendo elemento 4 da lista: " + l1.remove(4));
        System.out.println(l1);

        // Testando novos métodos com lista de Integers
        Lista<Integer> listaInteiros = new Lista<>(); // Usa o construtor padrão com capacidade 10

        // Adicionando elementos
        listaInteiros.Adiciona(0);
        listaInteiros.Adiciona(1);
        listaInteiros.Adiciona(2);
        listaInteiros.Adiciona(3);
        listaInteiros.Adiciona(4);
        listaInteiros.Adiciona(5);
        listaInteiros.Adiciona(6);
        listaInteiros.Adiciona(7);
        listaInteiros.Adiciona(8);
        listaInteiros.Adiciona(25);
        listaInteiros.Adiciona(9);
        listaInteiros.Adiciona(5);
        listaInteiros.Adiciona(10);
        listaInteiros.Adiciona(87);
        listaInteiros.Adiciona(96);
        listaInteiros.Adiciona(58);
        listaInteiros.Adiciona(10);
        listaInteiros.Adiciona(21);

        System.out.println("Lista atual de Integers: " + listaInteiros);

        // Testando contem
        System.out.println("A lista contém o elemento 10? " + listaInteiros.contem(10));

        // Testando remove
        System.out.println("Removendo o elemento 25 da lista: " + listaInteiros.remove(25));
        System.out.println("Lista após remover o elemento 25: " + listaInteiros);

        // Testando limpar
        listaInteiros.limpar();
        System.out.println("Lista após limpar: " + listaInteiros);
        System.out.println("A lista está vazia? " + listaInteiros.estaVazia());

        // Adicionando novamente para testar outras funcionalidades
        listaInteiros.Adiciona(10);
        listaInteiros.Adiciona(20);
        listaInteiros.Adiciona(30);
        listaInteiros.Adiciona(10);
        listaInteiros.Adiciona(40);

        System.out.println("Lista após adicionar novos elementos: " + listaInteiros);

        // Testando ultimaPosicaoElemento
        System.out.println("Última posição do elemento 10: " + listaInteiros.ultimaPosicaoElemento(10));

        // Testando tamanho
        System.out.println("Tamanho da lista: " + listaInteiros.tamanho());

        // Testando estaVazia
        System.out.println("A lista está vazia? " + listaInteiros.estaVazia());
    }
}
