CursosTela.java

  package com.mycompany.cursosti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CursosTela extends javax.swing.JFrame {

    /**
     * Creates new form CursosTela
     */
    public CursosTela() {
        super("Cursos Disponíveis");
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
            consultarCursos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados do banco");
            
        }
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableCursos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCurso = new javax.swing.JTable();
        btnVoltarConfirmar = new javax.swing.JButton();
        btnTrilhasEscolher = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(tableCursos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cursos ");

        jPanel1.setBackground(new java.awt.Color(9, 9, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        tableCurso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableCurso);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 40, 433, 294);

        btnVoltarConfirmar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltarConfirmar.setText("Voltar");
        btnVoltarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarConfirmar);
        btnVoltarConfirmar.setBounds(10, 400, 97, 34);

        btnTrilhasEscolher.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTrilhasEscolher.setText("Clique aqui para ver as informações gerais dos cursos.");
        btnTrilhasEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrilhasEscolherActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrilhasEscolher);
        btnTrilhasEscolher.setBounds(80, 350, 380, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnVoltarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        EscolherTela et = new EscolherTela();
        et.setVisible(true);
        this.dispose();

    }                                                  

    private void btnTrilhasEscolherActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        SelecionarTela t = new SelecionarTela();
        t.setVisible(true);
        this.dispose();

    }                                                  
    
    public void consultarCursos()throws Exception{
        DefaultTableModel model = (DefaultTableModel) tableCurso.getModel();
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
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnTrilhasEscolher;
    private javax.swing.JButton btnVoltarConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableCurso;
    private javax.swing.JTable tableCursos;
    // End of variables declaration                   
}
