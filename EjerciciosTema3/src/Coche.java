public class Coche {
    /*
    Segunda parte:
        - Crear una clase coche.
        - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        - Una función que incremente el número de puertas que tiene el coche.
        - Crear un objeto miCoche en el main y añadirle una puerta.
        - Mostrar el número de puertas que tiene el objeto.
    */

    private int puertas = 0;

    Coche(int puertas){
        this.puertas = puertas;
    }

    public int getPuertas(){
        return puertas;
    }

    public void incrementarPuertas(){
        puertas++;
    }
}
