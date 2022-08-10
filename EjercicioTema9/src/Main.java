public class Main {

    public static void main(String[] args) {

        class Persona {

            byte edad;
            String nombre;
            int telefono;

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
        }

        class Cliente extends Persona{
            float credito;

            public void setCredito(float credito) {
                this.credito = credito;
            }

            public float getCredito() {
                return credito;
            }
        }

        class Trabajador extends Persona{
            float salario;

            public void setSalario(float salario) {
                this.salario = salario;
            }

            public float getSalario() {
                return salario;
            }
        }

        System.out.println("=========================");
        System.out.println("Mostrando datos del cliente");
        Cliente cliente = new Cliente();
        cliente.setEdad((byte) 30);
        cliente.setTelefono(999999999);
        cliente.setNombre("Alfredo");
        cliente.setCredito(350);
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Teléfono: "+cliente.getTelefono());
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Crédito: "+cliente.getCredito());

        System.out.println();

        System.out.println("=========================");
        System.out.println("Mostrando datos del Trabajador");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad((byte) 27);
        trabajador.setTelefono(888888888);
        trabajador.setNombre("Juan");
        trabajador.setSalario(2500);
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Teléfono: "+trabajador.getTelefono());
        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Salario: "+trabajador.getSalario());
    }
}