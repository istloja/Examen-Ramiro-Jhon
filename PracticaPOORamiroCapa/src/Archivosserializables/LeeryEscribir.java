/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivosserializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class LeeryEscribir {

    public void escribirObjeto(String direccion, Persona objeto) {
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
            Object auxiliar = lector.readObject();//solo sirve para leer una linea de texto
            Persona objeto = (Persona) auxiliar;
            System.out.println(objeto.getMascota().getNombre() + " su edad es es: " + objeto.getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void EscribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            //recorrer una lista y por cada vez que recorre se crea un objeto de la clase persona
            for (Persona persona : lista) {
                escritor.writeObject(persona);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {//mientras no sea nulo permite ejecutar
                Persona objeto = (Persona) auxiliar;
                System.out.println(objeto.getMascota().getNombre() + " su edad es: " + objeto.getMascota().getEdad());
                auxiliar = lector.readObject();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Persona> leerPersona(String direccion) {
        List<Persona> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona objeto = (Persona) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona ob = new Persona("Jhosselin1", "Carpio", "0995261713", 18, new Mascota("Ban1", 6, 4));
        Persona obe = new Persona("Jhosselin2", "Carpio", "0995261713", 18, new Mascota("Ban2", 6, 4));
        Persona obej = new Persona("Jhosselin3", "Carpio", "0995261713", 18, new Mascota("Ban3", 6, 4));
        Persona objec = new Persona("Jhosselin4", "Carpio", "0995261713", 18, new Mascota("Ban4", 6, 4));
//        List<Persona> lista = new ArrayList<>();//creamos la lista para guardar objetos
//        //una vez que creamos la lista, ponemos los objetos dentro de ella
//        lista.add(ob);
//        lista.add(obe);
//        lista.add(obej);
//        lista.add(objec);
//        int a = lista.size();
//        System.out.println(a);//obtengo el tamaño de la lista
//        for (Persona persona : lista) {
//            System.out.println(persona.getNombre());
//        }
        //objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", lista);
        //objeto.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", ob);
        //objeto.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
        //objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
        //objeto.leerPersona("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
        List<Persona> b = objeto.leerPersona("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
        for (Persona persona : b) {
            System.out.println(persona.getEdad());
            
        }

    }
}
