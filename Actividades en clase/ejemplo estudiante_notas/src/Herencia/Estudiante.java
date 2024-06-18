
package Herencia;

/**
 *
 * @author Constanza
 */
public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "nEdad: "+ getEdad() +
                "\nCódigo del estudiante: " + codigoEstudiante + "\nNotafinal: " + notaFinal);
    }   
}
