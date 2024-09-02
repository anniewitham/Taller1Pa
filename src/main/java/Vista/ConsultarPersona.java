package Vista;

import Control.ControlPrincipal;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;


public class ConsultarPersona extends javax.swing.JFrame {

    private ControlPrincipal control;
 

    
    public ConsultarPersona(ControlPrincipal aThis, ArrayList<String> cedulasBuscadores) {
        this.control = aThis;
     //   this.cedulasPersona = new ArrayList<>(cedulasPersonas);
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        botonConsultarCedula = new javax.swing.JButton();
        cedulaPersona = new javax.swing.JComboBox<>();
        BotonVolverMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 245, 183));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Elija la cedula que consultara");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(70, 40, 280, 40);

        botonConsultarCedula.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonConsultarCedula.setForeground(new java.awt.Color(102, 102, 102));
        botonConsultarCedula.setText("Consultar Cedula");
        botonConsultarCedula.setBorderPainted(false);
        botonConsultarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarCedulaActionPerformed(evt);
            }
        });
        jPanel3.add(botonConsultarCedula);
        botonConsultarCedula.setBounds(220, 150, 170, 30);

        cedulaPersona.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        cedulaPersona.setForeground(new java.awt.Color(102, 102, 102));
        cedulaPersona.setModel(new DefaultComboBoxModel<>(this.cedulasBuscadores.toArray(new String[0])));
        jPanel3.add(cedulaPersona);
        cedulaPersona.setBounds(100, 90, 220, 40);

        BotonVolverMenu.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BotonVolverMenu.setForeground(new java.awt.Color(102, 102, 102));
        BotonVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/volver.png"))); // NOI18N
        BotonVolverMenu.setText("Volver Menu");
        BotonVolverMenu.setBorder(null);
        BotonVolverMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/volver 32.png"))); // NOI18N
        BotonVolverMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/volver 32.png"))); // NOI18N
        BotonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverMenuActionPerformed(evt);
            }
        });
        jPanel3.add(BotonVolverMenu);
        BotonVolverMenu.setBounds(40, 150, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel3.add(botonSalir);
        botonSalir.setBounds(331, 10, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConsultarCedulaActionPerformed

    private void BotonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverMenuActionPerformed
//------------- LISTENER----------

    /**
     * Agrega un listener al boton de salir.
     *
     * @param listener
     */
    public void addSalirListener(ActionListener listener) {
        botonSalir.addActionListener(listener);
    }

    /**
     * addConsultarPersonaListener. Agrega un listener al boton de consultar
     * citas.
     */
    public void addConsultarPersonaListener(ActionListener listener) {
        botonConsultarCedula.addActionListener(listener);
    }

    /**
     * addvolverMenuListener. Agrega un listener al boton de volver menu.
     */
    public void addvolverMenuListener(ActionListener listener) {
        BotonVolverMenu.addActionListener(listener);
    }

    //--------
    /**
     * getCedulaBuscador. Retorna la cedula del buscador seleccionado.
     *
     * @return cedulaBuscador
     */
    public String getCedulaPersona() {
        return (String) cedulaPersona.getSelectedItem();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolverMenu;
    private javax.swing.JButton botonConsultarCedula;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> cedulaPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
