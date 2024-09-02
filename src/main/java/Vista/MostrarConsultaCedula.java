package Vista;

import Control.ControlPrincipal;
import java.awt.event.ActionListener;

/**
 * MostrarConsultaCedula. Ventana que permite mostrar los datos de una persona
 * buscado por cedula.
 */
public class MostrarConsultaCedula extends javax.swing.JFrame {

    private ControlPrincipal control;

    /**
     * MostrarConsultaCedula. Ventana que permite mostrar los datos de un
     */
    public MostrarConsultaCedula(ControlPrincipal aThis) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = control;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaMostrarDatos = new javax.swing.JTextArea();
        BotonVolverMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Datos ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 130, 40);

        AreaMostrarDatos.setEditable(false);
        AreaMostrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        AreaMostrarDatos.setColumns(20);
        AreaMostrarDatos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        AreaMostrarDatos.setForeground(new java.awt.Color(102, 102, 102));
        AreaMostrarDatos.setRows(5);
        jScrollPane2.setViewportView(AreaMostrarDatos);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 320, 270);

        BotonVolverMenu.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BotonVolverMenu.setForeground(new java.awt.Color(102, 102, 102));
        BotonVolverMenu.setText("Volver Menu");
        BotonVolverMenu.setBorder(null);
        BotonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolverMenu);
        BotonVolverMenu.setBounds(10, 340, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel1.add(botonSalir);
        botonSalir.setBounds(290, 10, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverMenuActionPerformed

    // ------------ LISTENER -----
    /**
     * addvolverMenuListener. Metodo que permite volver al menu principal.
     */
    public void addvolverMenuListener(ActionListener listener) {
        BotonVolverMenu.addActionListener(listener);
    }

    /**
     * addSalirListener. Metodo que permite salir de la aplicacion.
     */
    public void addSalirListener(ActionListener listener) {
        botonSalir.addActionListener(listener);
    }

    /**
     * resetearCamposAsistente. Metodo que permite resetear los campos de la
     * ventana.
     */
    public void resetearCamposAsistente() {
        AreaMostrarDatos.setText("");
    }

    /**
     * mostrarAsistente. Metodo que permite mostrar los datos de un asistente.
     */
    public void mostrarPersona(String datosPersona) {
        AreaMostrarDatos.setText(datosPersona);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaMostrarDatos;
    private javax.swing.JButton BotonVolverMenu;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
