/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainDialog.form;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Form_Enem_Materiais extends javax.swing.JPanel {

    public Form_Enem_Materiais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new mainDialog.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        redacoesPdfs = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        apostilas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        principaisAssuntos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        card1.setDescription("Nessa aba você terá acesso a materiais que irão te auxiliar em sua jornada de estudos para o enem.");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.NOTE_ADD);
        card1.setValues("Materiais ");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        jLabel5.setText("REDAÇÕES");

        redacoesPdfs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cartilha de redações", "Repertórios", "Situações nota zero", "Competências", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        redacoesPdfs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        redacoesPdfs.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                redacoesPdfsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(redacoesPdfs);

        apostilas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ciências da Natureza", "Ciências Humanas", "Linguagens", "Matemática", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        apostilas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        apostilas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apostilasMouseClicked(evt);
            }
        });
        apostilas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                apostilasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(apostilas);

        jLabel1.setText("APOSTILAS");

        principaisAssuntos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Assuntos mais recorrentes nos últimos anos", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        principaisAssuntos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        principaisAssuntos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                principaisAssuntosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(principaisAssuntos);

        jLabel2.setText("PRINCIPAIS ASSUNTOS");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel5)
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(111, 111, 111))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void redacoesPdfsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_redacoesPdfsValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList<String> source = (JList<String>) evt.getSource();
            int selectedIndex = source.getSelectedIndex();

            switch (selectedIndex) {
                case 0:
                    downloadAndShowDialog("cartilha_redacoes_LucasFelpi.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                    break;
                case 1:
                    downloadAndShowDialog("repertorios-redacao.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                    break;
                case 2:
                    downloadAndShowDialog("Situacoes_nota_zero.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                    break;
                case 3:
                    downloadAndShowDialog("competencias.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_redacoesPdfsValueChanged

    private void apostilasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_apostilasValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList<String> source = (JList<String>) evt.getSource();
            int selectedIndex = source.getSelectedIndex();

                switch (selectedIndex) {
                    case 0:
                        downloadAndShowDialog("ciencias_naturais_em_br.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                        break;
                    case 1:
                        downloadAndShowDialog("ciencias_humanas_em_br.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                        break;
                    case 2:
                        downloadAndShowDialog("linguagens_codigos_em_br.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                        break;
                    case 3:
                        downloadAndShowDialog("encceja_matematica_ens_medio.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                        break;
                    default:
                        throw new AssertionError();
                }
         }    }//GEN-LAST:event_apostilasValueChanged

    private void principaisAssuntosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_principaisAssuntosValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList<String> source = (JList<String>) evt.getSource();
            int selectedIndex = source.getSelectedIndex();

            switch (selectedIndex) {
                case 0:
                    downloadAndShowDialog("Guia-dos-Assuntos-do-Enem.pdf", "Sucesso. Seu PDF foi baixado!", "Falha ao baixar o PDF.");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_principaisAssuntosValueChanged

    private void apostilasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apostilasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_apostilasMouseClicked

    private void downloadAndShowDialog(String filename, String successMessage, String failureMessage) {
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
                showSuccessDialog(successMessage);
            } else {
                showFailureDialog(failureMessage);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> apostilas;
    private mainDialog.card.Card card1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> principaisAssuntos;
    private javax.swing.JList<String> redacoesPdfs;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
