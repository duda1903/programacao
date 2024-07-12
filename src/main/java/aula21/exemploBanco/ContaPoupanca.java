/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21.exemploBanco;

/**
 *
 * @author Eduarda
 */
public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, String senha, float deposito){
        super(senha, titular);
        saldo = deposito;
    }
       public boolean sacar(float valor){
        if (saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }
        
       public String verificaSaldo(){
            return String.format("Seu saldo atual é de R$%.2f", saldo);
    }
}