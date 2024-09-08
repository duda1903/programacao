/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula31;

/**
 *
 * @author Eduarda
 */
public abstract class Figura {
    private  String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public abstract double calculaArea();
    public abstract double calculaPerimetro();
    
     
}
