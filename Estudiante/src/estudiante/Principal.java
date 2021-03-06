package estudiante;

/**
 *
 * @author ESFOT
 */
public class Principal {
    public static void main(String[] args){
        Estudiante[] estudiantes = new Estudiante[5];
        
        //2 materias
        estudiantes[0] = new Estudiante("Erick","Bolaños","1717976383");
//        String[] m = new String[2];
//        m[0] ="m1";
//        m[1] = "m2";
        String[] me1 = {"m1","m2"};
        estudiantes[0].setMaterias(me1);
        
        //3 materias
        estudiantes[1] = new Estudiante("Juan","Castro","1214639887");
        String[] me2 = {"m2","m3","m4"};
        estudiantes[1].setMaterias(me2);
        //4 materias
        estudiantes[2] = new Estudiante("David","Velasco","0931254760");
        String[] me3 = {"m2","m3","m4","m5"};
        estudiantes[2].setMaterias(me3);
        //3 materias
        estudiantes[3] = new Estudiante("Karla","Vivas","1320147862");
        String[] me4 = {"m2","m3","m5"};
        estudiantes[3].setMaterias(me4);
        //2 materias
        estudiantes[4] = new Estudiante("Fatima","Guerrero","0875621430");
        String[] me5 = {"m3","m5"};
        estudiantes[4].setMaterias(me5);
        
        System.out.println("\t\tINFORMACIÓN ESTUDIANTES\n\n");
        for(int j = 0; j<estudiantes.length;j++){
            System.out.println("\tEstudiante "+(j+1));
            System.out.println("Nombre Completo: "+estudiantes[j].getNombre()+" "+estudiantes[j].getApellido());
            System.out.println("Cédula: "+estudiantes[j].getCedula());
            String[] materiasEstudiante = estudiantes[j].getMaterias();
            for(int i = 0; i < materiasEstudiante.length; i++){
                System.out.println(i+1+". "+materiasEstudiante[i]);
            }
        }
        System.out.println("\t\t\tRESUMEN\n\n");
    }
}
