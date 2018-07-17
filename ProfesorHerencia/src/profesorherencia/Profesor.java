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
public class Profesor extends Persona{
    
    private String facultad;
    private Materia materia;
    

    public Profesor( String nombre, String apellido, String facultad, Materia materia) {
        super(nombre, apellido);
        this.nombre="Ing. "+this.nombre;
        this.facultad = facultad;
        this.materia = materia;
    }
    

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
}
