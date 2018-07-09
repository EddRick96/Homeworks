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
public class Profesor extends Empleado {//profesor q es empleado y al mismo tiempo una persona
    
    private int aniosExperiencia;
    private String profesion;
    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.nombre = "Ing. "+ this.nombre;
        //this.aniosExperiencia=5;
    }

    public Profesor(int aniosExperiencia, String nombre, String apellido) {
        super(nombre, apellido);
        this.aniosExperiencia = aniosExperiencia;
    }
   
    @Override
    public String getNombre(){
        return "El profesor se llama: "+nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
