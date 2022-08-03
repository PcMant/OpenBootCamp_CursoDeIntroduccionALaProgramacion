/*
- Crear un objeto persona en el main.
- Utiliza gets y sets para darle valores a las propiedades edad, nombre
y teléfono, por último muéstralas por consola.
*/
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad((byte) 27);
        persona1.setTelefono(999999999);

        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Teléfono: "+persona1.getTelefono());
    }
}