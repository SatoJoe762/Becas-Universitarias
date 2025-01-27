package LogicaBecasUniversitarias;

public class Estudiante extends Persona {

    private int RU;
    private String carrera;
    private String semestre;
    private int promedio;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, int edad, int ci, int RU,
            String carrera, String semestre, int promedio) {
        super(nombre, edad, ci);
        this.RU = RU;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    @Override
    public String tipoPersona() {
        return "Estudiante";
    }

    @Override
    public void mostrar() {
        System.out.println("\n=== Estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
        System.out.println("RU: " + RU);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
    }

    // Getters & Setters
    public int getRU() {
        return RU;
    }

    public void setRU(int RU) {
        this.RU = RU;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
