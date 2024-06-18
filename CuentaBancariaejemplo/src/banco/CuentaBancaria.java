/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Constanza
 */
public class CuentaBancaria {
    private int ncuenta;
    private String nomtitular;
    private int saldo;
    
    public void proceso () {
        System.out.println(".....Operacion exitosa......");
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getNomtitular() {
        return nomtitular;
    }

    public void setNomtitular(String nomtitular) {
        this.nomtitular = nomtitular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
