package calculadoraGIT;
import java.util.Scanner;
public class calculadoraGIT {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        
        // Pedir al usuario que ingrese el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Sumar los dos números
        int resultado = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        
        // Cerrar el objeto Scanner
        scanner.close();

	}

}
