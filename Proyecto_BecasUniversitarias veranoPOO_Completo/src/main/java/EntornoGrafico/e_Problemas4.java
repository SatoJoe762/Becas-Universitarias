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
import javax.swing.JPanel;

/**
 *
 * @author Manferuz
 */
public class e_Problemas4 extends javax.swing.JPanel {

    private Universidad universidad;

    public e_Problemas4() {
        initComponents();
        inicializarDatos(); // Inicializar datos de la universidad
        cargarComboBox(); // Cargar datos en los JComboBox

        initContenido();

    }

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
        // Cargar estudiantes en cmbEstudiantes
        cmbEstudiantes.removeAllItems();

        for (int i = 0; i < universidad.getContadorCarreras(); i++) {
            Carrera carrera = universidad.getCarreras()[i];
            for (int j = 0; j < carrera.getContadorEst(); j++) {
                cmbEstudiantes.addItem(carrera.getEstudiantes()[j].getNombre());
            }
        }

        // Cargar becas en cmbBecas
        cmbBecas.removeAllItems();
        for (int i = 0; i < universidad.getContadorBecas(); i++) {
            cmbBecas.addItem(universidad.getBecas()[i].getNombreBeca());
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVerificarInvitacion = new javax.swing.JButton();
        cmbBecas = new javax.swing.JComboBox<>();
        cmbEstudiantes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        ContentProblemas.setBackground(new java.awt.Color(255, 255, 255));
        ContentProblemas.setPreferredSize(new java.awt.Dimension(948, 378));

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

        btnVerificarInvitacion.setBackground(new java.awt.Color(13, 71, 161));
        btnVerificarInvitacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerificarInvitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarInvitacion.setText("Asignar Invitacion de Beca");
        btnVerificarInvitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificarInvitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarInvitacionActionPerformed(evt);
            }
        });

        cmbBecas.setBackground(new java.awt.Color(13, 71, 161));
        cmbBecas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBecas.setForeground(new java.awt.Color(255, 255, 255));
        cmbBecas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBecas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbEstudiantes.setBackground(new java.awt.Color(13, 71, 161));
        cmbEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtResultado.setBackground(new java.awt.Color(13, 71, 161));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(204, 204, 0));
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del Estudiante:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Beca:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("4. Asignar y mostrar que estudiante y carrera x recibira  una invitacion por su desempeño a la Beca y");

        javax.swing.GroupLayout ContentProblemasLayout = new javax.swing.GroupLayout(ContentProblemas);
        ContentProblemas.setLayout(ContentProblemasLayout);
        ContentProblemasLayout.setHorizontalGroup(
            ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerificarInvitacion)
                    .addComponent(jLabel1)
                    .addGroup(ContentProblemasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE))
        );
        ContentProblemasLayout.setVerticalGroup(
            ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentProblemasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentProblemasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnVerificarInvitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                    .addGroup(ContentProblemasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ContentProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
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
            .addComponent(ContentProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowJPanel(new e_Problemas5());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ShowJPanel(new e_Problemas3());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerificarInvitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarInvitacionActionPerformed
        String nombreEst = (String) cmbEstudiantes.getSelectedItem();
        String nombreBeca = (String) cmbBecas.getSelectedItem();

        // Verificar la invitación a la beca
        String resultado = verificarInvitacionBeca(nombreEst, nombreBeca);

        // Mostrar el resultado en el JTextArea
        txtResultado.setText(resultado);
    }//GEN-LAST:event_btnVerificarInvitacionActionPerformed
    private String verificarInvitacionBeca(String nombreEst, String nombreBeca) {
        Estudiante e = universidad.buscarEstudiante(nombreEst);
        if (e == null) {
            return "No existe el estudiante " + nombreEst;
        }
        Beca b = universidad.buscarBeca(nombreBeca);
        if (b == null) {
            return "No existe la beca " + nombreBeca;
        }
        if (e.getPromedio() >= b.getPromedioRequerido()) {
            return "INVITACIÓN: El estudiante " + e.getNombre()
                    + " de la carrera " + e.getCarrera()
                    + " \ncon promedio " + e.getPromedio()
                    + " \nes invitado a la beca " + b.getNombreBeca()
                    + " \n(req. " + b.getPromedioRequerido() + ")";
        } else {
            return "El estudiante " + e.getNombre()
                    + " \nno cumple para la invitación a la beca " + b.getNombreBeca()
                    + " (req. " + b.getPromedioRequerido() + ")";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentProblemas;
    private javax.swing.JButton btnVerificarInvitacion;
    private javax.swing.JComboBox<String> cmbBecas;
    private javax.swing.JComboBox<String> cmbEstudiantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
