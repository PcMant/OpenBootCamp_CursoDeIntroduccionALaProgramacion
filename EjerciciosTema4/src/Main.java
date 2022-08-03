/*
Ejercicios tema 4

En este ejercicio practicarás las estructuras de control, para ello deberás crear:
    - Usando un if, crear una condición que compare si la variable numeroIf
    es positivo, negativo o 0.
    - Crea un bucle While, este bucle tendrá que tener como condición que la
    variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
    bucle deberá:
      - Incrementar el valor de la variable cada vez que se ejecute.
      - Mostrando por pantalla cada vez que se ejecute.
    - Para el bucle Do While, deberás crear la misma estructura que en el While,
    pero solo debe ejecutar una vez.
    - Para el bucle For, crea una variable numeroFor, esta variable tendrá como
    valor 0 y su condición será la variable sea igual o menor que 3, se irá
    incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
    pantalla.
    - Por último, para el Switch, deberá crear la variable estación, y distintos
    case para que las cuatro estaciones del año. Dependiendo del valor de la
    variable se deberá mandar un mensaje por consola informando de la estación
    en la que está. También habrá que poner un default para cuando el valor de
    la variable no sea una estación.
*/

public class Main {
    public static void main(String[] args) {

        // IF
        /*
        - Usando un if, crear una condición que compare si la variable numeroIf
        es positivo, negativo o 0.
        */
        int numeroIf = 1;

        if(numeroIf > 0){
            System.out.println("La variable numeroIf con el valor "+numeroIf+" es de valor positivo.");
        } else if (numeroIf < 0) {
            System.out.println("La variable numeroIf con el valor "+numeroIf+" es de valor negativo.");
        }else {
            System.out.println("La variable numeroIf no es positiva ni negativa debido a que su valor es 0");
        }

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        // WHILE
        /*
        - Crea un bucle While, este bucle tendrá que tener como condición que la
        variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
        bucle deberá:
          - Incrementar el valor de la variable cada vez que se ejecute.
          - Mostrando por pantalla cada vez que se ejecute.
        */
        int numeroWhile = 0;

        while (numeroWhile <= 3){
            System.out.println("El valor de la variable numeroWhile es: "+numeroWhile);
            numeroWhile++;
        }

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        // DO WHILE
        /*
         - Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo debe ejecutar una vez.
        */
        int numeroDoWhile = 0;

        do{
            System.out.println("El valor de la variable numeroDoWhile es: "+numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile > numeroDoWhile+1);

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        // FOR
        /*
        - Para el bucle For, crea una variable numeroFor, esta variable tendrá como
        valor 0 y su condición será la variable sea igual o menor que 3, se irá
        incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
        pantalla.
        */
        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("Valor de numeroFor: "+numeroFor);
        }

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        // SWITCH
        /*
        - Por último, para el Switch, deberá crear la variable estación, y distintos
        case para que las cuatro estaciones del año. Dependiendo del valor de la
        variable se deberá mandar un mensaje por consola informando de la estación
        en la que está. También habrá que poner un default para cuando el valor de
        la variable no sea una estación.
        */
        String estacion = "verano";

        switch (estacion){
            case "otoño": System.out.println("Estamos en otoño."); break;
            case "invierno": System.out.println("Estamos en invierno."); break;
            case "primavera": System.out.println("Estamos en primavera."); break;
            case "verano": System.out.println("Estamos en verano."); break;
            default: System.out.println("El valor de la variable estacion no corresponde a las estaciones del año");
        }
    }
}