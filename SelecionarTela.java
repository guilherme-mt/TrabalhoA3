SelecionarTela.java

  package com.mycompany.cursosti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelecionarTela extends JFrame {

    public SelecionarTela() {
        // Configurações do JFrame
        setTitle("Informações sobre Meio Ambiente");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializa componentes
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Informações sobre Poluição da Água
        JLabel waterPollutionLabel = new JLabel("Poluição da Água");
        waterPollutionLabel.setFont(waterPollutionLabel.getFont().deriveFont(18.0f));
        panel.add(waterPollutionLabel);

        JTextArea waterPollutionText = new JTextArea(5, 40);
        waterPollutionText.setText("Explicação:\n"
            + "A poluição da água ocorre quando substâncias nocivas são introduzidas em corpos d'água, afetando sua qualidade e prejudicando a vida aquática e a saúde humana. Fontes comuns incluem esgoto doméstico, resíduos industriais, pesticidas agrícolas e plásticos.\n\n"
            + "Soluções:\n"
            + "1. Tratamento de Esgoto: Melhorar as infraestruturas de tratamento de esgoto para garantir que efluentes sejam devidamente tratados antes de serem lançados nos corpos d'água.\n"
            + "2. Redução de Plásticos: Implementar políticas de redução de plástico e promover o uso de materiais biodegradáveis.\n"
            + "3. Regulamentação Industrial: Estabelecer e aplicar normas rigorosas para o descarte de resíduos industriais.\n"
            + "4. Educação Ambiental: Promover a conscientização sobre a importância da preservação dos recursos hídricos e práticas sustentáveis.");
        waterPollutionText.setWrapStyleWord(true);
        waterPollutionText.setLineWrap(true);
        waterPollutionText.setOpaque(false);
        waterPollutionText.setEditable(false);
        panel.add(waterPollutionText);

        // Informações sobre Degradação do Habitat
        JLabel habitatDegradationLabel = new JLabel("Degradação do Habitat");
        habitatDegradationLabel.setFont(habitatDegradationLabel.getFont().deriveFont(18.0f));
        panel.add(habitatDegradationLabel);

        JTextArea habitatDegradationText = new JTextArea(5, 40);
        habitatDegradationText.setText("Explicação:\n"
            + "A degradação do habitat é a destruição ou alteração de ambientes naturais, resultando na perda de biodiversidade e na diminuição da qualidade do habitat para as espécies nativas. Isso pode ser causado por desmatamento, urbanização, agricultura intensiva e atividades industriais.\n\n"
            + "Soluções:\n"
            + "1. Proteção de Áreas Naturais: Criar e expandir áreas protegidas, como parques nacionais e reservas biológicas.\n"
            + "2. Restauro Ecológico: Implementar projetos de restauração para recuperar habitats degradados, replantando vegetação nativa e reintroduzindo espécies locais.\n"
            + "3. Práticas Sustentáveis: Promover práticas agrícolas e de manejo florestal sustentáveis que minimizem o impacto ambiental.\n"
            + "4. Planejamento Urbano: Desenvolver planejamento urbano que conserve áreas verdes e respeite os ecossistemas locais.");
        habitatDegradationText.setWrapStyleWord(true);
        habitatDegradationText.setLineWrap(true);
        habitatDegradationText.setOpaque(false);
        habitatDegradationText.setEditable(false);
        panel.add(habitatDegradationText);

        // Informações sobre Ecossistema Marinho
        JLabel marineEcosystemLabel = new JLabel("Ecossistema Marinho");
        marineEcosystemLabel.setFont(marineEcosystemLabel.getFont().deriveFont(18.0f));
        panel.add(marineEcosystemLabel);

        JTextArea marineEcosystemText = new JTextArea(5, 40);
        marineEcosystemText.setText("Explicação:\n"
            + "Os ecossistemas marinhos são fundamentais para a saúde do planeta, fornecendo alimentos, regulando o clima e abrigando uma vasta biodiversidade. A sobrepesca, poluição, mudança climática e acidificação dos oceanos são grandes ameaças.\n\n"
            + "Soluções:\n"
            + "1. Áreas Marinhas Protegidas: Estabelecer e ampliar áreas marinhas protegidas para conservar ecossistemas sensíveis e permitir a recuperação das populações de peixes.\n"
            + "2. Pesca Sustentável: Implementar e monitorar práticas de pesca sustentável, incluindo cotas de captura e métodos que minimizem o impacto no habitat.\n"
            + "3. Redução de Emissões de CO2: Adotar medidas para reduzir as emissões de gases de efeito estufa, diminuindo o aquecimento global e a acidificação dos oceanos.\n"
            + "4. Controle da Poluição: Melhorar a gestão de resíduos e o controle da poluição marinha, especialmente de plásticos e produtos químicos.");
        marineEcosystemText.setWrapStyleWord(true);
        marineEcosystemText.setLineWrap(true);
        marineEcosystemText.setOpaque(false);
        marineEcosystemText.setEditable(false);
        panel.add(marineEcosystemText);

        // Adiciona botões de Sair e Avaliar
        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(sairButton);

        JButton avaliarButton = new JButton("Avaliar");
        avaliarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AvaliarTela().setVisible(true);
                dispose();
                // Implementar a funcionalidade de avaliação
            }
        });
        panel.add(avaliarButton);

        // Adiciona o painel ao JFrame
        add(new JScrollPane(panel));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVoltarSelecionar = new javax.swing.JButton();
        btmConfirmarSelecionar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtIdTrilhas = new javax.swing.JTextField();
        txtIdAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar uma trilha para o aluno");
        setMinimumSize(new java.awt.Dimension(590, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(9, 9, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar trilha do aluno:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        btnVoltarSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltarSelecionar.setText("Voltar");
        btnVoltarSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarSelecionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarSelecionar);
        btnVoltarSelecionar.setBounds(50, 320, 101, 53);

        btmConfirmarSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btmConfirmarSelecionar.setText("Confirmar");
        btmConfirmarSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConfirmarSelecionarActionPerformed(evt);
            }
        });
        jPanel1.add(btmConfirmarSelecionar);
        btmConfirmarSelecionar.setBounds(450, 320, 97, 53);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome: "));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(80, 150, 418, 61);

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email: "));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(80, 230, 418, 61);

        txtIdTrilhas.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Trilhas:"));
        jPanel1.add(txtIdTrilhas);
        txtIdTrilhas.setBounds(320, 50, 176, 60);

        txtIdAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Aluno:"));
        jPanel1.add(txtIdAluno);
        txtIdAluno.setBounds(80, 50, 122, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 400);

        pack();
    }// </editor-fold>                        

    private void btmConfirmarSelecionarActionPerformed(java.awt.event.ActionEvent evt) {                                                       

    }                                                      

    private void btnVoltarSelecionarActionPerformed(java.awt.event.ActionEvent evt) {                                                    

    }                                                   

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
            java.util.logging.Logger.getLogger(SelecionarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btmConfirmarSelecionar;
    private javax.swing.JButton btnVoltarSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdAluno;
    private javax.swing.JTextField txtIdTrilhas;
    private javax.swing.JTextField txtNome;
    // End of variables declaration                   
}
