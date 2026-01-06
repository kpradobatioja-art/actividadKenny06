
package ejercicios;


import java.util.ArrayList;
import java.util.Scanner;


public class Consola {
    
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

        // Agregar personas iniciales para poder modificar
        lista.add(new Persona("Ana", 25, "ana@mail.com"));
        lista.add(new Persona("Luis", 30, "luis@mail.com"));

        System.out.println("=== Lista de Personas ===");
        mostrarPersonas(lista);

        System.out.print("\nNúmero de persona a modificar: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine(); // limpiar buffer

        if (idx >= 0 && idx < lista.size()) {
            Persona p = lista.get(idx);

            System.out.println("\n=== Modificar Persona (simulando diálogo) ===");
            System.out.print("Nuevo nombre (" + p.nombre + "): ");
            String nombre = sc.nextLine();

            System.out.print("Nueva edad (" + p.edad + "): ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.print("Nuevo correo (" + p.correo + "): ");
            String correo = sc.nextLine();

            // Actualizar datos
            p.nombre = nombre;
            p.edad = edad;
            p.correo = correo;

            System.out.println("\n✅ Persona modificada");
        } else {
            System.out.println("❌ Índice inválido");
        }

        System.out.println("\n=== Lista actualizada ===");
        mostrarPersonas(lista);

        sc.close();
    }

    private static void mostrarPersonas(ArrayList<Persona> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }

}
