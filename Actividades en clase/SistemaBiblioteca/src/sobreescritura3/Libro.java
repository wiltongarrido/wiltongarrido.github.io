/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreescritura3;

/**
 *
 * @author Wilton
 */
public class Libro extends Material{
    private int tipodecontenido;

    @Override
    public void mostrar(){
        System.out.println("Estoy viendo una historia increible");
    }

    public int getTipodecontenido() {
        return tipodecontenido;
    }

    public void setTipodecontenido(int tipodecontenido) {
        this.tipodecontenido = tipodecontenido;
    }

}
