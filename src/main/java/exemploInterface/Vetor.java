/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploInterface;

public class Vetor implements Lista{
    /**
     * Classe que representa uma lista de elementos do tipo string
     * @version 1
     * @author Eduarda
     */
    private String[] elementos;
    private int tamanho;
    
    /**
     * cria uma instância de vetor com capacidades elementos
     * @param capacidade capacidade inicial da lista
     */
    
    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }
    
    /**
     * metodo que perimite adicionar um elemento no final da lista
     * @param elemento elemento que será adicionado
     */
    
    @Override
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }
    
    /**
     * metodo remove o ultimo elemento da lista
     * @return retorna o elemento removido
     */
    
    @Override
    public String remove(){
        if (tamanho>0) {
            return elementos [--tamanho];        
        }
        return null;
    }
    
    /**
     * retorna a quantidade de elementos atualmente na lista
     * @return retorna um inteiro contendo a quantidade de elementos
     */
    
    public int getTamanho(){
        return tamanho;
    }
    
    /**
     * monta string com os elementos presentes na lista
     * @return  um conjunnto vazio para listas vazias = [] ou um conjunto com os elementos da lista = ['A' 'B' 'n']
     */
    
    @Override
    public String toString(){
        String resultado = "[";
        if (tamanho>0) {
            for (int i = 0; i < 10; i++) {
                resultado+=elementos[i]+" ";
            }
        }
        resultado+="]";
        return resultado;
    }
}
