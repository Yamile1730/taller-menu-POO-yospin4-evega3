package menus;

import explicaciones.Detalle;
import utilidades.Validaciones;
import programas.Ejercicios;

import java.util.Scanner;

public class SubMenus {
    private Scanner scanner;
    private Detalle detalle;
    private Validaciones validaciones;
    private Ejercicios ejercicios;

    public SubMenus(Scanner scanner, Detalle detalle, Validaciones validaciones, Ejercicios ejercicios) {
        this.scanner = scanner;
        this.detalle = detalle;
        this.validaciones = validaciones;
        this.ejercicios = ejercicios;
    }

    public void mostrarSubMenusDatosPrimitivos() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-               DATOS PRIMITIVOS               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Explicacion byte                   -");
            System.out.println("-        2. Explicacion short                  -");
            System.out.println("-        3. Explicacion int                    -");
            System.out.println("-        4. Explicacion long                   -");
            System.out.println("-        5. Explicacion float                  -");
            System.out.println("-        6. Explicacion double                 -");
            System.out.println("-        7. Explicacion char                   -");
            System.out.println("-        8. Explicacion boolean                -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion1 = validaciones.obtenerOpcionValida(scanner);

            switch (opcion1) {
                case 1:
                    detalle.mostrarExplicacionByte();
                    ejercicios.ejemploByte();
                    break;
                case 2:
                    detalle.mostrarExplicacionShort();
                    ejercicios.ejemploShort();
                    break;
                case 3:
                    detalle.mostrarExplicacionInt();
                    ejercicios.ejemploInt();
                    break;
                case 4:
                    detalle.mostrarExplicacionLong();
                    ejercicios.ejemploLong();
                    break;
                case 5:
                    detalle.mostrarExplicacionFloat();
                    ejercicios.ejemploFloat();
                    break;
                case 6:
                    detalle.mostrarExplicacionDouble();
                    ejercicios.ejemploDouble();
                    break;
                case 7:
                    detalle.mostrarExplicacionChar();
                    ejercicios.ejemploChar();
                    break;
                case 8:
                    detalle.mostrarExplicacionBoolean();
                    ejercicios.ejemploBoolean();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void mostrarSubMenusTipoOperadores(){
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-             TIPO DE OPERADORES               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Aritmeticos                        -");
            System.out.println("-        2. Relacionales                       -");
            System.out.println("-        3. Logicos                            -");
            System.out.println("-        4. Asignacion                         -");
            System.out.println("-        5. Incremento/Decremento              -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion4 = validaciones.obtenerOpcionValida(scanner);

            switch(opcion4) {
                case 1:
                    detalle.mostrarExplicacionAritmeticos();
                    ejercicios.ejemploOperadoresAritmeticos();
                    break;
                case 2:
                    detalle.mostrarExplicacionRelacionales();
                    ejercicios.ejemploOperadoresRelacionales();
                    break;
                case 3:
                    detalle.mostrarExplicacionLogicos();
                    ejercicios.ejemploOperadoresLogicos();
                    break;
                case 4:
                    detalle.mostrarExplicacionAsignacion();
                    ejercicios.ejemploOperadoresAsignacion();
                    break;
                case 5:
                    detalle.mostrarExplicacionIncreDecre();
                    ejercicios.ejemploOperadoresIncrementoDecremento();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return; // Salir del bucle y regresar al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public void mostrarSubMenusCondicionales(){
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-                CONDICIONALES                 -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. If                                 -");
            System.out.println("-        2. Else                               -");
            System.out.println("-        3. Else if                            -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion5 = validaciones.obtenerOpcionValida(scanner);

            switch (opcion5) {
                case 1:
                    detalle.mostrarExplicacionIf();
                    ejercicios.ejemploIf();
                    break;
                case 2:
                    detalle.mostrarExplicacionElse();
                    ejercicios.ejemploElse();
                    break;
                case 3:
                    detalle.mostrarExplicacionElseIf();
                    ejercicios.ejemploElseIf();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public void mostrarSubMenusCondicionalSwitch(){
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-             CONDICIONAL SWITCH               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Switch                             -");
            System.out.println("-        2. Case                               -");
            System.out.println("-        3. Break                              -");
            System.out.println("-        4. Default                            -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion6 = validaciones.obtenerOpcionValida(scanner);
            switch (opcion6){
                case 1:
                    detalle.ExplicacionSwitch();
                    ejercicios.ejemploSwitch();
                    break;
                case 2:
                    detalle.ExplicacionCase();
                    ejercicios.ejemploCase();
                    break;
                case 3:
                    detalle.ExplicacionBreak();
                    ejercicios.ejemploBreak();
                    break;
                case 4:
                    detalle.ExplicacionDef();
                    ejercicios.ejemploDefault();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}

