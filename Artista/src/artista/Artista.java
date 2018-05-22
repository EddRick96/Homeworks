package artista;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ESFOT
 */
public class Artista {
    private String nombre;
    private Date fechaNac;
    private String pais;
    private Album[] album;
    
    public Artista(String nombre, Date fechaNac, String pais){
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.pais = pais;
    }
    public Artista(String nombre, Date fechaNac, String pais, Album[] album){
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.pais = pais;
        this.album = album;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Date getFechaNac(){
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac){
        this.fechaNac = fechaNac;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombreArtista;
        Date fechaNacimiento;
        String pais;
        int año,mes,dia;
        int numArtista = 1;
        for(int i = 0; i < numArtista; i++){
            Artista[] artista = new Artista[numArtista];
            System.out.println("Artista "+(i+1));
            System.out.println("Ingrese el nombre");
            nombreArtista=scan.nextLine();
            System.out.println("Ingrese la fecha de nacimiento(AAAA/MM/DD)");
            año=scan.nextInt();
            mes=scan.nextInt();
            dia=scan.nextInt();
            fechaNacimiento = new Date(año, mes, dia);
            System.out.println("Ingrese el pais");
            pais = scan.nextLine();
            artista[i]= new Artista(nombreArtista,fechaNacimiento,pais);
            System.out.println("Desea ingresar album del artista");
           
        }
        
    }
    
}
