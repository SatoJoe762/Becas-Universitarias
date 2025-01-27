/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package EntornoGrafico;

import LogicaBecasUniversitarias.Beca;
import LogicaBecasUniversitarias.Carrera;
import LogicaBecasUniversitarias.Estudiante;
import LogicaBecasUniversitarias.Universidad;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class e_Problemas1 extends javax.swing.JPanel {

    private Universidad universidad;

    private DefaultTableModel tableModel;

    public e_Problemas1() {

        initComponents();
        initContenido();
        tableModel = (DefaultTableModel) resultsTable.getModel();
        tableModel.setRowCount(0);
        inicializarDatos(); // Inicializar datos de la universidad
        cargarComboBox(); // Cargar datos en los JComboBox
       

    }
    // Método para inicializar datos de la universidad
    private void inicializarDatos() {
         

        universidad = new Universidad("Escuela Militar de Ingenieria", "Rafael Pabon - Irpavi", 10, 10);

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
    }
    // Método para cargar datos en los JComboBox
    private void cargarComboBox() {
         comboEstudiantes.removeAllItems();
        // Cargar estudiantes en comboEstudiantes
        for (int i = 0; i < universidad.getContadorCarreras(); i++) {
            Carrera carrera = universidad.getCarreras()[i];
            for (int j = 0; j < carrera.getContadorEst(); j++) {
                comboEstudiantes.addItem(carrera.getEstudiantes()[j].getNombre());
            }
        }

        // Cargar becas en comboBecas
         comboBecas.removeAllItems();
        for (int i = 0; i < universidad.getContadorBecas(); i++) {
            comboBecas.addItem(universidad.getBecas()[i].getNombreBeca());
        }
    }
   


    private void initContenido() {

    }
     private void ShowJPanel(JPanel P1) {

        P1.setSize(948, 378);
        P1.setLocation(0, 0);
        ContentProblemas.removeAll();
        ContentProblemas.add(P1, BorderLayout.CENTER);
        ContentProblemas.revalidate();
        ContentProblemas.repaint();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentProblemas = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAsignarBeca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        comboBecas = new javax.swing.JComboBox<>();
        comboEstudiantes = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        ContentProblemas.setBackground(new java.awt.Color(255, 255, 255));
        ContentProblemas.setPreferredSize(new java.awt.Dimension(948, 478));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("1. Asignar y mostrar que estudiante x recibira la Beca y");
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton1.setBackground(new java.awt.Color(21, 101, 192));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(21, 101, 192));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Anterior");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAsignarBeca.setBackground(new java.awt.Color(13, 71, 161));
        btnAsignarBeca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAsignarBeca.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarBeca.setText("Asignar Beca");
        btnAsignarBeca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarBecaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del Estudiante:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Beca:");

        resultsTable.setBackground(new java.awt.Color(13, 71, 161));
        resultsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resultsTable.setForeground(new java.awt.Color(204, 204, 0));
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Carrera", "Promedio", "Beca Asignada", "Promedio Requerido"
            }
        ));
        jScrollPane1.setViewportView(resultsTable);

        comboBecas.setBackground(new java.awt.Color(13, 71, 161));
        comboBecas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBecas.setForeground(new java.awt.Color(255, 255, 255));
        comboBecas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBecasActionPerformed(evt);
            }
        });

        comboEstudiantes.setBackground(new java.awt.Color(13, 71, 161));
        comboEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        comboEstudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstudiantesActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(13, 71, 161));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar Tabla");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentProblemasLayout = new javax.swing.GroupLayout(ContentProblemas);
        ContentProblemas.setLayout(ContentProblemasLayout);
        ContentProblemasLayout.setHorizontalGroup(
            ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentProblemasLayout.createSequentialGroup()
                        .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentProblemasLayout.createSequentialGroup()
                                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboEstudiantes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboBecas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(320, 320, 320))
                            .addGroup(ContentProblemasLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAsignarBeca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentProblemasLayout.createSequentialGroup()
                        .addGap(0, 217, Short.MAX_VALUE)
                        .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentProblemasLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(251, 251, 251))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ContentProblemasLayout.setVerticalGroup(
            ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentProblemasLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE))
                    .addGroup(ContentProblemasLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(btnAsignarBeca)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowJPanel(new e_Problemas2());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ShowJPanel(new e_Problemas());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAsignarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarBecaActionPerformed
      String nombreEst = (String) comboEstudiantes.getSelectedItem();
        String nombreBeca = (String) comboBecas.getSelectedItem();

        // Asignar beca al estudiante
        universidad.asignarBecaEstudiante(nombreEst, nombreBeca);

        // Mostrar resultado en la tabla
        mostrarResultadoEnTabla(nombreEst, nombreBeca);
    }//GEN-LAST:event_btnAsignarBecaActionPerformed

    private void comboBecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBecasActionPerformed

    private void comboEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstudiantesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableModel.setRowCount(0);
    }//GEN-LAST:event_jButton3ActionPerformed
     private void mostrarResultadoEnTabla(String nombreEst, String nombreBeca) {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) resultsTable.getModel();

    // Obtener datos del estudiante y la beca
    Estudiante est = universidad.buscarEstudiante(nombreEst);
    Beca beca = universidad.buscarBeca(nombreBeca);

    // Verificar si el estudiante cumple con los requisitos de la beca
    if (est.getPromedio() >= beca.getPromedioRequerido()) {
        // Agregar fila a la tabla si cumple con los requisitos
        modelo.addRow(new Object[]{
            est.getNombre(),          // Nombre del estudiante
            est.getCarrera(),         // Carrera del estudiante
            est.getPromedio(),        // Promedio del estudiante
            beca.getNombreBeca(),     // Beca asignada
            beca.getPromedioRequerido(), // Promedio requerido por la beca
            "Aprobado"                // Estado (Aprobado)
        });
    } else {
        // Mostrar mensaje si no cumple con los requisitos
        javax.swing.JOptionPane.showMessageDialog(this,
            "El estudiante " + est.getNombre() + " no cumple con los requisitos de la " + beca.getNombreBeca() +
            " porque su promedio es de " + est.getPromedio() + " y se requiere un mínimo de " + beca.getPromedioRequerido() + ".",
            "Beca no asignada",
            javax.swing.JOptionPane.WARNING_MESSAGE);

        // No se añade ninguna fila a la tabla
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentProblemas;
    private javax.swing.JButton btnAsignarBeca;
    private javax.swing.JComboBox<String> comboBecas;
    private javax.swing.JComboBox<String> comboEstudiantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultsTable;
    // End of variables declaration//GEN-END:variables
}
