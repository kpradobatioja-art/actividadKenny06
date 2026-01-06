
package ejercicios;
import java.util.Scanner;
public class Suma {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer datos

        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = num1 + num2;

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
   

