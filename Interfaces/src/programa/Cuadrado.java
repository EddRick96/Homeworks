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
public class Cuadrado implements Figura{
    private double lado;
    
    @Override
    public double calcularPerimetro(){
        return (4* this.lado);
    }
    
    @Override
    public double calcularArea(){
        return Math.pow(this.lado,2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Perimetro: " + calcularPerimetro() +"\n"
                +"Area:"+ calcularArea() ;
    }
    
}
