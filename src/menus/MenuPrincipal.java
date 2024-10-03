package menus;

import explicaciones.Detalle;
import utilidades.Validaciones;
import programas.Ejercicios;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;
    private Detalle detalle;
    private Validaciones validaciones;
    private Ejercicios ejercicios;

    public MenuPrincipal(Scanner scanner) {
        this.scanner = scanner;
        this.detalle = new Detalle();
        this.validaciones = new Validaciones();
        this.ejercicios = new Ejercicios();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-        MENU CAPITULO DE PROGRAMACION         -");
            System.out.println("-         YIBETH OSPINA Y YAMILE VEGA          -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Datos primitivos.                  -");
            System.out.println("-        2. String                             -");
            System.out.println("-        3. Constante                          -");
            System.out.println("-        4. Tipo de operadores                 -");
            System.out.println("-        5. Condicional IF, ELSE, IF ELSE      -");
            System.out.println("-        6. Condicional Switch                 -");
            System.out.println("-        7. Condicional Ternaria               -");
            System.out.println("-        8. Bucle DO WHILE                     -");
            System.out.println("-        9. Bucle WHILE                        -");
            System.out.println("-        10. Bucle FOR                         -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcionPrincipal = validaciones.obtenerOpcionValida(scanner);

            switch (opcionPrincipal) {
                case 1:
                    new SubMenus(scanner, detalle, validaciones, ejercicios).mostrarSubMenusDatosPrimitivos();
                    break;
                case 2:
                    detalle.explicacionString();
                    ejercicios.ejemploString();
                    break;
                case 3:
                    detalle.explicacionConst();
                    ejercicios.ejemploConstantes();
                    break;
                case 4:
                    new SubMenus(scanner, detalle, validaciones, ejercicios).mostrarSubMenusTipoOperadores();
                    break;
                case 5:
                    new SubMenus(scanner, detalle, validaciones, ejercicios).mostrarSubMenusCondicionales();
                    break;
                case 6:
                    new SubMenus(scanner, detalle, validaciones, ejercicios).mostrarSubMenusCondicionalSwitch();
                    break;
                case 7:

                    break;
                case 8:
                    detalle.ExplicacionDoWhile();
                    ejercicios.ejemploDoWhile();
                    break;
                case 9:
                    detalle.ExplicacionWhile();
                    ejercicios.ejemploWhile();
                    break;
                case 10:
                    detalle.ExplicacionFor();
                    ejercicios.ejemploFor();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
