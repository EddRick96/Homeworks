/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ESFOT
 */
public class Estudiante extends Persona {
    
    private int nivel;
    private double notaSerBachiller;
    
    public Estudiante(String nombre, String apellido){
        super(nombre, apellido);//llama a la clase padre
    }
    
    @Override//para sobreescribir a los métodos heredados
    public String getNombre(){
        return "El estudiante se llama: "+nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getNotaSerBachiller() {
        return notaSerBachiller;
    }

    public void setNotaSerBachiller(double notaSerBachiller) {
        this.notaSerBachiller = notaSerBachiller;
    }
    
}
