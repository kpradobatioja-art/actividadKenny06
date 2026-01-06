
package ejercicios;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


  
public class GestorPersonal {
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

        // Agregar algunas personas de ejemplo
        lista.add(new Persona("Ana", 25, "ana@mail.com"));
        lista.add(new Persona("Luis", 30, "luis@mail.com"));
        lista.add(new Persona("Pedro", 20, "pedro@mail.com"));
        lista.add(new Persona("María", 28, "maria@mail.com"));

        System.out.println("=== Lista original ===");
        mostrarPersonas(lista);

        // Filtrar
        System.out.print("\nFiltrar personas con edad mínima: ");
        int edadMin = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("\n=== Personas filtradas (edad >= " + edadMin + ") ===");
        lista.stream()
                .filter(p -> p.edad >= edadMin)
                .forEach(System.out::println);

        // Ordenar
        lista.sort(Comparator.comparing(p -> p.nombre.toLowerCase()));
        System.out.println("\n=== Lista ordenada por nombre ===");
        mostrarPersonas(lista);

        sc.close();
    }

    private static void mostrarPersonas(ArrayList<Persona> lista) {
        for (Persona p : lista) {
            System.out.println(p);
        }
    }

}
