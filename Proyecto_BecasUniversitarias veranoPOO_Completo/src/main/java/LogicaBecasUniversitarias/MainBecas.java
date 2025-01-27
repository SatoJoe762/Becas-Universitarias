package LogicaBecasUniversitarias;

public class MainBecas {

    public static void main(String[] args) {
        // Crear Universidad
        Universidad universidad = new Universidad("Escuela Militar de Ingenieria", "Rafael Pabon - Irpavi", 10, 10);

        Carrera car1 = new Carrera("Ingeniería de Sistemas", 7, 100);
        universidad.addCarrera(car1);

        Carrera car2 = new Carrera("Ingeniería de Software", 8, 100);
        universidad.addCarrera(car2);

        Carrera car3 = new Carrera("Ingeniería Electrónica", 9, 100);
        universidad.addCarrera(car3);

        Carrera car4 = new Carrera("Ingeniería Mecánica", 7, 100);
        universidad.addCarrera(car4);

        Carrera car5 = new Carrera("Ingeniería Civil", 6, 100);
        universidad.addCarrera(car5);

        Carrera car6 = new Carrera("Ingeniería Industrial", 5, 100);
        universidad.addCarrera(car6);

        Carrera car7 = new Carrera("Ingeniería Ambiental", 4, 100);
        universidad.addCarrera(car7);

        Carrera car8 = new Carrera("Ingeniería en Telecomunicaciones", 8, 100);
        universidad.addCarrera(car8);

        Carrera car9 = new Carrera("Ingeniería en Transporte", 8, 100);
        universidad.addCarrera(car9);

        Carrera car10 = new Carrera("Ingeniería en Energías Renovables", 8, 100);

        universidad.addCarrera(car10);

        // Crear Estudiantes
        //1.Estudiantes Ing de Sistemas (6)
        Estudiante e1 = new Estudiante("Carlos Pérez", 20, 12345, 678901, "Ingeniería de Sistemas", "2do", 92);
        Estudiante e2 = new Estudiante("Ana Gómez", 21, 54321, 123456, "Ingeniería de Sistemas", "2do", 89);
        Estudiante e3 = new Estudiante("Luis Fernández", 22, 98765, 654321, "Ingeniería de Sistemas", "3er", 100);
        Estudiante e4 = new Estudiante("María López", 19, 67890, 789012, "Ingeniería de Sistemas", "3er", 70);
        Estudiante e5 = new Estudiante("Pedro Martínez", 23, 13579, 135790, "Ingeniería de Sistemas", "4to", 69);
        Estudiante e6 = new Estudiante("Sofía Morales", 20, 24680, 246801, "Ingeniería de Sistemas", "4to", 60);

        //2.Estudiantes Ing Software (7)
        Estudiante e7 = new Estudiante("Javier Torres", 21, 75319, 753190, "Ingeniería de Software", "2do", 94);
        Estudiante e8 = new Estudiante("Lucía Ramírez", 22, 86420, 864201, "Ingeniería de Software", "2do", 78);
        Estudiante e9 = new Estudiante("Mario Ríos", 23, 97531, 975310, "Ingeniería de Software", "5to", 90);
        Estudiante e10 = new Estudiante("Manuel Fernandez", 22, 24612, 246802, "Ingeniería de Software", "3ro", 88);
        Estudiante e11 = new Estudiante("Andres Casas", 25, 25356, 24655, "Ingeniería de Software", "4to", 70);
        Estudiante e12 = new Estudiante("Bismarck Valencia", 24, 24681, 244802, "Ingeniería de Software", "2ro", 65);
        Estudiante e13 = new Estudiante("Joel Saavedra", 21, 27542, 246812, "Ingeniería de Software", "1ro", 70);

        //3.Estudiantes ing Electronica (3)
        Estudiante e14 = new Estudiante("Ricardo Leon", 20, 24681, 246802, "Ingeniería Electrónica", "6to", 78);
        Estudiante e15 = new Estudiante("Joel Quispe", 22, 34752, 259667, "Ingeniería Electrónica", "3ro", 95);
        Estudiante e16 = new Estudiante("Emmanuel Llanos", 24, 55532, 789342, "Ingeniería Electrónica", "1ro", 100);

        //4.Estudiantes Ing Mecánica (4)
        Estudiante e17 = new Estudiante("Leslie Cabrera", 22, 55501, 700123, "Ingeniería Mecánica", "5to", 91);
        Estudiante e18 = new Estudiante("Fernando Ortega", 21, 55546, 712354, "Ingeniería Mecánica", "4to", 87);
        Estudiante e19 = new Estudiante("Marcos Fernandez", 18, 51235, 723543, "Ingeniería Mecánica", "1ro", 60);
        Estudiante e20 = new Estudiante("Julio Mayta", 20, 19284, 712389, "Ingeniería Mecánica", "3ro", 70);

        //5.Estudiantes Ing Civil (6)
        Estudiante e21 = new Estudiante("Daniel Iriarte", 30, 55502, 700124, "Ingeniería Civil", "7to", 87);
        Estudiante e22 = new Estudiante("Rolando Crespo", 32, 24865, 445258, "Ingeniería Civil", "9to", 60);
        Estudiante e23 = new Estudiante("Jayce Calisalla", 19, 55502, 741963, "Ingeniería Civil", "2do", 66);
        Estudiante e24 = new Estudiante("Andres Mayta", 25, 21367, 159753, "Ingeniería Civil", "5to", 85);
        Estudiante e25 = new Estudiante("Alejandro Fernandez", 21, 79513, 753258, "Ingeniería Civil", "2to", 77);
        Estudiante e26 = new Estudiante("Marcelo Justiniano", 20, 47512, 953751, "Ingeniería Civil", "4to", 99);

        //6.Estudiantes Ing Industrial (6)
        Estudiante e27 = new Estudiante("Alejandra Cabrera", 21, 48624, 486159, "Ingeniería Industrial", "2to", 87);
        Estudiante e28 = new Estudiante("Emily Rose", 23, 22436, 113465, "Ingeniería Industrial", "4to", 70);
        Estudiante e29 = new Estudiante("Adriana Conde", 25, 48612, 765622, "Ingeniería Industrial", "6to", 77);
        Estudiante e30 = new Estudiante("Erick Fernandez", 27, 95632, 700124, "Ingeniería Industrial", "8to", 67);
        Estudiante e31 = new Estudiante("Alejandro Uzquiano", 29, 71233, 485225, "Ingeniería Industrial", "2to", 90);
        Estudiante e32 = new Estudiante("Daniel Moscoso", 30, 75649, 996553, "Ingeniería Industrial", "1to", 92);

        //7.Estudiantes Ing Ambiental (3)
        Estudiante e33 = new Estudiante("Mariana Fernandez", 21, 55463, 448526, "Ingeniería Ambiental", "5to", 100);
        Estudiante e34 = new Estudiante("Natalia Tejerina", 21, 48655, 664645, "Ingeniería Ambiental", "5to", 60);
        Estudiante e35 = new Estudiante("Alejandro Fernandez", 21, 11243, 123455, "Ingeniería Ambiental", "5to", 87);

        //8.Estudiantes Ing en Telecomunicaciones (4)
        Estudiante e36 = new Estudiante("Omar Saavedra", 24, 44525, 700124, "Ingeniería en Telecomunicaciones", "4to", 85);
        Estudiante e37 = new Estudiante("Fernando Torrez", 22, 48852, 333555, "Ingeniería en Telecomunicaciones", "2do", 77);
        Estudiante e38 = new Estudiante("Sthepanie Linarez", 21, 44525, 486122, "Ingeniería en Telecomunicaciones", "3to", 84);
        Estudiante e39 = new Estudiante("Alexys Camara", 18, 99653, 996554, "Ingeniería en Telecomunicaciones", "1ro", 81);

        //9.Estudiantes Ing en Transporte (3)
        Estudiante e40 = new Estudiante("Alejandra Fernandez", 24, 44566, 700124, "Ingeniería en Transporte", "7mo", 70);
        Estudiante e41 = new Estudiante("Ana Leon", 25, 11258, 456983, "Ingeniería en Transporte", "2to", 90);
        Estudiante e42 = new Estudiante("Augusto Choque", 27, 24475, 885221, "Ingeniería en Transporte", "5to", 60);

        //10.Estudiantes Ing en Energias Renovables (2)
        Estudiante e43 = new Estudiante("Rogelio Mamani", 21, 12345, 554394, "Ingeniería en Energías Renovables", "5to", 84);
        Estudiante e44 = new Estudiante("Marcelo Aruquipa", 21, 54321, 663698, "Ingeniería en Energías Renovables", "5to", 100);

        // Agregar Estudiantes a Carreras
        //1. Ing de Sistemas
        car1.addEstudiante(e1);
        car1.addEstudiante(e2);
        car1.addEstudiante(e3);
        car1.addEstudiante(e4);
        car1.addEstudiante(e5);
        car1.addEstudiante(e6);

        //2. Ing de Software
        car2.addEstudiante(e7);
        car2.addEstudiante(e8);
        car2.addEstudiante(e9);
        car2.addEstudiante(e10);
        car2.addEstudiante(e11);
        car2.addEstudiante(e12);
        car2.addEstudiante(e13);

        //3. Ing Electronica
        car3.addEstudiante(e14);
        car3.addEstudiante(e15);
        car3.addEstudiante(e16);

        //4. Ing Mecánica
        car4.addEstudiante(e17);
        car4.addEstudiante(e18);
        car4.addEstudiante(e19);
        car4.addEstudiante(e20);

        //5. Ing Civil
        car5.addEstudiante(e21);
        car5.addEstudiante(e22);
        car5.addEstudiante(e23);
        car5.addEstudiante(e24);
        car5.addEstudiante(e25);
        car5.addEstudiante(e26);

        //6. Ing Industrial 
        car6.addEstudiante(e27);
        car6.addEstudiante(e28);
        car6.addEstudiante(e29);
        car6.addEstudiante(e30);
        car6.addEstudiante(e31);
        car6.addEstudiante(e32);

        //7. Ing Ambiental 
        car7.addEstudiante(e33);
        car7.addEstudiante(e34);
        car7.addEstudiante(e35);

        //8. Ing en Telecomunicaciones 
        car8.addEstudiante(e36);
        car8.addEstudiante(e37);
        car8.addEstudiante(e38);
        car8.addEstudiante(e39);

        //9. Ing en Transporte
        car9.addEstudiante(e40);
        car9.addEstudiante(e41);
        car9.addEstudiante(e42);

        //10. Ing en Energias Renovables 
        car10.addEstudiante(e43);
        car10.addEstudiante(e44);

        // Crear Becas
        Beca b1 = new Beca("Beca de Excelencia", "Promedio mayor a 90", 92);
        Beca b2 = new Beca("Beca Deportiva", "Ser parte del equipo de fútbol", 70);
        Beca b3 = new Beca("Beca de Investigación", "Participar en un proyecto", 88);
        Beca b4 = new Beca("Beca Cultural", "Participar en actividades culturales", 80);
        Beca b5 = new Beca("Beca de Honor", "Estudiantes destacados en su área", 100);
        Beca b6 = new Beca("Beca de Liderazgo", "Demostrar habilidades de liderazgo", 87);
        Beca b7 = new Beca("Beca de Servicio Comunitario", "Voluntariado comprobado", 82);
        Beca b8 = new Beca("Beca Técnica", "Tener habilidades técnicas", 75);
        Beca b9 = new Beca("Beca de Innovación", "Proyectos innovadores", 85);
        Beca b10 = new Beca("Beca de Desempeño Académico", "Mantener un promedio mínimo", 84);
        universidad.addBeca(b1);
        universidad.addBeca(b2);
        universidad.addBeca(b3);
        universidad.addBeca(b4);
        universidad.addBeca(b5);
        universidad.addBeca(b6);
        universidad.addBeca(b7);
        universidad.addBeca(b8);
        universidad.addBeca(b9);
        universidad.addBeca(b10);

        // Usar Repositorio Genérico
        RepositorioGenerico<Beca> repositorioBecas = new RepositorioGenerico<>();
        repositorioBecas.agregar(b1);
        repositorioBecas.agregar(b2);
        repositorioBecas.agregar(b3);
        repositorioBecas.agregar(b4);
        repositorioBecas.agregar(b5);
        repositorioBecas.agregar(b6);
        repositorioBecas.agregar(b7);
        repositorioBecas.agregar(b8);
        repositorioBecas.agregar(b9);
        repositorioBecas.agregar(b10);

// Crear Coordinador de Becas
        CoordinadorBecas coordinador = new CoordinadorBecas(
                "Carlos Rodríguez", 45, 54321,
                "Departamento de Becas", "carlos.rodriguez@universidad.edu", 5000.0
        );

        // Configurar Gestor de Base de Datos (ejemplo de conexión)
        GestorBaseDatosBecas gestorBD = new GestorBaseDatosBecas(
                "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10759513",
                "sql10759513",
                "nK6aMYm38S"
        );

        // Guardar becas en la base de datos
        gestorBD.guardarBeca(b1);
        gestorBD.guardarBeca(b2);
        gestorBD.guardarBeca(b3);
        gestorBD.guardarBeca(b4);
        gestorBD.guardarBeca(b5);
        gestorBD.guardarBeca(b6);
        gestorBD.guardarBeca(b7);
        gestorBD.guardarBeca(b8);
        gestorBD.guardarBeca(b9);
        gestorBD.guardarBeca(b10);

        universidad.mostrar();
        coordinador.mostrar();
        System.out.println(" ");
        System.out.println("Repositorio generico de Becas: ");
        repositorioBecas.mostrar();
        System.out.println(" ");

        // LLAMAR a cada uno de los 5 problemas usando métodos en la clase Universidad:
        // 1) Asignar y mostrar que estudiante X recibirá la Beca Y
        System.out.println("1) Asignar Beca:");
        universidad.asignarBecaEstudiante("Carlos Pérez", "Beca de Excelencia");

        // 2) Contar y Mostrar las becas que puede adquirir el estudiante X
        System.out.println("\n2) Contar becas posibles para un estudiante:");
        universidad.contarBecasEstudiante("Carlos Pérez");

        // 3) Mostrar a todos los estudiantes que no cumplan los requisitos 
        System.out.println("\n3) Estudiantes que no cumplen los requisitos de beca");
        universidad.mostrarEstudiantesSinRequisitos();

        // 4) Invitación a la beca por desempeño
        System.out.println("\n4) Invitación a Beca:");
        universidad.invitacionBecaEstudiante("Luis Fernández", "Beca de Honor");

        // 5) Asignar becas aleatorias a los estudiantes que cumplan los requisitos
        System.out.println("\n5) Asignar becas aleatorias:");
        universidad.asignarBecasAleatorias();
    }
}
