/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula32;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

   
    public Lista() {
        this(10);
    }

    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // Método que remove o elemento pelo valor
    public boolean remove(T elemento) {
        int pos = posicaoDe(elemento);
        if (pos >= 0) {
            remove(pos);
            return true;
        }
        return false;
    }

    // Método para limpar a lista
    public void limpar() {
        elementos = (T[]) new Object[elementos.length];
        tamanho = 0;
    }

    // Método que retorna o tamanho da lista
    public int tamanho() {
        return tamanho;
    }

    // Método que verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método que retorna o último índice de determinado elemento
    public int ultimaPosicaoElemento(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    // Demais métodos já implementados

    public void Adiciona(T elemento) {
        aumentaCapacidade();
        elementos[tamanho++] = elemento;
    }

    public String toString() {
        String retorno = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                retorno += elementos[i] + ", ";
            }
            retorno += elementos[tamanho - 1];
        }
        return retorno + "]";
    }

    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        }
        return elementos[posicao];
    }

    public void Adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        }
        aumentaCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public int posicaoDe(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] aux = (T[]) new Object[tamanho + 10];
            for (int i = 0; i < tamanho; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    public T remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posicao " + posicao + " é inválida");
        }
        T elemento = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }
}