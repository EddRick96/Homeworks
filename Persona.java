package ejemplo;

import java.util.Date;

/**
 *
 * @author ESFOT
 */
public class Persona {
    //atributos siempre deben ser privados
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    
    public Persona(){}
    
    public Persona(String nombre){
            this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, Date fechaNacimiento){
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
    }
//Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setCedula(String cedula){
        if(validarCedula(cedula)){
            this.cedula = cedula;
        }else{
            System.out.println("Cédula no válida");
        }
    }
//Metodos privados    
    private boolean validarCedula(String cedula){
        //TODO Implementar algoritmo de validación
        return false;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p = new Persona();
       
            System.out.println("El nombre de p es: "+ p.nombre);
       
       p.apellido = "Bolanos";//p es una variable
       p.nombre = "Erick";
       p.fechaNacimiento = new Date("1996/04/03");
       
            System.out.println("El nombre de p es: "+ p.nombre);
        
       Persona p1 = new Persona("David");
       System.out.println("El nombre de p1 es: "+ p1.nombre);
                
       p.nombre=p.nombre+" Roberto";
       System.out.println("El nombre de p es: "+p.nombre);
        
       p.setCedula("0923950778");
       p.setCedula("1231231233");
    }
    
    
}
