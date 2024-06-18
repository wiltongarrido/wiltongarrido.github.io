/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreescritura3;

/**
 *
 * @author Wilton
 */
public class Material {
    private String titulo;
    private int año;
    private String autor;
    
    public void mostrar () {
        System.out.println("Estoy viendo");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor ){
        this.autor = autor;
    }
    
}
