/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula31;

/**
 *
 * @author Eduarda
 */
public class Retangulo extends Figura{
    private double base;
    private double altura;
    
    public Retangulo(){
        setNomeFigura("Retangulo");
    }
    
    public double calculaArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 2*(base+altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
   
}
