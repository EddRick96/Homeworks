/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesorherencia;

/**
 *
 * @author Erick
 */
public class Estudiante extends Persona {
    
    private int cedula;
    private Materia materia;
    //private String nombreCompleto;
    
    public Estudiante (String nombre, String apellido, int cedula){
        super(nombre, apellido);
        this.cedula = cedula;
    }

    public Estudiante(String nombre, String apellido, Materia materia) {
        super(nombre, apellido);
        //this.nombreCompleto=this.nombre+" "+this.apellido;
        this.materia = materia;
    }

    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}
