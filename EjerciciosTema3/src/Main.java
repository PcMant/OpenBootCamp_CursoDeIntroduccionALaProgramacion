public class Main {

    /*
    Primera parte:
        - Crear una función con tres parámetros que sean números que se suman entre sí.
        - Llamar a la función en el main y darle valores.

    Segunda parte:
        - Crear una clase coche.
        - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        - Una función que incremente el número de puertas que tiene el coche.
        - Crear un objeto miCoche en el main y añadirle una puerta.
        - Mostrar el número de puertas que tiene el objeto.
        */
    public static int suma(int a, int b, int c){
         return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Primera parte
        System.out.println("El resultado de la suma es: "+suma(2, 2, 2));

        // Segunda parte
        Coche miCoche = new Coche(4);
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas del coche: "+miCoche.getPuertas());
    }
}