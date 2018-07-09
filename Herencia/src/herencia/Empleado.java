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
public class Empleado extends Persona{
    
    private double sueldo;
    
    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
