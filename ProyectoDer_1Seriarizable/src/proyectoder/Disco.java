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
public class Disco implements Serializable{
    private String idDisco;
    private int capacidad;
    
    public Disco(String idDisco, int capacidad){
        this.idDisco = idDisco;
        this.capacidad = capacidad;
    }

    public String getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(String idDisco) {
        this.idDisco = idDisco;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

