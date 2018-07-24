/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author ESFOT
 */
public class Circulo implements Figura{
    
    private double radio;
    private final double pi = 3.1415;
    
    @Override
    public double calcularPerimetro(){
        return (2*pi*this.radio);
    }
    
    @Override
    public double calcularArea(){
        return pi*Math.pow(this.radio,2);
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        return "Perimetro: " + calcularPerimetro() +"\n"
                +"Area:"+ calcularArea() ;
    }
}
