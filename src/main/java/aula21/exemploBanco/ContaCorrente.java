/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21.exemploBanco;

/**
 *
 * @author Eduarda
 */
public class ContaCorrente extends Conta{
    private float limite;
    
    
    public ContaCorrente (String senha, String titular, float limite){
        super(senha, titular);
        this.limite = limite;
    }
    
    public boolean sacar(float valor){
        if (saldo+limite>=valor){
            saldo-=valor;
            return true;
        }
        
        return false;
    }
    
    public String verificaSaldo(){
        String retorno = String.format("Seu saldo é de R$%.2f", saldo);
        if(saldo>=0){
            retorno+=String.format("Limite disponível: R$%.2f", limite);
        }
        else{
            retorno+=String.format("Limite disponível: R$%.2f", limite+saldo);
        }
        return retorno;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}