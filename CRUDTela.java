CRUDTela.java

package com.mycompany.cursosti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDTela extends javax.swing.JFrame {

    /**
     * Creates new form CRUDTela
     */
    public CRUDTela() {
        super("Gerenciador de Cursos");
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            consultarCursos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados do banco.");
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCursos = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 9, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciamento de cursos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inserirButton);
        inserirButton.setBounds(170, 370, 88, 38);

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(atualizarButton);
        atualizarButton.setBounds(310, 370, 90, 38);

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(excluirButton);
        excluirButton.setBounds(450, 370, 85, 40);

        tableCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tableCursos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 515, 306);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(40, 370, 87, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
      
        InserirTela it = new InserirTela();
      it.setVisible(true);
      this.dispose();
      
    }                                             

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      AtualizarTela at = new AtualizarTela();
       at.setVisible(true);
       this.dispose();
       
    }                                               

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
      ExcluirTela et = new ExcluirTela();
       et.setVisible(true);
       this.dispose();
       
    }                                             

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                          
      EscolherTela et = new EscolherTela();
       et.setVisible(true);
       this.dispose();
       
    }                                         
    public void consultarCursos()throws Exception{
        DefaultTableModel model = (DefaultTableModel) tableCursos.getModel();
        model.setRowCount(0);
        
        String sql = "SELECT * FROM cursos";
        
        try(Connection conn = Conexao.obtemConexao()){
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
         while(rs.next()){
             model.addRow(new String[] {rs.getString(1), rs.getString(2), rs.getString(3)});
     }
        }
    }
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
            java.util.logging.Logger.getLogger(CRUDTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCursos;
    // End of variables declaration                   
}