/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package EntornoGrafico;

import LogicaBecasUniversitarias.Estudiante;


/**
 *
 * @author Manferuz
 */
public class c_Estudiantes extends javax.swing.JPanel {

    

    /**
     * Creates new form Inicio
     */
    public c_Estudiantes() {
        initComponents();
         cargarDatosEnTabla();
       
    }
    private void cargarDatosEnTabla() {
        // Obtener el modelo de la tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) TableEstudiantes.getModel();

        // Limpiar la tabla antes de agregar nuevos datos
        modelo.setRowCount(0);

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


        // Agregar cada estudiante a la tabla
        agregarFilaATabla(modelo, e1);
        agregarFilaATabla(modelo, e2);
        agregarFilaATabla(modelo, e3);
        agregarFilaATabla(modelo, e4);
        agregarFilaATabla(modelo, e5);
        agregarFilaATabla(modelo, e6);
        agregarFilaATabla(modelo, e7);
        agregarFilaATabla(modelo, e8);
        agregarFilaATabla(modelo, e9);
        agregarFilaATabla(modelo, e10);
        agregarFilaATabla(modelo, e11);
        agregarFilaATabla(modelo, e12);
        agregarFilaATabla(modelo, e13);
        agregarFilaATabla(modelo, e14);
        agregarFilaATabla(modelo, e15);
        agregarFilaATabla(modelo, e16);
        agregarFilaATabla(modelo, e17);
        agregarFilaATabla(modelo, e18);
        agregarFilaATabla(modelo, e19);
        agregarFilaATabla(modelo, e20);
        agregarFilaATabla(modelo, e21);
        agregarFilaATabla(modelo, e22);
        agregarFilaATabla(modelo, e23);
        agregarFilaATabla(modelo, e24);
        agregarFilaATabla(modelo, e25);
        agregarFilaATabla(modelo, e26);
        agregarFilaATabla(modelo, e27);
        agregarFilaATabla(modelo, e28);
        agregarFilaATabla(modelo, e29);
        agregarFilaATabla(modelo, e30);
        agregarFilaATabla(modelo, e31);
        agregarFilaATabla(modelo, e32);
        agregarFilaATabla(modelo, e33);
        agregarFilaATabla(modelo, e34);
        agregarFilaATabla(modelo, e35);
        agregarFilaATabla(modelo, e36);
        agregarFilaATabla(modelo, e37);
        agregarFilaATabla(modelo, e38);
        agregarFilaATabla(modelo, e39);
        agregarFilaATabla(modelo, e40);
        agregarFilaATabla(modelo, e41);
        agregarFilaATabla(modelo, e42);
        agregarFilaATabla(modelo, e43);
        agregarFilaATabla(modelo, e44);
     
        
    }
     private void agregarFilaATabla(javax.swing.table.DefaultTableModel modelo, Estudiante estudiante) {
        // Agregar una fila a la tabla con los datos del estudiante
        modelo.addRow(new Object[]{
            estudiante.getNombre(),
            estudiante.getCarrera(),
             estudiante.getSemestre(),
            estudiante.getEdad(),
            estudiante.getCi(),
            estudiante.getRU(),
            estudiante.getPromedio()
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEstudiantes = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(948, 478));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("ESTUDIANTES");
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        TableEstudiantes.setBackground(new java.awt.Color(13, 71, 161));
        TableEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableEstudiantes.setForeground(new java.awt.Color(204, 204, 0));
        TableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Carrera", "Semestre", "Edad", "C.I", "R.U", "Promedio"
            }
        ));
        TableEstudiantes.setToolTipText("");
        jScrollPane1.setViewportView(TableEstudiantes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(413, 413, 413))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEstudiantes;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
