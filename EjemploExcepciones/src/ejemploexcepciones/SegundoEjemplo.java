package ejemploexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoEjemplo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        try {

            System.out.print("Ingrese el primer valor: ");
            int valor1 = scan.nextInt();

            System.out.print("Ingrese el segundo valor: ");
            int valor2 = scan.nextInt();
            
            int cociente = valor1/valor2;
            System.out.println("El valor del cociente es: "+ cociente);

        } catch (InputMismatchException  e) {
            System.out.println("No sea Pendejo eso es una letra no un numero ! :v");
            
        }catch (ArithmeticException m) {
            System.out.println("No sea gil no se divide para cero ! :v");
            
        }

    }
}
