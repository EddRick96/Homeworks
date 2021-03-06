


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaRegistro extends javax.swing.JFrame {
    
    String [][] player;
    DefaultTableModel tblModelCreatePlayer;
    
    int cont=0;
    
    ArrayList<Object> listPlayers = new ArrayList<>();
//    DefaultComboBoxModel listaMateriasModel = 
//            new DefaultComboBoxModel(listaMaterias.toArray());
    
    
    ClsControlador controller = new ClsControlador();

    public PantallaRegistro() {
        initComponents();
        this.setTitle("Register Screen");
        
        listPlayers = controller.extraerObjetos("listPlayers.dat");
        fullCombo();
        fillTablePlayers();
        if(listPlayers.size() > 0){
            Player ultimo = (Player) listPlayers.get(listPlayers.size()-1);
            cont = ultimo.getCont();
        }
                
        /*no es necesario crear un tblamodel xq ya tenemos la funcion fillTablePlayers*/
//        
//        
//        String titleTablePlayers[] = new String [] {
//            "N°:", "Name:","Last Name:", "Id:","User", "Victories"
//        };
//        
//        tblModelCreatePlayer = new DefaultTableModel(player,titleTablePlayers); 
//        tblCreatePlayers.setModel(tblModelCreatePlayer);
        
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbId = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreatePlayers = new javax.swing.JTable();
        btnGoToSelectCharacters = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(605, 660));
        setSize(new java.awt.Dimension(200, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        lblLastName.setText("Last Name:");

        lblId.setText("Id:");

        lblUser.setText("User:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        tblCreatePlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Name", "Last Name", "Id", "User", "Victories"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreatePlayers);

        btnGoToSelectCharacters.setText("Go to Select Characters");
        btnGoToSelectCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToSelectCharactersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblId)
                                            .addComponent(lblUser))
                                        .addGap(92, 92, 92)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblLastName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(146, 146, 146))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnGoToSelectCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblName)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnGoToSelectCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnGoToSelectCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToSelectCharactersActionPerformed
        // TODO add your handling code here:
        
        PantallaJuego Obj = new PantallaJuego();
        Obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoToSelectCharactersActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String iD = txtId.getText();
        String user = txtUser.getText();
        
        if(!name.equals("") && !lastName.equals("") && !iD.equals("") && !user.equals("")){
            cont++;
            Player newPlayer = new Player(cont, name, lastName,iD ,user);                   
                    
            listPlayers.add(newPlayer);
            
            controller.escribirObjeto("listPlayers.dat", listPlayers);
            listPlayers =controller.extraerObjetos("listPlayers.dat");
            
            clean();
            fullCombo();
            
            Object[] playersG = {newPlayer.getCont(), newPlayer.getName(),newPlayer.getLastName(),newPlayer.getId(),newPlayer.getUser(), newPlayer.getVictories()};
            DefaultTableModel model = (DefaultTableModel)tblCreatePlayers.getModel();
            model.addRow(playersG);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please, fill in all fields.","Message",0);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdActionPerformed
        // TODO add your handling code here:
        
        Player playerSelected = (Player)cmbId.getSelectedItem();
        txtName.setText(playerSelected.getName());
        txtLastName.setText(playerSelected.getLastName());
        txtId.setText(playerSelected.getId());
        txtUser.setText(playerSelected.getUser());
        
        btnChange.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCreate.setEnabled(false);

    }//GEN-LAST:event_cmbIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Player playerSelected = (Player)cmbId.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
        model.removeRow (cmbId.getSelectedIndex());
        listPlayers.remove(playerSelected);
        controller.escribirObjeto("listPlayers.dat",listPlayers );
        fullCombo();
        clean();
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);

        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
        Player playerSelected = (Player)cmbId.getSelectedItem();
        playerSelected.setName(txtName.getText());
        playerSelected.setLastName(txtLastName.getText());
        playerSelected.setId(txtId.getText());
        playerSelected.setUser(txtUser.getText());
        
        Object playersG [] = {playerSelected.getCont() ,playerSelected.getName(),playerSelected.getLastName(), playerSelected.getId(), playerSelected.getUser(), playerSelected.getVictories()};
        DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
        model.removeRow(cmbId.getSelectedIndex());
        listPlayers.remove(cmbId.getSelectedIndex());
        model.insertRow(cmbId.getSelectedIndex(), playersG);
        listPlayers.add(cmbId.getSelectedIndex(), playerSelected);
        controller.escribirObjeto("listPlayers.dat", listPlayers);
        fullCombo();
        clean();
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    
    
    public void fullCombo(){
        if(listPlayers.size() > 0){
            cmbId.setEnabled(true);
            listPlayers = controller.extraerObjetos("listPlayers.dat");
            Player.combox=true;
            cmbId.setModel(new javax.swing.DefaultComboBoxModel(listPlayers.toArray()));
        }else{
            cmbId.setEnabled(false);
        }
    }
    
    
    public void clean(){
        txtName.setText(null);
        txtLastName.setText(null);
        txtId.setText(null);
        txtUser.setText(null);
        btnCreate.setEnabled(true);
    }
    
    public void fillTablePlayers(){
        
        if(listPlayers.size() > 0){
            
            Player playerSelected = new Player();
            DefaultTableModel model = (DefaultTableModel) tblCreatePlayers.getModel();
            for(int i = 0; i < listPlayers.size(); i ++){
                playerSelected = (Player) listPlayers.get(i);
                Object playersG [] = {playerSelected.getCont(),playerSelected.getName(), playerSelected.getLastName(), 
                                      playerSelected.getId(), playerSelected.getUser(), playerSelected.getVictories()};
                model.insertRow(i, playersG);
            }
        }
  
        
    }//GEN-LAST:event_btnChangeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGoToSelectCharacters;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblCreatePlayers;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

