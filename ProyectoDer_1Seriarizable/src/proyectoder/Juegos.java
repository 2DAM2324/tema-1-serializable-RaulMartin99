/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoder;

import java.io.Serializable;

/**
 *
 * @author raulm
 */
public class Juegos implements Serializable{
    private String idJuego;
    private String nombre;
    private String empresaDesarrollo;
    private int pegi;

    public Juegos(String idJuego, String nombre, String empresaDesarrollo, int pegi) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.pegi = pegi;
    }

    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }
    
    
    
}
