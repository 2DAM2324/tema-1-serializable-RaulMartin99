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
public class Consola implements Serializable{
    private String idConsola;
    private String nombre;
    private String marca;
    private int memoria;
    
    public Consola(String idConsola, String nombre, String marca, int memoria){
        this.idConsola = idConsola;
        this.nombre = nombre;
        this.marca = marca;
        this.memoria = memoria;
    }

    public String getIdConsola() {
        return idConsola;
    }

    public void setIdConsola(String idConsola) {
        this.idConsola = idConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}

