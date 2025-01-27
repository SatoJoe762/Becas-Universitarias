package LogicaBecasUniversitarias;

import java.util.Random; // Importa la clase Random para generar números aleatorios, para un ejercicio

public class Universidad {

    // Atributos de la universidad
    private String nombre;        
    private String ubicacion;     

    // vector para almacenar las carreras ofrecidas por la universidad
    private Carrera[] carreras;
    private int contadorCarreras; // Lleva el conteo de carreras agregadas

    // vector para almacenar las becas ofrecidas por la universidad
    private Beca[] becas = new Beca[10];
    private int contadorBecas;    // Lleva el conteo de becas agregadas

    // Constructor de la clase Universidad
    public Universidad(String nombre, String ubicacion, int maxCarreras, int maxBecas) {
        this.nombre = nombre; // Asigna el nombre de la universidad
        this.ubicacion = ubicacion; // Asigna la ubicación de la universidad
        carreras = new Carrera[maxCarreras]; // Inicializa el vector de carreras con un tamaño máximo
        becas = new Beca[maxBecas]; // Inicializa el vector de becas con un tamaño máximo
        contadorCarreras = 0; // Inicializa el contador de carreras en 0
        contadorBecas = 0; // Inicializa el contador de becas en 0
    }

    // Método para agregar una carrera al arreglo de carreras
    public void addCarrera(Carrera c) {
        if (contadorCarreras < carreras.length) { // Verifica si hay espacio en el vector
            carreras[contadorCarreras] = c; // Agrega la carrera en la posición actual del contador
            contadorCarreras++; // Incrementa el contador de carreras
        } else {
            System.out.println("No se pueden agregar más carreras."); // Mensaje si el vector está lleno
        }
    }

    // Método para agregar una beca al arreglo de becas
    public void addBeca(Beca b) {
        if (contadorBecas == becas.length) { // Verifica si el vector de becas está lleno
            Beca[] x = new Beca[becas.length * 2]; // Crea un nuevo vector con el doble de tamaño
            for (int i = 0; i < becas.length; i++) { // Recorre el vector original
                x[i] = becas[i]; // Copia cada beca al nuevo vector
            }
            becas = x; // Reemplaza el arreglo original con el nuevo arreglo redimensionado
        }
        becas[contadorBecas] = b; // Agrega la nueva beca en la posición actual del contador
        contadorBecas++; // Incrementa el contador de becas
    }

    // Método para mostrar la información de la universidad, sus becas y carreras
    public void mostrar() {
        System.out.println("\n==============================="); 
        System.out.println("UNIVERSIDAD: " + nombre); // Muestra el nombre de la universidad
        System.out.println("UBICACIÓN: " + ubicacion); // Muestra la ubicación de la universidad

        System.out.println("\n-- BECAS DISPONIBLES --"); // Encabezado para las becas
        for (int i = 0; i < contadorBecas; i++) { // Recorre el vector de becas
            becas[i].mostrar(); // Llama al método mostrar() de cada beca
        }

        System.out.println("\n-- CARRERAS --"); // Encabezado para las carreras
        for (int i = 0; i < contadorCarreras; i++) { // Recorre el vector de carreras
            carreras[i].mostrar(); // Llama al método mostrar() de cada carrera
        }
        System.out.println("===============================\n"); 
    }

