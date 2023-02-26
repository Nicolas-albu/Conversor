/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.net.com.conversor;

/**
 *
 * @author Lan House
 */
public class TelaConversor extends javax.swing.JFrame {

    /**
     * Creates new form TelaConversor
     */
    public TelaConversor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAD = new javax.swing.JButton();
        btnComp = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();
        btnEM = new javax.swing.JButton();
        btnFrequen = new javax.swing.JButton();
        btnMassa = new javax.swing.JButton();
        btnPres = new javax.swing.JButton();
        btnTemp = new javax.swing.JButton();
        btnTempo = new javax.swing.JButton();
        btnTD = new javax.swing.JButton();
        btnVeloci = new javax.swing.JButton();
        btnVolume = new javax.swing.JButton();
        btnArea = new javax.swing.JButton();
        btnAngulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");

        btnAD.setText("Armazenamento de Dados");
        btnAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADActionPerformed(evt);
            }
        });

        btnComp.setText("Comprimento");
        btnComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompActionPerformed(evt);
            }
        });

        btnCC.setText("Consumo de Combustível");
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });

        btnEM.setText("Energia Mecânica");
        btnEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMActionPerformed(evt);
            }
        });

        btnFrequen.setText("Frequência");
        btnFrequen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrequenActionPerformed(evt);
            }
        });

        btnMassa.setText("Massa");
        btnMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMassaActionPerformed(evt);
            }
        });

        btnPres.setText("Pressão");
        btnPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresActionPerformed(evt);
            }
        });

        btnTemp.setText("Temperatura");
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });

        btnTempo.setText("Tempo");
        btnTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempoActionPerformed(evt);
            }
        });

        btnTD.setText("Transmissão de Dados");
        btnTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTDActionPerformed(evt);
            }
        });

        btnVeloci.setText("Velocidade");
        btnVeloci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelociActionPerformed(evt);
            }
        });

        btnVolume.setText("Volume");
        btnVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeActionPerformed(evt);
            }
        });

        btnArea.setText("Área");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnAngulo.setText("Ângulo");
        btnAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnguloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Converter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCC)
                    .addComponent(btnEM)
                    .addComponent(btnFrequen)
                    .addComponent(btnMassa)
                    .addComponent(btnPres)
                    .addComponent(btnTemp)
                    .addComponent(btnTempo)
                    .addComponent(btnTD)
                    .addComponent(btnVeloci)
                    .addComponent(btnVolume)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAD)
                            .addComponent(btnComp))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAngulo)
                            .addComponent(btnArea)))
                    .addComponent(jLabel1))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAD)
                    .addComponent(btnArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComp)
                    .addComponent(btnAngulo))
                .addGap(18, 18, 18)
                .addComponent(btnCC)
                .addGap(18, 18, 18)
                .addComponent(btnEM)
                .addGap(18, 18, 18)
                .addComponent(btnFrequen)
                .addGap(18, 18, 18)
                .addComponent(btnMassa)
                .addGap(18, 18, 18)
                .addComponent(btnPres)
                .addGap(18, 18, 18)
                .addComponent(btnTemp)
                .addGap(18, 18, 18)
                .addComponent(btnTempo)
                .addGap(18, 18, 18)
                .addComponent(btnTD)
                .addGap(18, 18, 18)
                .addComponent(btnVeloci)
                .addGap(18, 18, 18)
                .addComponent(btnVolume)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADActionPerformed
        // TODO add your handling code here:
        ArmazenamentoDados ad = new ArmazenamentoDados();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnADActionPerformed

    private void btnCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompActionPerformed
        // TODO add your handling code here:
        Comprimento com = new Comprimento();
        com.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCompActionPerformed

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        // TODO add your handling code here:
        ConsumoCombustivel cc = new ConsumoCombustivel();
        cc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCCActionPerformed

    private void btnEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMActionPerformed
        // TODO add your handling code here:
        EnergiaMecanica em = new EnergiaMecanica();
        em.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEMActionPerformed

    private void btnFrequenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrequenActionPerformed
        // TODO add your handling code here:
        Frequencia f = new Frequencia();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFrequenActionPerformed

    private void btnMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMassaActionPerformed
        // TODO add your handling code here:
        Massa m = new Massa();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMassaActionPerformed

    private void btnPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresActionPerformed
        // TODO add your handling code here:
        Pressao p = new Pressao();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPresActionPerformed

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        // TODO add your handling code here:
        Temperatura t = new Temperatura();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTempActionPerformed

    private void btnTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempoActionPerformed
        // TODO add your handling code here:
        Tempo tem = new Tempo();
        tem.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTempoActionPerformed

    private void btnTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTDActionPerformed
        // TODO add your handling code here:
        TransmissaoDados td = new TransmissaoDados();
        td.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTDActionPerformed

    private void btnVelociActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelociActionPerformed
        // TODO add your handling code here:
        Velocidade v = new Velocidade();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVelociActionPerformed

    private void btnVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeActionPerformed
        // TODO add your handling code here:
        Volume vo = new Volume();
        vo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolumeActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        // TODO add your handling code here:
        Area a = new Area();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnAnguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnguloActionPerformed
        // TODO add your handling code here:
        Angulo an = new Angulo();
        an.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAnguloActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAD;
    private javax.swing.JButton btnAngulo;
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnComp;
    private javax.swing.JButton btnEM;
    private javax.swing.JButton btnFrequen;
    private javax.swing.JButton btnMassa;
    private javax.swing.JButton btnPres;
    private javax.swing.JButton btnTD;
    private javax.swing.JButton btnTemp;
    private javax.swing.JButton btnTempo;
    private javax.swing.JButton btnVeloci;
    private javax.swing.JButton btnVolume;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
