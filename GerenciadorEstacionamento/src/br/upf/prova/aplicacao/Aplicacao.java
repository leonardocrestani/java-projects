/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.prova.aplicacao;

import br.upf.prova.domain.Estacionamento;

/**
 *
 * @author leona
 */
public class Aplicacao extends javax.swing.JFrame {
    
    Estacionamento estacionamento;

    /**
     * Creates new form aplicacao
     */
    public Aplicacao() {
        initComponents();
        this.setTitle("Gerenciador de estacionamento");
        Estacionamento estacionamento = new Estacionamento();
        this.estacionamento = estacionamento;
        campoVagasDisponiveis.setText(Integer.toString(estacionamento.getVagasDisponiveis()));
        int[] vagasOcupadas = estacionamento.getVagasOcupadas();
        campoVagasOcupadas.setText(
            "Espera: " + vagasOcupadas[0]
            + "  Primeiro: " + vagasOcupadas[1]
            + "  Segundo: " + vagasOcupadas[2]
            + "  Terceiro: " + vagasOcupadas[3]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoVagasDisponiveis = new javax.swing.JTextField();
        campoVagasOcupadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Chegada = new javax.swing.JButton();
        Saida = new javax.swing.JButton();
        campoExcecao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selecaoSaida = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estacionamento Leozin");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informações");

        campoVagasDisponiveis.setEditable(false);
        campoVagasDisponiveis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoVagasOcupadas.setEditable(false);
        campoVagasOcupadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vagas Disponíveis");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vagas Ocupadas");

        Chegada.setBackground(new java.awt.Color(153, 255, 153));
        Chegada.setText("Chegada de veículo");
        Chegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChegadaActionPerformed(evt);
            }
        });

        Saida.setBackground(new java.awt.Color(255, 153, 153));
        Saida.setText("Saida de veículo");
        Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaActionPerformed(evt);
            }
        });

        campoExcecao.setEditable(false);
        campoExcecao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informe o andar de saída");

        selecaoSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andar 1", "Andar 2", "Andar 3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoVagasOcupadas)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(campoVagasDisponiveis)
                    .addComponent(jLabel4)
                    .addComponent(Chegada, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(selecaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Saida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoExcecao)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoVagasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Chegada)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecaoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Saida)
                .addGap(18, 18, 18)
                .addComponent(campoExcecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChegadaActionPerformed
        try{
            estacionamento.chegada();
            campoVagasDisponiveis.setText(Integer.toString(estacionamento.getVagasDisponiveis()));
            int[] vagasOcupadas = estacionamento.getVagasOcupadas();
            campoVagasOcupadas.setText(
                "Espera: " + vagasOcupadas[0]
                + "  Primeiro: " + vagasOcupadas[1]
                + "  Segundo: " + vagasOcupadas[2]
                + "  Terceiro: " + vagasOcupadas[3]);
            campoExcecao.setText("");
        }
        catch(Exception ex) {
            campoExcecao.setText(ex.getMessage());
        }
    }//GEN-LAST:event_ChegadaActionPerformed

    private void SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaActionPerformed
        int andarSaida = selecaoSaida.getSelectedIndex() + 1;
        try{
            estacionamento.saidaVeiculo(andarSaida);
            campoVagasDisponiveis.setText(Integer.toString(estacionamento.getVagasDisponiveis()));
            int[] vagasOcupadas = estacionamento.getVagasOcupadas();
            campoVagasOcupadas.setText(
            "Espera: " + vagasOcupadas[0]
                + "  Primeiro: " + vagasOcupadas[1]
                + "  Segundo: " + vagasOcupadas[2]
                + "  Terceiro: " + vagasOcupadas[3]);
            campoExcecao.setText("");
        }
        catch(Exception ex) {
            campoExcecao.setText(ex.getMessage());
        }
    }//GEN-LAST:event_SaidaActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chegada;
    private javax.swing.JButton Saida;
    private javax.swing.JTextField campoExcecao;
    private javax.swing.JTextField campoVagasDisponiveis;
    private javax.swing.JTextField campoVagasOcupadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> selecaoSaida;
    // End of variables declaration//GEN-END:variables
}
