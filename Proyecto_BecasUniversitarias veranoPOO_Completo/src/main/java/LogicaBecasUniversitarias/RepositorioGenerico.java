/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaBecasUniversitarias;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// Clase genérica que actúa como un repositorio para almacenar elementos de tipo T
public class RepositorioGenerico<T> {

    // Lista para almacenar elementos de tipo genérico T
    private List<T> elementos;

    // Constructor 
    public RepositorioGenerico() {
        this.elementos = new ArrayList<>(); // Inicializa la lista de elementos como una nueva ArrayList
    }

    // Método para agregar un elemento al repositorio
    public void agregar(T elemento) {
        elementos.add(elemento); // Añade el elemento a la lista
    }

    // Método para eliminar un elemento del repositorio
    public void eliminar(T elemento) {
        elementos.remove(elemento); // Elimina el elemento de la lista
    }

    // Método para obtener un elemento por su índice
    public T obtener(int indice) {
        return elementos.get(indice); // Retorna el elemento en la posición especificada
    }

    // Método para obtener una copia de todos los elementos del repositorio
    public List<T> obtenerTodos() {
        return new ArrayList<>(elementos); // Retorna una nueva lista con los elementos actuales (copia)
    }

    // Método para obtener el tamaño del repositorio
    public int tamaño() {
        return elementos.size(); // Retorna el número de elementos en la lista
    }

    // Método para verificar si el repositorio contiene un elemento específico
    public boolean contiene(T elemento) {
        return elementos.contains(elemento); // Retorna true si el elemento está en la lista
    }

    // Método para limpiar el repositorio (eliminar todos los elementos)
    public void limpiar() {
        elementos.clear(); // Elimina todos los elementos de la lista
    }

    // Método para mostrar todos los elementos del repositorio
    public void mostrar() {
        for (T elemento : elementos) { // Recorre cada elemento en la lista
            try {
                // Usa reflexión para obtener el método "mostrar" del objeto
                Method metodoMostrar = elemento.getClass().getMethod("mostrar");
                // Invoca el método "mostrar" en el objeto
                metodoMostrar.invoke(elemento);
            } catch (Exception e) {
                // Si el objeto no tiene un método "mostrar", muestra un mensaje de error
                System.out.println("El objeto no tiene un método 'mostrar': " + elemento);
            }
        }
    }

    // Getters y setters
    public List<T> getElementos() {
        return elementos;
    }

    // Setter para asignar una nueva lista de elementos
    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }
}
