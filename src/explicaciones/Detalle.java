package explicaciones;

public class Detalle {
    public void mostrarExplicacionByte() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION BYTE               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa un entero, sin  -");
        System.out.println("-  signo de numero 0 a 255                     -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionShort() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION SHORT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato entero que ocupa menos espacio -");
        System.out.println("-  en memoria en comparación con otros tipos   -");
        System.out.println("-  de datos enteros como 'int'                 -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionInt() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION INT                -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros, no superiores a tres cifras        -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionLong(){
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION LONG               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros muy grandes, mayores a los que      -");
        System.out.println("-  soporta el tipo int                         -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionFloat(){
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION FLOAT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal, pero con precision       -");
        System.out.println("-  simple (aproximadamente 7 dígitos)          -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionDouble(){
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION DOUBLE              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal y mayor precision         -");
        System.out.println("-  que el tipo float (aproximadamente 15       -");
        System.out.println("-  dígitos).                                   -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionChar(){
        System.out.println("------------------------------------------------");
        System.out.println("-                EXPLICACION CHAR              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  un único carácter.                          -");
        System.out.println("------------------------------------------------");
    }

    public void mostrarExplicacionBoolean(){
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION BOOLEAN             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  valores de verdad, es decir, verdadero o    -");
        System.out.println("-  falso (true o false).                       -");
        System.out.println("------------------------------------------------");

    }

    public void explicacionString() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION STRING             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa una cadena de   -");
        System.out.println("-  caracteres.                                 -");
        System.out.println("------------------------------------------------");
    }

    public void explicacionConst() {
        System.out.println("------------------------------------------------");
        System.out.println("-          EXPLICACION DE CONSTANTE            -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Es un valor que no cambia durante la        -");
        System.out.println("-  ejecución de un programa. A diferencia de   -");
        System.out.println("-  las variables, cuyo valor puede modificarse,-");
        System.out.println("-  las constantes están diseñadas para mantener-");
        System.out.println("-  un valor fijo a lo largo de la ejecución del-");
        System.out.println("-  programa.                                   -");
        System.out.println("------------------------------------------------");
    }
    public void mostrarExplicacionAritmeticos() {
        System.out.println("---------------------------------------------------");
        System.out.println("-               OPERADORES ARITMÉTICOS            -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Tipo de operador que realiza operaciones        -");
        System.out.println("-  matemáticas básicas entre operandos.            -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                   -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  +               | Suma                          -");
        System.out.println("-  Ejemplo:        | int resultado = 5 + 3;        -");
        System.out.println("-  resultado       | 8                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  -               | Resta                         -");
        System.out.println("-  Ejemplo:        | int resultado = 10 - 4;       -");
        System.out.println("-  resultado       | 6                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  *               | Multiplicación                -");
        System.out.println("-  Ejemplo:        | int resultado = 7 * 6;        -");
        System.out.println("-  resultado       | 42                            -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  /               | División                      -");
        System.out.println("-  Ejemplo:        | int resultado = 20 / 4;       -");
        System.out.println("-  resultado       | 5                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  %               | Módulo (resto de la división) -");
        System.out.println("-  Ejemplo:        | int resultado = 15 % 4;       -");
        System.out.println("-  resultado       | 3                             -");
        System.out.println("----------------------------------------------------");
    }

    public void mostrarExplicacionRelacionales() {
        System.out.println("-----------------------------------------------------");
        System.out.println("-               OPERADORES RELACIONALES             -");
        System.out.println("-----------------------------------------------------");
        System.out.println("-  Tipo de operador que compara dos valores y       -");
        System.out.println("-  devuelve un resultado booleano (true o false).   -");
        System.out.println("-----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                    -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  ==              | Igual a                        -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 == 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  !=              | Diferente de                   -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 != 3);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  >               | Mayor que                      -");
        System.out.println("-  Ejemplo:        | boolean resultado = (7 > 4);   -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  <               | Menor que                      -");
        System.out.println("-  Ejemplo:        | boolean resultado = (3 < 6);   -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  >=              | Mayor o igual que              -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 >= 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  <=              | Menor o igual que              -");
        System.out.println("-  Ejemplo:        | boolean resultado = (4 <= 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-----------------------------------------------------");

    }

    public void mostrarExplicacionLogicos() {
        System.out.println("--------------------------------------------------");
        System.out.println("-               OPERADORES LÓGICOS               -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Tipo de operador que realiza operaciones      -");
        System.out.println("-  lógicas entre valores booleanos.              -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Operador        | Descripción                 -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  &&              | AND lógico                  -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 > 3) -");
        System.out.println("                   | && (8 < 10);                -");
        System.out.println("-  resultado       | true                        -");
        System.out.println("-  ----------------|---------------------------- -");
        System.out.println("-  ||              | OR lógico                   -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 > 3) -");
        System.out.println("                   | || (8 > 10);                -");
        System.out.println("-  resultado       | true                        -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  !               | NOT lógico                  -");
        System.out.println("-  Ejemplo:        | boolean resultado = !(5 > 3);-");
        System.out.println("-  resultado       | false                        -");
        System.out.println("--------------------------------------------------");

    }

    public void mostrarExplicacionAsignacion(){
        System.out.println("----------------------------------------------------");
        System.out.println("-               OPERADORES DE ASIGNACIÓN           -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Tipo de operador que asigna un valor a una      -");
        System.out.println("-  variable y a menudo combina la asignación       -");
        System.out.println("-  con una operación.                              -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                   -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  =               | Asignación simple             -");
        System.out.println("-  Ejemplo:        | int a = 10;                   -");
        System.out.println("-  resultado       | a será 10                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  +=              | Asignación con suma           -");
        System.out.println("-  Ejemplo:        | int a = 10; a += 5;           -");
        System.out.println("-  resultado       | a será 15                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  -=              | Asignación con resta          -");
        System.out.println("-  Ejemplo:        | int a = 10; a -= 3;           -");
        System.out.println("-  resultado       | a será 7                      -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  *=              | Asignación con multiplicación -");
        System.out.println("-  Ejemplo:        | int a = 10; a *= 4;           -");
        System.out.println("-  resultado       | a será 40                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  /=              | Asignación con división       -");
        System.out.println("-  Ejemplo:        | int a = 20; a /= 4;           -");
        System.out.println("-  resultado       | a será 5                      -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  %=              | Asignación con módulo         -");
        System.out.println("-  Ejemplo:        | int a = 20; a %= 6;           -");
        System.out.println("-  resultado       | a será 2                      -");
        System.out.println("----------------------------------------------------");

    }

    public void mostrarExplicacionIncreDecre(){
        System.out.println("--------------------------------------------------");
        System.out.println("-       OPERADORES DE INCREMENTO/DECREMENTO      -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Tipo de operador que aumenta o disminuye el   -");
        System.out.println("-  valor de una variable en 1.                   -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Operador        | Descripción                 -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  ++              | Incrementa después de usar  -");
        System.out.println("-  Ejemplo:        | int a = 5;                  -");
        System.out.println("-  Ejemplo:        | int b = a++;                -");
        System.out.println("-  Resultado       | a será 6, b será 5          -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  --              | Decrementa después de usar  -");
        System.out.println("-  Ejemplo:        | int a = 5;                  -");
        System.out.println("-  Ejemplo:        | int b = a--;                -");
        System.out.println("-  Resultado       | a será 4, b será 5          -");
        System.out.println("--------------------------------------------------");
    }
    public void mostrarExplicacionIf(){
        System.out.println("----------------------------------------------------");
        System.out.println("-                  EXPLICACION IF                  -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Se utiliza para evaluar una condicion           -");
        System.out.println("-  y ejecutar un bloque de codigo si               -");
        System.out.println("-  la condicion es verdadera (true).               -");
        System.out.println("----------------------------------------------------");
    }

    public void mostrarExplicacionElse(){
        System.out.println("---------------------------------------------------");
        System.out.println("-               EXPLICACION ELSE                  -");
        System.out.println("---------------------------------------------------");
        System.out.println("-  Se utiliza junto con 'if' para ejecutar        -");
        System.out.println("-  un bloque de codigo cuando la condicion        -");
        System.out.println("-  evaluada en el 'if' es falsa.                  -");
        System.out.println("---------------------------------------------------");
    }

    public void mostrarExplicacionElseIf(){
        System.out.println("----------------------------------------------------");
        System.out.println("-                EXPLICACION ELSE IF               -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Se utiliza para evaluar multiples               -");
        System.out.println("-  condiciones en una estructura condicional.      -");
        System.out.println("-  Si la primera condicion es falsa,               -");
        System.out.println("-  evalua la siguiente con 'else if'.              -");
        System.out.println("----------------------------------------------------");

    }
    public void ExplicacionSwitch(){
        System.out.println("------------------------------------------------------");
        System.out.println("-                  EXPLICACION SWITCH                -");
        System.out.println("------------------------------------------------------");
        System.out.println("-  Se utiliza para evaluar una expresión y           -");
        System.out.println("-  ejecutar un bloque de código basado en el         -");
        System.out.println("-  valor de la expresión. Los valores se             -");
        System.out.println("-  comparan con los valores de los casos.            -");
        System.out.println("------------------------------------------------------");
    }

    public void ExplicacionCase(){
        System.out.println("-------------------------------------------------");
        System.out.println("-                EXPLICACION CASE               -");
        System.out.println("-------------------------------------------------");
        System.out.println("-  Define un valor que la expresión en el       -");
        System.out.println("-  switch puede coincidir. Si coincide, se      -");
        System.out.println("-  ejecutan las instrucciones dentro de ese     -");
        System.out.println("-  bloque de código.                            -");
        System.out.println("-------------------------------------------------");
    }

    public void ExplicacionBreak(){
        System.out.println("-------------------------------------------------");
        System.out.println("-                EXPLICACION BREAK              -");
        System.out.println("-------------------------------------------------");
        System.out.println("-  Se utiliza para salir del bloque `switch`    -");
        System.out.println("-  una vez que se ha ejecutado el código de un  -");
        System.out.println("-  `case`. Evita que los casos siguientes se    -");
        System.out.println("-  ejecuten automáticamente.                    -");
        System.out.println("-------------------------------------------------");
    }

    public void ExplicacionDef(){
        System.out.println("---------------------------------------------------");
        System.out.println("-               EXPLICACION DEFAULT               -");
        System.out.println("---------------------------------------------------");
        System.out.println("-  Se utiliza para manejar el caso en el que      -");
        System.out.println("-  ningún valor de `case` coincide con el         -");
        System.out.println("-  valor de la expresión del `switch`. Es         -");
        System.out.println("-  similar a un bloque `else` en una estructura   -");
        System.out.println("-  condicional.                                   -");
        System.out.println("---------------------------------------------------");
    }

    public void ExplicacionDoWhile(){
        System.out.println("--------------------------------------------------------");
        System.out.println("-                EXPLICACION DO-WHILE                  -");
        System.out.println("--------------------------------------------------------");
        System.out.println("-  Se utiliza para ejecutar un bloque de código        -");
        System.out.println("-  al menos una vez, y luego repetir la                -");
        System.out.println("-  ejecución mientras una condición sea verdadera.     -");
        System.out.println("-  La condición se evalúa después de la                -");
        System.out.println("-  ejecución del bloque, por lo que el bloque          -");
        System.out.println("-  de código siempre se ejecutará al menos una         -");
        System.out.println("-  vez.                                                -");
        System.out.println("--------------------------------------------------------");
    }

    public void ExplicacionWhile(){
        System.out.println("---------------------------------------------------------");
        System.out.println("-                EXPLICACION WHILE                      -");
        System.out.println("---------------------------------------------------------");
        System.out.println("-  Se utiliza para ejecutar un bloque de código         -");
        System.out.println("-  mientras una condición sea verdadera. La condicion   -");
        System.out.println("-  se evalúa antes de ejecutar el bloque de codigo,     -");
        System.out.println("-  por lo que el bloque de codigo puede no ejecutarse   -");
        System.out.println("-  si la condición es falsa desde el inicio.            -");
        System.out.println("---------------------------------------------------------");
    }

    public void ExplicacionFor(){
        System.out.println("---------------------------------------------------");
        System.out.println("-                EXPLICACION FOR                  -");
        System.out.println("---------------------------------------------------");
        System.out.println("-  Se utiliza para ejecutar un bloque de código   -");
        System.out.println("-  un número determinado de veces. Permite        -");
        System.out.println("-  inicializar una variable de control,           -");
        System.out.println("-  establecer una condición de continuación,      -");
        System.out.println("-  y actualizar la variable de control en una     -");
        System.out.println("-  sola línea.                                    -");
        System.out.println("---------------------------------------------------");

    }
}
