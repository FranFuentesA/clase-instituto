
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
    
    /**
     * Metodo usado para calcular la nota media de las notas.
     */
    public int mediaNotas()
    {
        int totNotas = 0;
        int resultado = 0;
        for (int i = 0; i < notasAlumno.size(); i++)
        {
            totNotas = totNotas + notasAlumno.get(i);
        }
        if(notasAlumno.size() != 0)
        {
            resultado = (totNotas/notasAlumno.size());
        }
        else
        {
            resultado = 0;
        }
        return resultado;
    }

    
}