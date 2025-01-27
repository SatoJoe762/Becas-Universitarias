package LogicaBecasUniversitarias;

public abstract class Persona {

    protected String nombre;
    protected int edad;
    protected int ci;

    public Persona() {
    }

    public Persona(String nombre, int edad, int ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public abstract String tipoPersona();

    public void mostrar() {
        System.out.println("\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nCI: " + ci);
    }

    // Getters & Setters
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

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
