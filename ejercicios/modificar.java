
package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class modificar {

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
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar persona");
            System.out.println("2. Modificar persona");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Mostrar personas");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    lista.add(new Persona(nombre, edad, correo));
                    System.out.println("Persona agregada ✅");
                }
                case 2 -> {
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                        break;
                    }
                    mostrarPersonas(lista);
                    System.out.print("Número de persona a modificar: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();

                    if (idx >= 0 && idx < lista.size()) {
                        Persona p = lista.get(idx);
                        System.out.print("Nuevo nombre (" + p.nombre + "): ");
                        String nombre = sc.nextLine();
                        System.out.print("Nueva edad (" + p.edad + "): ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nuevo correo (" + p.correo + "): ");
                        String correo = sc.nextLine();

                        p.nombre = nombre;
                        p.edad = edad;
                        p.correo = correo;

                        System.out.println("Persona modificada ✅");
                    } else {
                        System.out.println("Índice inválido ❌");
                    }
                }
                case 3 -> {
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                        break;
                    }
                    mostrarPersonas(lista);
                    System.out.print("Número de persona a eliminar: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();

                    if (idx >= 0 && idx < lista.size()) {
                        lista.remove(idx);
                        System.out.println("Persona eliminada ✅");
                    } else {
                        System.out.println("Índice inválido ❌");
                    }
                }
                case 4 -> {
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        mostrarPersonas(lista);
                    }
                }
                case 5 -> salir = true;
                default -> System.out.println("Opción inválida ❌");
            }
        }

        sc.close();
    }

    private static void mostrarPersonas(ArrayList<Persona> lista) {
        System.out.println("\n=== Lista de Personas ===");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
  
}
