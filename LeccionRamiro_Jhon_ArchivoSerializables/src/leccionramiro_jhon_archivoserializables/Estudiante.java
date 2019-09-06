/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionramiro_jhon_archivoserializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Estudiante implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;
    private String dirreccion;
    private Curso curso;
    private Direccion direccion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, double promedio, String dirreccion, Curso curso, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
        this.dirreccion = dirreccion;
        this.curso = curso;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDireccion(String direccion) {
        this.dirreccion = dirreccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void escribirObjeto(String direccion, Estudiante objeto) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(objeto);
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se produjo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante objeto = (Estudiante) auxiliar;

        } catch (Exception e) {
            System.out.println(e);
        }

    }
        public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Estudiante> leerPersona(String direccion) {
        List<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public int edadMenor(List<Estudiante> lista) {
        int mayor = lista.get(0).getEdad();

        for (Estudiante estudiante : lista) {
            if (estudiante.getEdad() < 18) {
                mayor = estudiante.getEdad();
                System.out.println(" Nombre: " + estudiante.getNombre() + estudiante.getApellido() + " " + mayor);
            } else {

            }
        }
        return mayor;

    }
        public double mayorProm(List<Estudiante> lista) {
        double mayor = lista.get(0).getPromedio();

        for (Estudiante estudiante : lista) {
            if (estudiante.getPromedio()>=10) {
                mayor = estudiante.getPromedio();
                System.out.println(" Nombre: " + estudiante.getNombre() + estudiante.getApellido() + " " + mayor);
            } else {
            }
        }
        return mayor;

    }

    public Estudiante mayorEstudiante(List<Estudiante> lista) {
        Estudiante mayorestudiante = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (mayorestudiante.curso.getEstudiantes() < mayorestudiante.curso.getEstudiantes()) {
                mayorestudiante = estudiante;               
            }             
        }
        return mayorestudiante;
    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();
        Estudiante objeto1 = new Estudiante(" Jhon ", " Puglla ", 18, 8.5, " Malacatos ", new Curso("Desarrollo de Software", "Programador", 2, 25), new Direccion("Malacatos", "Rocafuerte", 4));
        Estudiante objeto2 = new Estudiante(" Ramiro ", "Capa", 20, 8.9, " Loja ", new Curso("Desarrollo de Software", "Tester", 2, 22), new Direccion("Loja", "Avenida Benjamin Carrion", 11 - 04));
        Estudiante objeto3 = new Estudiante(" Andersson ", " Guzman ", 19, 9.0, " San Pedro ", new Curso("Desarrollo de Software", "Analista", 2, 15), new Direccion("San Pedro", "San Vicente", 33));
        Estudiante objeto4 = new Estudiante(" Oscar ", " Suarez ", 27, 7.5, " Vilcabamba ", new Curso("Desarrollo de Software", "Programador", 2, 25), new Direccion("Vilcabamba", "Yamburara", 55));
        Estudiante objeto5 = new Estudiante(" Luis ", " Quevedo ", 19, 7.9, " Nangora ", new Curso("Desarrollo de Software", "Diseñador", 2, 20), new Direccion("Nangora", "Brasil", 23));
        Estudiante objeto6 = new Estudiante(" Francel ", " Pineda ", 20, 10.0, " Vilcabamba ", new Curso("Desarrollo de Software", "Coach", 2, 10), new Direccion("Cucanama", "Quinara", 77));
        Estudiante objeto7 = new Estudiante(" Kevin ", " Tapia ", 19, 8.0, " Rumishitana ", new Curso("Desarrollo de Software", "Programador", 2, 25), new Direccion("Rumishitana", "Yamba", 62));
        Estudiante objeto8 = new Estudiante(" Cinthya ", " Godoy ", 22, 9.0, "Loja", new Curso("Contabilidad", "Contabilidad", 3, 30), new Direccion("Ciudad Alegria", "San Agustin", 101));
        Estudiante objeto9 = new Estudiante(" Tania ", " Guaman ", 18, 9.5, "Malacatos", new Curso("Contabilidad", "Contabilidad", 3, 29), new Direccion("Cementerio", "Sucre", 76));
        Estudiante objeto10 = new Estudiante(" Paulina ", " Quezada ", 17, 9.0, "Vilcabamba", new Curso("Contabilidad", "Contabilidad", 3, 28), new Direccion("Yamburara", "San Miguel", 99));
        List<Estudiante> lista = new ArrayList<>();

        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        lista.add(objeto7);
        lista.add(objeto8);
        lista.add(objeto9);
        lista.add(objeto10);
        int a = lista.size();
        objeto.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\Leccion.txt");
        objeto.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop\\Leccion.txt", objeto);
        objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\Leccion.txt");
        objeto.edadMenor(lista);
        objeto.mayorProm(lista);
        System.out.println(" el curso con mas estudiantes es: "+objeto.mayorEstudiante(lista).curso.getEstudiantes());

    }
}
