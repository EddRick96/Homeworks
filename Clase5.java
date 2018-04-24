package clase5;
/**
 *
 * @author ESFOT
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "La palabra esta en la posicion 3";
        System.out.println(frase);
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.replace('a','x'));
        System.out.println(frase.replaceFirst("a","x"));
        System.out.println(frase.indexOf("alab"));
        System.out.println(frase.substring(12, 30));
    }   
    
}
