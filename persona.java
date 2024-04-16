public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30, "Masculino", "123 Calle Principal", "Ingeniero");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Dirección: " + persona1.getDireccion());
        System.out.println("Ocupación: " + persona1.getOcupacion());

        persona1.setEdad(35);
        System.out.println("Nueva edad: " + persona1.getEdad());

        System.out.println(persona1);
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String ocupacion;

    public Persona(String nombre, int edad, String genero, String direccion, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }
}