    // Método para asignar una beca a un estudiante específico
    public void asignarBecaEstudiante(String nombreEst, String nombreBeca) {
        Beca laBeca = buscarBeca(nombreBeca); // Busca la beca por nombre
        if (laBeca == null) { // Si no se encuentra la beca
            System.out.println("No se encontró la Beca " + nombreBeca); // Muestra un mensaje de error
            return; // Sale del método
        }
        Estudiante est = buscarEstudiante(nombreEst); // Busca el estudiante por nombre
        if (est == null) { // Si no se encuentra el estudiante
            System.out.println("No se encontró al estudiante " + nombreEst); // Muestra un mensaje de error
            return; // Sale del método
        }
        if (est.getPromedio() >= laBeca.getPromedioRequerido()) { // Verifica si el estudiante cumple los requisitos
            System.out.println("El estudiante " + est.getNombre()
                    + " (promedio " + est.getPromedio()
                    + ") recibe la beca " + laBeca.getNombreBeca()
                    + " (req. " + laBeca.getPromedioRequerido() + ")"); // Muestra un mensaje de éxito
        } else {
            System.out.println("El estudiante " + est.getNombre()
                    + " (promedio " + est.getPromedio()
                    + ") NO cumple para la beca " + laBeca.getNombreBeca()
                    + " (req. " + laBeca.getPromedioRequerido() + ")"); // Muestra un mensaje de error
        }
    }

    // Método para contar y mostrar las becas que un estudiante puede adquirir
    public void contarBecasEstudiante(String nombreEst) {
        Estudiante e = buscarEstudiante(nombreEst); // Busca el estudiante por nombre
        if (e == null) { // Si no se encuentra el estudiante
            System.out.println("No existe el estudiante " + nombreEst); // Muestra un mensaje de error
            return; // Sale del método
        }
        int contador = 0; // Contador para las becas que el estudiante puede adquirir
        StringBuilder sb = new StringBuilder(); // Para construir el mensaje de salida

        for (int i = 0; i < contadorBecas; i++) { // Recorre el vector de becas
            Beca b = becas[i]; // Obtiene la beca actual
            if (e.getPromedio() >= b.getPromedioRequerido()) { // Verifica si el estudiante cumple los requisitos
                contador++; // Incrementa el contador
                sb.append(" - ").append(b.getNombreBeca())
                        .append(" (req: ").append(b.getPromedioRequerido()).append(")\n"); // Agrega la beca al mensaje
            }
        }

        if (contador == 0) { // Si no hay becas disponibles
            System.out.println("Estudiante " + e.getNombre()
                    + " no puede adquirir ninguna beca (promedio " + e.getPromedio() + ")"); // Muestra un mensaje
        } else {
            System.out.println("Estudiante " + e.getNombre()
                    + " (promedio " + e.getPromedio()
                    + ") puede adquirir " + contador + " becas:\n" + sb.toString()); // Muestra las becas disponibles
        }
    }

    // Método para mostrar estudiantes que no cumplen los requisitos de beca (promedio <= 69)
    public void mostrarEstudiantesSinRequisitos() {
        System.out.println("\n** Estudiantes con promedio <= 69 **"); // Encabezado
        int total = 0; // Contador de estudiantes sin requisitos
        for (int i = 0; i < contadorCarreras; i++) { // Recorre el vector de carreras
            Carrera c = carreras[i]; // Obtiene la carrera actual
            Estudiante[] arr = c.getEstudiantes(); // Obtiene los estudiantes de la carrera
            for (int j = 0; j < c.getContadorEst(); j++) { // Recorre los estudiantes
                Estudiante est = arr[j]; // Obtiene el estudiante actual
                if (est.getPromedio() <= 69) { // Verifica si el estudiante no cumple los requisitos
                    total++; // Incrementa el contador
                    System.out.println("- " + est.getNombre()
                            + " (promedio: " + est.getPromedio() + "), carrera: "
                            + c.getNombreCarrera()); // Muestra la información del estudiante
                }
            }
        }
        if (total == 0) { // Si no hay estudiantes sin requisitos
            System.out.println("No hay estudiantes con promedio <= 69."); // Muestra un mensaje
        }
    }

