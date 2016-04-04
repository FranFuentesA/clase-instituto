import java.util.Random;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class test
{
    /**
     * Constructor for objects of class test
     */
    public test()
    {   
        //creamos 5 objetos de tipo alumno
        for(int i = 0; i < 5; i++)
        {
            //introducimos los datos de nombre y edad a traves de los metodos de a bajo del test
            Alumno alumno = new Alumno(asignaNombre(), asignaEdad());
            alumno.numClase++;
            asignaNotas(alumno);
           
            System.out.println(alumno.toString());
            
            
        }
    }

    /**
     * Metodo que crea nombres aleatroios para los alumnos
     */
    public String asignaNombre()
    {
        String nom = null;
        String [] nombre  = {"Pepe","Arturo","Diego","Luis","Manolete"};
        Random nombreAle = new Random();
        nom = nombre[nombreAle.nextInt(5)];
        return nom;
    }

    /**
     * Metodo que crea edades aleatorias para los alumnos
     */
    public int asignaEdad()
    {
        int edad = 0;        
        Random edadAl = new Random();
        edad = edadAl.nextInt(10)+15;        
        return edad;
    }

    /**
     * Metodo que crea notas aleatorias
     */
    public void asignaNotas(Alumno alumno)
    {
        Random nota = new Random();
        Random cantNotas = new Random();
        int enteroAle = cantNotas.nextInt(5) +1;
        for(int i = 0; i < enteroAle; i++)
        {
            alumno.guardarNotas(nota.nextInt(10));
        }
    }
}
