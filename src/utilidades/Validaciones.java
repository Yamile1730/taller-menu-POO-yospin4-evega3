package utilidades;

import java.util.Scanner;

public class Validaciones {
    public int obtenerOpcionValida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un caracter válido (numero).");
            scanner.next();
            System.out.println("Ingrese su opcion: ");
        }
        return scanner.nextInt();
    }
}

