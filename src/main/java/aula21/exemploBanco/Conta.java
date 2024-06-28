/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21.exemploBanco;

import java.util.Random;

/**
 *
 * @author Eduarda
 */
public class Conta {
     private String titular;
     private String identificador;
     protected float saldo;
     private String senha;

     public String getIdentificador() {
        return identificador;
    }
     
     public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
     
     public Conta (String senha, String titular){
         this.titular = titular;
         this.senha = senha;
         geraIndetitificador();
     }
     private void geraIndetitificador(){
        Random aleatorio = new Random();
        String indentificador = "";
        for(int i=0;i<4;i++){
            indentificador+=(char)aleatorio.nextInt(65,90);
        }
        indentificador+=aleatorio.nextInt(1000,2000);
        this.identificador = indentificador;
    }
     
     public void depositar(float valor){
          saldo+=valor;
    }
     
     public boolean validarAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }
}
