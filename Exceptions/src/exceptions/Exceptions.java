package exceptions;

import java.util.Arrays;

public class Exceptions {
 
    public static void main(String[] args) {
        
        try {
            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucción 1.");
            System.out.println("Instrucción 2.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println("Instrucción 3, etc.");

//        } catch(NumberFormatException nfe){
//            System.out.println("************************************************");
//            System.out.println("Instrucciones a ejecutar cuando se produce un error de formato de numero");
//            System.out.println(nfe.getMessage());
//            System.out.println(Arrays.toString(nfe.getStackTrace()));
//            
        } catch (Exception e) {
            System.out.println("************************************************");
            System.out.println("Instrucciones a ejecutar cuando se produce un error de cuaquier otro tipo");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            
        } finally {
            System.out.println("************************************************");
            System.out.println("Terminó el programa");
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
        }
        
    }
    
}
    

