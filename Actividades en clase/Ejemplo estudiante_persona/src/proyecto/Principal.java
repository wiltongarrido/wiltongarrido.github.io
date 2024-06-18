
package proyecto;
public class Principal {
  public static void main(String[]args){
   Estudiante estudiante= new Estudiante(123, 3.5f, "Luna Sofia", "Hernandez Imbol", 17);
   Estudiante estudiante2= new Estudiante(345, 4.5f, "Sebas", "Ruiz", 26);
        
        estudiante.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos();
  }
    
}
