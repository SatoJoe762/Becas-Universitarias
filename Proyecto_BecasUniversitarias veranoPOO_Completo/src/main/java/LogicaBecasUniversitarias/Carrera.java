package LogicaBecasUniversitarias;

public class Carrera {

    private String nombreCarrera;
    private int nroSemestres;
    private Estudiante[] estudiantes;
    private int contadorEst;

    public Carrera(String nombreCarrera, int nroSemestres, int maxEstudiantes) {
        this.nombreCarrera = nombreCarrera;
        this.nroSemestres = nroSemestres;
        this.estudiantes = new Estudiante[maxEstudiantes];
        this.contadorEst = 0;
    }

    // Agregar un estudiante al arreglo
    public void addEstudiante(Estudiante e) {
        if (contadorEst < estudiantes.length) {
            estudiantes[contadorEst] = e;
            contadorEst++;
        } else {
            System.out.println("No se puede agregar más estudiantes en " + nombreCarrera);
        }
    }

    public void mostrar() {
        System.out.println("\n----- CARRERA: " + nombreCarrera + " -----");
        System.out.println("Semestres: " + nroSemestres);
        System.out.println("Estudiantes:");
        for (int i = 0; i < contadorEst; i++) {
            estudiantes[i].mostrar();
        }
    }

    // Getters & Setters
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getNroSemestres() {
        return nroSemestres;
    }

    public void setNroSemestres(int nroSemestres) {
        this.nroSemestres = nroSemestres;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getContadorEst() {
        return contadorEst;
    }
}
