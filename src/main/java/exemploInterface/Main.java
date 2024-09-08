/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploInterface;

/**
 *
 * @author Eduarda
 */
public class Main {
    public static void main(String[] args) {
       Vetor v1= new Vetor(10);
       
       v1.adiciona("A");
       v1.adiciona("B");
       v1.adiciona("C");
       v1.adiciona("D");
        System.out.println("Qual o tamanho de v1"+v1.getTamanho());
        System.out.println(v1);
        System.out.println("Apagando o elemento "+v1.remove());
        System.out.println(v1);
        
        Lista l1 = new Vetor(5);
        l1.adiciona("teste");
        l1.remove();
    }
    
}
