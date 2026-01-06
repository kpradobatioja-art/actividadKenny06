
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class gestiones {
  
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
            return "Nombre: " + nombre + ", Edad: " + edad + ", Correo: " + correo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();

        System.out.println("=== Agregar Personas ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();  // limpiar buffer

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        Persona p = new Persona(nombre, edad, correo);
        lista.add(p);

        System.out.println("\n=== Lista de Personas ===");
        for (Persona persona : lista) {
            System.out.println(persona);
        }

        sc.close();
    }
}
