package ejemploexcepciones;

import java.util.Scanner;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad de numero de enteros que quiera asignar: ");
            int cantidad = scan.nextInt();
            System.out.println("Es: " + cantidad);

            int n[] = new int[cantidad];
                        
            for(int i=0;i<cantidad;i++){
                System.out.print("Ingrese el valor en la posicion " + (i+1) +" :");
                n[i] = scan.nextInt();
            }
            
            System.out.print("Ingrese la posicion que desee: ");
            int posicion = scan.nextInt();
            
            System.out.println("La posicion que seleciono es : " + n[posicion-1]);

        } 
        catch (Exception excepción1) {
            System.out.println("No sea Pendejo eso es una letra no un numero ! :v");
        } 

    }

}
