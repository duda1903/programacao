/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula31;

/**
 *
 * @author Eduarda
 */
public class Circulo extends Figura{
    private double raio;
    
    public Circulo(){
        setNomeFigura("Circulo");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea(){
        return Math.PI*raio*raio;
    }
    
        @Override
    public double calculaPerimetro(){
        return 2*Math.PI*raio*raio;
    }
    
}
