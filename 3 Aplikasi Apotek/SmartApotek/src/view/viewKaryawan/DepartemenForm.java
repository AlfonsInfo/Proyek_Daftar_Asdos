package view.viewKaryawan;

import view.viewKaryawan.KaryawanForm;
import control.DepartemenControl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Departemen;
import table.TableFormKaryawan.TableDepartemen;

public class DepartemenForm extends javax.swing.JFrame {

    private DepartemenControl departemenControl;
    String action = "Tambah";// default action tambah, tetapi jika update actionya diubah, dan setelah selesaikan dikembalikan ke default. 
    List<Departemen> listDepartemen;
    int selectedId = 0;
    

    
    public DepartemenForm() {
        initComponents();
        setSaveCancel(false);
        setEditDeleteBtn(false);
        departemenControl = new DepartemenControl();
        showDepartemen();
    }
    
    public void setSaveCancel(boolean value)
    {        
        SaveBtn.setEnabled(value);
        CancelBtn.setEnabled(value);
    }
    
    public void setInput(boolean value)
    {
        InputID.setEnabled(value);
        InputNama.setEnabled(value);
    }
    public void setEditDeleteBtn(boolean value)
    {
        UpdateBtn.setEnabled(value);
        DeleteBtn.setEnabled(value);
    }

    public void showDepartemen()
    {
        tableDepartemen.setModel(departemenControl.showDepartemen(""));
    }
    
    public void clearText()
    {
        InputID.setText("");
        InputNama.setText("");
    }
   
   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        ContainerPanel = new javax.swing.JPanel();
        AppBarPanel = new javax.swing.JPanel();
        AppBarLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepartemen = new javax.swing.JTable();
        InputNama = new javax.swing.JTextField();
        InputID = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        NamaLabel = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppBarPanel.setBackground(new java.awt.Color(0, 0, 153));

        AppBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppBarLabel.setText("SMART APOTEK");

        javax.swing.GroupLayout AppBarPanelLayout = new javax.swing.GroupLayout(AppBarPanel);
        AppBarPanel.setLayout(AppBarPanelLayout);
        AppBarPanelLayout.setHorizontalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AppBarPanelLayout.setVerticalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        tableDepartemen.setForeground(new java.awt.Color(0, 0, 0));
        tableDepartemen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDepartemen.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableDepartemenComponentAdded(evt);
            }
        });
        tableDepartemen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDepartemenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDepartemen);

        InputNama.setBackground(new java.awt.Color(204, 204, 255));
        InputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNamaActionPerformed(evt);
            }
        });
        InputNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputNamaKeyReleased(evt);
            }
        });

        InputID.setBackground(new java.awt.Color(204, 204, 255));
        InputID.setForeground(new java.awt.Color(0, 0, 0));
        InputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDActionPerformed(evt);
            }
        });
        InputID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputIDKeyReleased(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(0, 0, 255));
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        CancelBtn.setForeground(new java.awt.Color(0, 0, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 0));
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID :");

        NamaLabel.setForeground(new java.awt.Color(0, 0, 0));
        NamaLabel.setText("Nama :");

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setForeground(new java.awt.Color(255, 0, 51));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 0, 204));
        BackBtn.setText("<<<");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(InputID)
                                            .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CancelBtn)
                                        .addGap(34, 34, 34)
                                        .addComponent(SaveBtn)))
                                .addGap(38, 38, 38))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NamaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(18, 18, 18)
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamaLabel)
                            .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SaveBtn)
                        .addComponent(CancelBtn))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(UpdateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn)))
                .addGap(43, 43, 43)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        action = "Tambah";
        setInput(true);
        setSaveCancel(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data","Konfirmasi",JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                departemenControl.deleteDepartemen(InputID.getText());
                clearText();
                showDepartemen();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus !");
            }catch(Exception e){
                System.out.println("Error : " +e.getMessage());
            }
        }else{JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus !");}
        setInput(true);
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void InputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNamaActionPerformed

    }//GEN-LAST:event_InputNamaActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        InputNama.setEnabled(true);
        action = "Ubah";
        setSaveCancel(true);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void tableDepartemenComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableDepartemenComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDepartemenComponentAdded

    private void InputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDActionPerformed
 
    }//GEN-LAST:event_InputIDActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        try{
            System.out.println(action);
            Departemen d = new Departemen(Integer.parseInt(InputID.getText().toString()), InputNama.getText());
            if(action.equals("Tambah"))
            {
                departemenControl.insertDepartemen(d);
            } else
            {
               departemenControl.updateDepartemen(d);
                action = ("Tambah");
            }
        }catch(Exception e)
        {
            
        }
        clearText();
        showDepartemen();
        setInput(true);
        setSaveCancel(false);
        setEditDeleteBtn(false);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void InputIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputIDKeyReleased
        if(InputID.getText().length()>0)
        {
            CancelBtn.setEnabled(true);
            SaveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_InputIDKeyReleased

    private void InputNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputNamaKeyReleased
        if(InputNama.getText().length()>0)
        {
            SaveBtn.setEnabled(true);
            CancelBtn.setEnabled(true);  
        }
    }//GEN-LAST:event_InputNamaKeyReleased

    private void tableDepartemenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDepartemenMouseClicked
        setEditDeleteBtn(true);
        CancelBtn.setEnabled(true);
        setInput(false);
        int clickedRow = tableDepartemen.getSelectedRow();
        TableModel tableModel = tableDepartemen.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow,0).toString());
        InputID.setText(String.valueOf(selectedId));
        InputNama.setText(tableModel.getValueAt(clickedRow,1).toString());
    }//GEN-LAST:event_tableDepartemenMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
              // Choice dv = new Choice();
        KaryawanForm dv = new KaryawanForm();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(DepartemenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartemenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartemenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartemenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartemenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppBarLabel;
    private javax.swing.JPanel AppBarPanel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField InputID;
    private javax.swing.JTextField InputNama;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDepartemen;
    // End of variables declaration//GEN-END:variables
}
