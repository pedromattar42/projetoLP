/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaswingdev.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author pedro
 */
public class Form_Pomodoro extends javax.swing.JPanel {
    private Timer pomodoroControl;

    public Form_Pomodoro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        card1 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        pausarPomodoro = new javax.swing.JButton();
        iniciarPomodoro = new javax.swing.JButton();
        pomodoroTimer = new javax.swing.JTextField();

        card1.setDescription("Nessa aba você poderá utilizar a técnica pomodoro em seus estudos.");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.TIMER);
        card1.setValues("POMODORO");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        pausarPomodoro.setText("PAUSAR");
        pausarPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarPomodoroActionPerformed(evt);
            }
        });

        iniciarPomodoro.setText("INICIAR");
        iniciarPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPomodoroActionPerformed(evt);
            }
        });

        pomodoroTimer.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        pomodoroTimer.setText("00:00");
        ((AbstractDocument) pomodoroTimer.getDocument()).setDocumentFilter(new IntervaloDocumentFilter());
        pomodoroTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomodoroTimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

     class IntervaloDocumentFilter extends DocumentFilter {

        @Override
        public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
            if (length == 1 && fb.getDocument().getText(offset, length).equals(":")) {
                return;
            }
            super.remove(fb, offset, length);
        }

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            StringBuilder sb = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.insert(offset, text);

            if (!validarIntervalo(sb.toString())) {
                return;
            }

            super.insertString(fb, offset, text, attr);
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            StringBuilder sb = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.replace(offset, offset + length, text);

            if (!validarIntervalo(sb.toString())) {
                return;
            }

            super.replace(fb, offset, length, text, attrs);
        }

        private boolean validarIntervalo(String intervalo) {
            if (!intervalo.matches("\\d{0,2}:\\d{0,2}")) {
                return false;
            }

            String[] partes = intervalo.split(":");
            if (partes.length != 2) {
                return false;
            }

            int minutos;
            int segundos;
            try {
                minutos = Integer.parseInt(partes[0]);
                segundos = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                return false;
            }

            if (minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {
                return false;
            }

            return true;
        }
    }
     
    private void iniciarPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPomodoroActionPerformed
        String intervalo = pomodoroTimer.getText();

        if (intervalo.matches("\\d{2}:\\d{2}")) {
            String[] partes = intervalo.split(":");
            int minutos = Integer.parseInt(partes[0]);
            int segundos = Integer.parseInt(partes[1]);

            if (minutos >= 0 && segundos >= 0) {
                int totalSegundos = minutos * 60 + segundos;

                pomodoroControl = new Timer(1000, new ActionListener() {
                    int count = totalSegundos;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        count--;

                        if (count >= 0) {
                            int minutosAtual = count / 60;
                            int segundosAtual = count % 60;
                            String tempoAtual = String.format("%02d:%02d", minutosAtual, segundosAtual);
                            pomodoroTimer.setText(tempoAtual);
                        } else {
                            pomodoroControl.stop();
                        }
                    }
                });

                pomodoroControl.start();
            }
        }
    }//GEN-LAST:event_iniciarPomodoroActionPerformed

    private void pausarPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarPomodoroActionPerformed
        if (pomodoroControl != null) {
            pomodoroControl.stop();
        }
    }//GEN-LAST:event_pausarPomodoroActionPerformed

    private void pomodoroTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomodoroTimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomodoroTimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JButton iniciarPomodoro;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pausarPomodoro;
    private javax.swing.JTextField pomodoroTimer;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
