package ejecucion;

import java.util.Scanner;
import menus.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal(scanner);
        menuPrincipal.mostrarMenu();   // Mostrar el menú principal
        scanner.close();
    }
}
