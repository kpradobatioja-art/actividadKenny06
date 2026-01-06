/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class añadir {
    
    static class Persona {
        String nombre;
        int edad;
        String correo;

        Persona(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }

        @Override
        public String toString() {
            return nombre + " | " + edad + " | " + correo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();

        System.out.println("=== Agregar Persona (simulando diálogo) ===");

        // "Diálogo" para ingresar datos
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        // Crear objeto Persona y agregarlo a la lista (tabla)
        Persona p = new Persona(nombre, edad, correo);
        lista.add(p);

        System.out.println("\n✅ Persona agregada a la tabla:");
        for (Persona persona : lista) {
            System.out.println(persona);
        }

        sc.close();
    }

}
