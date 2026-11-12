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
        
        // --- Llamando a sus métodos (acciones) ---
        System.out.println("--- Mostrando datos del primer estudiante ---");
        estudiante1.mostrarInformacion();
        
        System.out.println("--- Mostrando datos del segundo estudiante ---");
        estudiante2.mostrarInformacion();
        
        // --- Usar los otros métodos ---
        System.out.println("--- Actualizando notas... ---");
        estudiante1.setNotaMedia(7.5); // Le pasamos 7.5
        estudiante2.setNotaMedia(4.2); // Le pasamos 4.2
        
        // Volvemos a mostrar la info para ver el cambio
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        
        // --- Comprobar si han aprobado ---
        System.out.println("¿Ha aprobado " + estudiante1.getNombre() + "?" + estudiante1.estaAprobado());
        System.out.println("¿Ha aprobado " + estudiante2.getNombre() + "?" + estudiante2.estaAprobado());
        
        // --- Probando la clase Asignatura ---
        System.out.println("--- Datos de la Asignatura ---");
        Asignatura modulo1 = new Asignatura();
        // Usamos los setters
        modulo1.setNombre("Bases de datos");
        modulo1.setCreditos(6);
        
        modulo1.mostrarInfoAsignatura();
    }
}