/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainDialog.form;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Form_BancoQuestoes extends javax.swing.JPanel {

    public Form_BancoQuestoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new mainDialog.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enemPplProvas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        milQuestoesBotao = new javax.swing.JButton();
        enemPplBotao = new javax.swing.JButton();
        provasEnem = new javax.swing.JButton();
        exerciciosSeparadosPorDisciplinaBotao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        card1.setDescription("Nessa aba você terá acesso a inúmeras questões de vestibular que lhe auxiliarão em seus estudos para vestibulares e ensino médio.");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.BACKUP);
        card1.setValues("BANCO DE QUESTÕES");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        jLabel1.setText("+10.000 QUESTÕES");
        jLabel1.setToolTipText("");

        jLabel2.setText("PROVAS ENEM 2008-2019");

        enemPplProvas.setText("PROVAS ENEM PPL 2009-2016");

        jLabel5.setText("EXERCÍCIOS SEPARADOS POR DISCIPLINA");

        milQuestoesBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baixar-pdf.png"))); // NOI18N
        milQuestoesBotao.setText("BAIXAR");
        milQuestoesBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                milQuestoesBotaoMouseClicked(evt);
            }
        });
        milQuestoesBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milQuestoesBotaoActionPerformed(evt);
            }
        });

        enemPplBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baixar-pdf.png"))); // NOI18N
        enemPplBotao.setText("BAIXAR");
        enemPplBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enemPplBotaoMouseClicked(evt);
            }
        });

        provasEnem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baixar-pdf.png"))); // NOI18N
        provasEnem.setText("BAIXAR");
        provasEnem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provasEnemMouseClicked(evt);
            }
        });

        exerciciosSeparadosPorDisciplinaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baixar-pdf.png"))); // NOI18N
        exerciciosSeparadosPorDisciplinaBotao.setText("BAIXAR");
        exerciciosSeparadosPorDisciplinaBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exerciciosSeparadosPorDisciplinaBotaoMouseClicked(evt);
            }
        });
        exerciciosSeparadosPorDisciplinaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exerciciosSeparadosPorDisciplinaBotaoActionPerformed(evt);
            }
        });

        jLabel3.setText("QUESTÕES MATEMÁTICA");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baixar-pdf.png"))); // NOI18N
        jButton1.setText("BAIXAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(enemPplProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemPplBotao))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(milQuestoesBotao))))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(provasEnem)
                            .addComponent(exerciciosSeparadosPorDisciplinaBotao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milQuestoesBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enemPplProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enemPplBotao))
                .addGap(24, 24, 24)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(provasEnem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(exerciciosSeparadosPorDisciplinaBotao))
                .addGap(26, 26, 26)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void downloadAndShowDialog(String filename) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(filename));
        int returnValue = fileChooser.showSaveDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            InputStream inputStream = getClass().getClassLoader()
                    .getResourceAsStream("archives/" + filename);

            boolean success = downloadFile(inputStream, filePath);

            if (success) {
                showSuccessDialog("Sucesso. Seu arquivo foi baixado!");
            } else {
                showFailureDialog("Falha ao baixar o arquivo.");
            }
        }
    }

    private boolean downloadFile(InputStream inputStream, String filePath) {
        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void showSuccessDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showFailureDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Falha", JOptionPane.ERROR_MESSAGE);
    }


    private void milQuestoesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milQuestoesBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milQuestoesBotaoActionPerformed

    private void milQuestoesBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_milQuestoesBotaoMouseClicked
        downloadAndShowDialog("dezMilQuestoes.zip");
    }//GEN-LAST:event_milQuestoesBotaoMouseClicked

    private void exerciciosSeparadosPorDisciplinaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exerciciosSeparadosPorDisciplinaBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exerciciosSeparadosPorDisciplinaBotaoActionPerformed

    private void enemPplBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enemPplBotaoMouseClicked
        downloadAndShowDialog("enemPPL.zip");
    }//GEN-LAST:event_enemPplBotaoMouseClicked

    private void provasEnemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provasEnemMouseClicked
        downloadAndShowDialog("ENEMprovas.zip");
    }//GEN-LAST:event_provasEnemMouseClicked

    private void exerciciosSeparadosPorDisciplinaBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exerciciosSeparadosPorDisciplinaBotaoMouseClicked
        downloadAndShowDialog("questoesPorAssunto.zip");
    }//GEN-LAST:event_exerciciosSeparadosPorDisciplinaBotaoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        downloadAndShowDialog("matematicaApostilas.zip");
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mainDialog.card.Card card1;
    private javax.swing.JButton enemPplBotao;
    private javax.swing.JLabel enemPplProvas;
    private javax.swing.JButton exerciciosSeparadosPorDisciplinaBotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton milQuestoesBotao;
    private javax.swing.JButton provasEnem;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
