package LogicaBecasUniversitarias;

public class Beca {

    private String nombreBeca;
    private String requisitos;
    private int promedioRequerido;  // promedio mínimo

    public Beca() {
    }

    public Beca(String nombreBeca, String requisitos, int promedioRequerido) {
        this.nombreBeca = nombreBeca;
        this.requisitos = requisitos;
        this.promedioRequerido = promedioRequerido;
    }

    public void mostrar() {
        System.out.println("\nBeca: " + nombreBeca
                + "\nRequisitos: " + requisitos
                + "\nPromedio requerido: " + promedioRequerido);
    }

    // Getters & Setters
    public String getNombreBeca() {
        return nombreBeca;
    }

    public void setNombreBeca(String nombreBeca) {
        this.nombreBeca = nombreBeca;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getPromedioRequerido() {
        return promedioRequerido;
    }

    public void setPromedioRequerido(int promedioRequerido) {
        this.promedioRequerido = promedioRequerido;
    }
}
