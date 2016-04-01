
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numClase = 1;
    private ArrayListInt notasAlumno;
    private static final int NOTA_DE_APROBADO = 5;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numClase++;
        notasAlumno = new ArrayListInt();
    }

    /**
     * Metodo usado para guardar las notas de todos los alumnos
     */
    public void guardarNotas(int nota)
    {
        notasAlumno.add(nota);
    }
    
    
}