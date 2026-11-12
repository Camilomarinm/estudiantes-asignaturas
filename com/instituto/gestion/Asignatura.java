package com.instituto.gestion;


/**
 * Representa una Asignatura del Instituo
 * Camilo Marín
 */
public class Asignatura
{
    // Atributos
    private String nombre;
    private int creditos;
    
    public void setNombre(String elNombre) {
        nombre = elNombre;
    }
    
    public void setCreditos(int losCreditos) {
        creditos = losCreditos;
    }
    
    public void mostrarInfoAsignatura() {
        System.out.println("Nombre de la Asignatura: " + nombre);
        System.out.println("Créditos de la Asignatura: " + creditos);
    }
}