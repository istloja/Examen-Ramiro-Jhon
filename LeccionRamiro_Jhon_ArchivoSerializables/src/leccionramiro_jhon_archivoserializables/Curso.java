/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionramiro_jhon_archivoserializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Curso implements Serializable {
    private String carrera;
    private String nombre;
    private int ciclo;
    private int numestudiantes;

    public Curso() {
    }

    public Curso(String carrera, String nombre, int ciclo, int estudiantes) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.numestudiantes = estudiantes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getEstudiantes() {
        return numestudiantes;
    }

    public void setEstudiantes(int estudiantes) {
        this.numestudiantes = estudiantes;
    }
    
    
}
