/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivosserializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Mascota implements Serializable {
    private String nombre;
    private int edad;
    private int numpatas;

    public String getNombre() {
        return nombre;
    }

    public Mascota() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }

    public Mascota(String nombre, int edad, int numpatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numpatas = numpatas;
    }
    
    
}
