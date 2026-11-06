package com.instituto.gestion;


/**
 * Representa a un/a estudiante del instituto
 * @author (Camilo)
 */
public class Estudiante {
    // Esta es la definición de la clase
    
    // Aquí dentro irá nuestro nuevo código
    
    // --- Atributos (Variables de Instancia) ---
    // Almacenan el estado (los datos) de cada objeto Estudiante
    private String nombre;
    private int edad;
    private double notaMedia; // Un número decimal para la nota
    /**
     * Método para mostrar la información del estudiante por consola
     */
    public void mostrarInformacion() {
        // Este es el bloque de código del método
        
        // Esto es una sentencia
        System.out.println("--- Ficha de Estudiante ---");
        
        // Otra sentencia
        System.out.println("Nombre: " + nombre);
        
        // Y otra sentencia
        System.out.println("Edad: " + edad);
    }
}