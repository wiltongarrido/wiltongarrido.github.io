/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreescritura3;

/**
 *
 * @author Constanza
 */
public class Principall {
    public static void main(String[] args){
        Libro libro = new Libro();
        Revista revista = new Revista();
        Periodico periodico = new Periodico();
        
        libro.setTitulo("Atraves de mi ventana");
        libro.setAño(2016);
        libro.setAutor("Luna Hernandez");
        
        System.out.println("Titulo:" + libro.getTitulo());
        System.out.println("Anio:" + libro.getAño());
        System.out.println("Autor:" + libro.getAutor());
               libro.mostrar();
        revista.setTitulo("VEA");
        revista.setAño(2020);
        revista.setAutor("Rafael Gomez");
        
        System.out.println("Titulo:" + revista.getTitulo());
        System.out.println("Anio:" + revista.getAño());
        System.out.println("Autor:" + revista.getAutor());
                revista.mostrar();
        periodico.setTitulo("ELTIEMPO");
        periodico.setAño(1956);
        periodico.setAutor("Eduardo Santos Montejo");
        
        System.out.println("Titulo:" + periodico.getTitulo());
        System.out.println("Anio:" + periodico.getAño());
        System.out.println("Autor:" + periodico.getAutor());
        periodico.mostrar();
        
    }
    
}
