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
public class Rectangulo implements Figura{
    private double largo;
    private double ancho;
    
    @Override
    public double calcularPerimetro(){
        return ((2*this.largo)+(2*this.ancho));
    }
    
    @Override
    public double calcularArea(){
        return (this.ancho*this.largo);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    @Override
    public String toString() {
        return "Perimetro: " + calcularPerimetro() +"\n"
                +"Area:"+ calcularArea() ;
    }
}
