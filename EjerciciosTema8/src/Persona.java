/*
- Crear la clase persona.
- Crear variables las privadas edad, nombre y teléfono de la clase persona.
- Crear gets y sets de cada propiedad.
*/
public class Persona {

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    private byte edad;
    private String nombre;
    private int telefono;
}
