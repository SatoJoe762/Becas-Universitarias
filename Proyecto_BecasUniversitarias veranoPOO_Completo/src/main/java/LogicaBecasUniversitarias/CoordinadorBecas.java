/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaBecasUniversitarias;

/**
 *
 * @author Manferuz
 */
public class CoordinadorBecas extends Persona {
    private String departamento;
    private String email;
    private double salario;

    public CoordinadorBecas() {
        super();
    }

    public CoordinadorBecas(String nombre, int edad, int ci, 
                             String departamento, String email, double salario) {
        super(nombre, edad, ci);
        this.departamento = departamento;
        this.email = email;
        this.salario = salario;
    }

    @Override
    public String tipoPersona() {
        return "Coordinador de Becas";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento);
        System.out.println("Email: " + email);
        System.out.println("Salario: " + salario);
    }

    // Getters and Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}