    // Método para invitar a un estudiante a una beca por su desempeño
    public void invitacionBecaEstudiante(String nombreEst, String nombreBeca) {
        Estudiante e = buscarEstudiante(nombreEst); // Busca el estudiante por nombre
        if (e == null) { // Si no se encuentra el estudiante
            System.out.println("No existe el estudiante " + nombreEst); // Muestra un mensaje de error
            return; // Sale del método
        }
        Beca b = buscarBeca(nombreBeca); // Busca la beca por nombre
        if (b == null) { // Si no se encuentra la beca
            System.out.println("No existe la beca " + nombreBeca); // Muestra un mensaje de error
            return; // Sale del método
        }
        if (e.getPromedio() >= b.getPromedioRequerido()) { // Verifica si el estudiante cumple los requisitos
            System.out.println("INVITACIÓN: El estudiante " + e.getNombre()
                    + " de la carrera " + e.getCarrera()
                    + " con promedio " + e.getPromedio()
                    + " es invitado a la beca " + b.getNombreBeca()
                    + " (req. " + b.getPromedioRequerido() + ")"); // Muestra un mensaje de éxito
        } else {
            System.out.println("El estudiante " + e.getNombre()
                    + " no cumple para la invitación a la beca " + b.getNombreBeca()); // Muestra un mensaje de error
        }
    }

    // Método para asignar becas aleatorias a estudiantes que cumplen los requisitos
    public void asignarBecasAleatorias() {
        System.out.println("\n*** Asignar becas aleatorias ***"); // Encabezado
        Random random = new Random(); // Crea un objeto Random para generar números aleatorios
        int totalAsig = 0; // Contador de becas asignadas

        for (int i = 0; i < contadorCarreras; i++) { // Recorre el vector de carreras
            Carrera c = carreras[i]; // Obtiene la carrera actual
            Estudiante[] arr = c.getEstudiantes(); // Obtiene los estudiantes de la carrera
            for (int j = 0; j < c.getContadorEst(); j++) { // Recorre los estudiantes
                Estudiante e = arr[j]; // Obtiene el estudiante actual
                if (e.getPromedio() >= 70 && contadorBecas > 0) { // Verifica si el estudiante cumple los requisitos
                    int idx = random.nextInt(contadorBecas); // Genera un índice aleatorio
                    Beca b = becas[idx]; // Obtiene la beca aleatoria
                    totalAsig++; // Incrementa el contador de becas asignadas
                    System.out.println("El estudiante " + e.getNombre()
                            + " (" + e.getCarrera() + ", prom: " + e.getPromedio()
                            + ") recibe beca aleatoria -> " + b.getNombreBeca()); // Muestra la beca asignada
                }
            }
        }
        System.out.println("Total de becas aleatorias asignadas: " + totalAsig); // Muestra el total de becas asignadas
    }

    // Método auxiliar para buscar una beca por nombre
    public Beca buscarBeca(String nombreBeca) {
        for (int i = 0; i < contadorBecas; i++) { // Recorre el vector de becas
            if (becas[i].getNombreBeca().equalsIgnoreCase(nombreBeca)) { // Compara los nombres (ignorando mayúsculas)
                return becas[i]; // Retorna la beca encontrada
            }
        }
        return null; // Retorna null si no se encuentra la beca
    }

    // Método auxiliar para buscar un estudiante por nombre
    public Estudiante buscarEstudiante(String nombreEst) {
        for (int i = 0; i < contadorCarreras; i++) { // Recorre el vector de carreras
            Carrera c = carreras[i]; // Obtiene la carrera actual
            Estudiante[] e = c.getEstudiantes(); // Obtiene los estudiantes de la carrera
            for (int j = 0; j < c.getContadorEst(); j++) { // Recorre los estudiantes
                if (e[j].getNombre().equalsIgnoreCase(nombreEst)) { // Compara los nombres (ignorando mayúsculas)
                    return e[j]; // Retorna el estudiante encontrado
                }
            }
        }
        return null; // Retorna null si no se encuentra el estudiante
    }

    // Getters y Setters
    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public String getUbicacion() {
        return ubicacion; 
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion; 
    }

    public Carrera[] getCarreras() {
        return carreras; 
    }

    public int getContadorCarreras() {
        return contadorCarreras; 
    }

    public Beca[] getBecas() {
        return becas;
    }

    public int getContadorBecas() {
        return contadorBecas; 
    }
}