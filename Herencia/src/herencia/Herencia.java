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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Estudiante e = new Estudiante("Erick","Bolaños");
        Profesor p = new Profesor("Jorge","Velasco");
                      
        System.out.println("Nombre estudiante: "+e.getNombre());
        System.out.println("Nombre profesor: "+p.getNombre());
    }
    
}
