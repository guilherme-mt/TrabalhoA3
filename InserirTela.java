InserirTela.java

  package com.mycompany.cursosti;

import javax.swing.JOptionPane;

public class InserirTela extends javax.swing.JFrame {

    /**
     * Creates new form InserirTela
     */
    public InserirTela() {
        super("Inserir Curso");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTipo = new javax.swing.JTextField();
        btnConfirmarInserir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnVoltarInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(556, 476));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(9, 9, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Cursos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255)), "Insira o Curso:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        txtTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo:"));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipo);
        txtTipo.setBounds(130, 210, 300, 57);

        btnConfirmarInserir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirmarInserir.setText("Confirmar");
        btnConfirmarInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarInserir);
        btnConfirmarInserir.setBounds(420, 360, 92, 36);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(130, 110, 300, 57);

        btnVoltarInserir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltarInserir.setText("Voltar");
        btnVoltarInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarInserir);
        btnVoltarInserir.setBounds(40, 360, 90, 36);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 540, 420);

        pack();
    }// </editor-fold>                        

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnConfirmarInserirActionPerformed(java.awt.event.ActionEvent evt) {                                                    
      //Entrada de dados
       String nome = txtNome.getText();
       String tipo = txtTipo.getText();
       
       try{
           Cursos cursos = new Cursos(0, nome, tipo);
           DAO dao = new DAO();
           dao.inserir(cursos);
           JOptionPane.showMessageDialog(null, "Inserção realizada com sucessso!");
           txtNome.setText("");
           txtTipo.setText("");
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "inserção não concluida");
       }
    }                                                   

    private void btnVoltarInserirActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        CRUDTela ct = new CRUDTela();
        ct.setVisible(true);
        this.dispose();
        
    }                                                

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

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
            java.util.logging.Logger.getLogger(InserirTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirmarInserir;
    private javax.swing.JButton btnVoltarInserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration                   
}
