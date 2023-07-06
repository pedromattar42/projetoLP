/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainDialog.form;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;


public class Form_Enem_Videos extends javax.swing.JPanel {

    /**
     * Creates new form Form_Enem
     */
    public Form_Enem_Videos() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        card1 = new mainDialog.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        botaoPagina1 = new javax.swing.JRadioButton();
        botaoPagina2 = new javax.swing.JRadioButton();
        botaoPagina3 = new javax.swing.JRadioButton();
        painelImagem = new javax.swing.JLabel();
        botaoPagina4 = new javax.swing.JRadioButton();

        card1.setDescription("Nessa aba você terá acesso a vários vídeos que irão auxiliar na sua jornada de estudos para o enem.");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.BOOK);
        card1.setValues("ENEM");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        buttonGroup1.add(botaoPagina1);
        botaoPagina1.setSelected(true);
        botaoPagina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagina1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoPagina2);
        botaoPagina2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagina2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoPagina3);
        botaoPagina3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagina3ActionPerformed(evt);
            }
        });

        painelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matematica-basica.jpg"))); // NOI18N
        painelImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(botaoPagina4);
        botaoPagina4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagina4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(botaoPagina1)
                .addGap(27, 27, 27)
                .addComponent(botaoPagina2)
                .addGap(29, 29, 29)
                .addComponent(botaoPagina3)
                .addGap(26, 26, 26)
                .addComponent(botaoPagina4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPagina1)
                    .addComponent(botaoPagina2)
                    .addComponent(botaoPagina3)
                    .addComponent(botaoPagina4))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPagina3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagina3ActionPerformed
        painelImagem.setIcon(new ImageIcon(getClass().getResource("/images/como-nao-ser-eliminado-enem.jpg")));
        MouseListener[] mouseListeners = painelImagem.getMouseListeners();
        if (mouseListeners.length > 0) {
            painelImagem.removeMouseListener(mouseListeners[0]); // Remove o MouseListener anterior
        }
        painelImagem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage("https://www.youtube.com/watch?v=6fUpWZMuUa0&t=10s&pp=ygUKZW5lbSBkaWNhcw%3D%3D");
            }
        });
    }//GEN-LAST:event_botaoPagina3ActionPerformed

    private void botaoPagina2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagina2ActionPerformed
        painelImagem.setIcon(new ImageIcon(getClass().getResource("/images/como-estudar-enem.jpg")));
        MouseListener[] mouseListeners = painelImagem.getMouseListeners();
        if (mouseListeners.length > 0) {
            painelImagem.removeMouseListener(mouseListeners[0]); // Remove o MouseListener anterior
        }
        painelImagem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage("https://www.youtube.com/watch?v=apQ8LQHARMg&pp=ygUEZW5lbQ%3D%3D");
            }
        });
    }//GEN-LAST:event_botaoPagina2ActionPerformed

    private void botaoPagina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagina1ActionPerformed
        painelImagem.setIcon(new ImageIcon(getClass().getResource("/images/matematica-basica.jpg")));
        MouseListener[] mouseListeners = painelImagem.getMouseListeners();
        if (mouseListeners.length > 0) {
            painelImagem.removeMouseListener(mouseListeners[0]); // Remove o MouseListener anterior
        }
        painelImagem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage("https://www.youtube.com/watch?v=ddZHkCUcYRM&pp=ygUWbWF0ZW1hdGljYSBiYXNpY2EgZW5lbQ%3D%3D");
            }
        });
    }//GEN-LAST:event_botaoPagina1ActionPerformed

    private void botaoPagina4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagina4ActionPerformed
 painelImagem.setIcon(new ImageIcon(getClass().getResource("/images/aulao-biologia-enem.jpg")));
        MouseListener[] mouseListeners = painelImagem.getMouseListeners();
        if (mouseListeners.length > 0) {
            painelImagem.removeMouseListener(mouseListeners[0]); // Remove o MouseListener anterior
        }
        painelImagem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage("https://www.youtube.com/watch?v=f7Mx_tRu-F4&pp=ygUSYmlvbG9naWEgcGFyYSBlbmVt");
            }
        });    }//GEN-LAST:event_botaoPagina4ActionPerformed
    private static void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoPagina1;
    private javax.swing.JRadioButton botaoPagina2;
    private javax.swing.JRadioButton botaoPagina3;
    private javax.swing.JRadioButton botaoPagina4;
    private javax.swing.ButtonGroup buttonGroup1;
    private mainDialog.card.Card card1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel painelImagem;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
