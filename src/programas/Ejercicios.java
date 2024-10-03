package programas;

public class Ejercicios {


    public void ejemploByte() {
        byte letra = 'A'; // Un byte puede representar caracteres
        System.out.println("Ejemplo de BYTE: " + letra);
    }

    public void ejemploShort() {
        short num1 = 10000; // Un valor corto que se puede almacenar en short
        System.out.println("Ejemplo de SHORT: " + num1);
    }

    public void ejemploInt() {
        int edad = 25; // Un entero que representa la edad
        System.out.println("Ejemplo de INT: " + edad);
    }

    public void ejemploLong() {
        long distancia = 3680000L; // Un número entero grande
        System.out.println("Ejemplo de LONG: " + distancia);
    }

    public void ejemploFloat() {
        float temperatura = 36.5f; // Un número con punto decimal
        System.out.println("Ejemplo de FLOAT: " + temperatura);
    }

    public void ejemploDouble() {
        double pi = 3.14159265359; // Un número con mayor precisión
        System.out.println("Ejemplo de DOUBLE: " + pi);
    }

    public void ejemploChar() {
        char inicial = 'A'; // Un solo carácter
        System.out.println("Ejemplo de CHAR: " + inicial);
    }

    public void ejemploBoolean() {
        boolean esMayor = true; // Un valor de verdad
        System.out.println("Ejemplo de BOOLEAN: " + esMayor);
    }

    public void ejemploString() {
        System.out.println("Ejercicio de String:");
        String saludo = "Hola, mundo!";
        System.out.println("Saludo: " + saludo);
    }


    public void ejemploConstantes() {
        final int NUMERO_CONSTANTE = 100;
        System.out.println("Ejercicio de constantes:");
        System.out.println("La constante es: " + NUMERO_CONSTANTE);
    }


    public void ejemploOperadoresAritmeticos() {
        int a = 10, b = 5;
        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public void ejemploOperadoresRelacionales() {
        int a = 10, b = 5;
        System.out.println("Operadores Relacionales:");
        System.out.println("Igual a: " + (a == b));
        System.out.println("Diferente de: " + (a != b));
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Mayor o igual que: " + (a >= b));
        System.out.println("Menor o igual que: " + (a <= b));
    }

    public void ejemploOperadoresLogicos() {
        boolean x = true, y = false;
        System.out.println("Operadores Lógicos:");
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT: " + (!x));
    }

    public void ejemploOperadoresAsignacion() {
        int a = 10;
        System.out.println("Operadores de Asignación:");
        a += 5; // Suma
        System.out.println("a += 5: " + a);
        a -= 3; // Resta
        System.out.println("a -= 3: " + a);
        a *= 2; // Multiplicación
        System.out.println("a *= 2: " + a);
        a /= 4; // División
        System.out.println("a /= 4: " + a);
    }

    public void ejemploOperadoresIncrementoDecremento() {
        int a = 10;
        System.out.println("Operadores de Incremento/Decremento:");
        System.out.println("Valor original: " + a);
        System.out.println("Incremento: " + (++a)); // Pre-incremento
        System.out.println("Valor después del pre-incremento: " + a);
        System.out.println("Decremento: " + (--a)); // Pre-decremento
        System.out.println("Valor después del pre-decremento: " + a);
    }

    public void ejemploIf() {
        int numero = 10;
        System.out.println("Ejemplo de If:");
        if (numero > 5) {
            System.out.println(numero + " es mayor que 5.");
        }
    }

    public void ejemploElse() {
        int numero = 3;
        System.out.println("Ejemplo de Else:");
        if (numero > 5) {
            System.out.println(numero + " es mayor que 5.");
        } else {
            System.out.println(numero + " no es mayor que 5.");
        }
    }

    public void ejemploElseIf() {
        int numero = 5;
        System.out.println("Ejemplo de Else If:");
        if (numero > 5) {
            System.out.println(numero + " es mayor que 5.");
        } else if (numero == 5) {
            System.out.println(numero + " es igual a 5.");
        } else {
            System.out.println(numero + " es menor que 5.");
        }
    }

    public void ejemploSwitch() {
        int dia = 3;
        System.out.println("Ejemplo de Switch:");
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }
    }

    public void ejemploCase() {
        int mes = 2;
        System.out.println("\nEjemplo de Case:");
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
    }

    public void ejemploBreak() {
        int numero = 2;
        System.out.println("\nEjemplo de Break:");
        switch (numero) {
            case 1:
                System.out.println("Número uno");
                break; // Se sale del switch
            case 2:
                System.out.println("Número dos");
                break; // Se sale del switch
            case 3:
                System.out.println("Número tres");
                break; // Se sale del switch
            default:
                System.out.println("Número inválido");
                break; // Se sale del switch
        }
    }

    public void ejemploDefault() {
        int opcion = 5;
        System.out.println("\nEjemplo de Default:");
        switch (opcion) {
            case 1:
                System.out.println("Opción uno");
                break;
            case 2:
                System.out.println("Opción dos");
                break;
            default:
                System.out.println("Opción no válida, se ejecuta el default.");
                break; // Se ejecuta si no coincide con ningún case
        }
    }

    public void ejemploDoWhile() {
        int i = 0;
        System.out.println("Ejemplo de Do While:");
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i < 5);
    }

    public void ejemploWhile() {
        int j = 0;
        System.out.println("\nEjemplo de While:");
        while (j < 5) {
            System.out.println("Número: " + j);
            j++;
        }
    }

    public void ejemploFor() {
        System.out.println("\nEjemplo de For:");
        for (int k = 0; k < 5; k++) {
            System.out.println("Número: " + k);
        }
    }
}
