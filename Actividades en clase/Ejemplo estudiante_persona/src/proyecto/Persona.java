package proyecto;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
public Persona (String nombre, String apellido, int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
}
    
public vold setNombre (String nombre){
    this.nombre=nombre;
        return null;
}
public String getNombre(){
    return nombre;
}

public vold setApellido(String apellido){
    this.apellido=apellido;
        return null;
}

public String getApellido(){
     return apellido;
}

public vold setEdad(int edad){
    this.edad=edad;
        return null;
}
public int getEdad(){
    return edad;
}
}
