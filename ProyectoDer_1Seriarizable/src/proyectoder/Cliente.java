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

public class Cliente implements Serializable{
    private String idCliente;
    private String nombre;
    private String apellido;
    private int anio;
    
    public Cliente(String idCliente, String nombre, String apellido, int anio){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio = anio;
    }

    

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
