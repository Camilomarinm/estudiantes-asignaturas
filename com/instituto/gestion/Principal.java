package com.instituto.gestion;

/**
 * Clase principal que ejecutará nuestro programa.
 * Contiene el método main.
 */
public class Principal {
    
    /**
     * El punto de entrada del programa
     * Contiene el método main.
     */
    public static void main(String[] args) {
        // (Aquí escribiremos el código para USAR la clase Estudiante)
        System.out.println("¡El programa se ha iniciado!");
        
        // 1. Crear (instanciar) un objeto usando el molde Estudiante
        Estudiante estudiante1 = new Estudiante();
        
        // 2. Asignar sus datos usando los SETTERS
        estudiante1.setNombre("Ana García");
        estudiante1.setEdad(20);
        
        // 3. Crear un segundo objeto y asignar sus datos
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Luis F. Martos");
        estudiante2.setEdad(22);
    }
}