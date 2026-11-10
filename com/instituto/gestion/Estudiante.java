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
        
        // Una sentencia mas
        System.out.println("Nota media: " + notaMedia);
    }
    
    /**
     * Método para actualizar la nota media del estudiante
     * No devuelve nada (void)
     */
    public void setNotaMedia(double nuevaNota) {
        // 'nuevaNota' es un PARÁMETRO (un tipo de variable local)
        // 'notaMedia' es un ATRIBUTO (variable de instancia)
        notaMedia = nuevaNota;
        
        // 'mensaje' es una VARIABLE LOCAL pura
        // Solo existe desde que se declara hasta que se cierra el método
        String mensaje = "AVISO: La nota ha sido actualizada.";
        System.out.println(mensaje);
    }
    
    /**
     * Métodoque comprueba si el estudiante ha aprobado.
     * Utiliza una sentencia condicional (if).
     * Devuelve 'true' si ha aprobado, 'false' si no.
     */
    public boolean estaAprobado() {
        boolean resultado = false;
        // Un bloque de código para el 'if'
        if (notaMedia >= 5.0) {
            resultado = true; // Sentencia
        } else {
            // Un bloque de código para el 'else'
            resultado = false; //Sentencia
        }
        return resultado;
    }
}