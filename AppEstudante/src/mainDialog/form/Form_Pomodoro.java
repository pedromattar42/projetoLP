/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainDialog.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class Form_Pomodoro extends javax.swing.JPanel {

    private Timer pomodoroControl;
    private boolean isPaused = false;
    private Clip audioClip;

    public Form_Pomodoro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        card1 = new mainDialog.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        pausarPomodoro = new javax.swing.JButton();
        iniciarPomodoro = new javax.swing.JButton();
        pomodoroTimer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        novoPomodoro = new javax.swing.JButton();
        pausarPomodoro2 = new javax.swing.JButton();

        card1.setColor1(new java.awt.Color(255, 51, 51));
        card1.setColor2(new java.awt.Color(255, 255, 204));
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
        pomodoroTimer.setText("25:00");
        pomodoroTimer.setToolTipText("");
        ((AbstractDocument) pomodoroTimer.getDocument()).setDocumentFilter(new IntervaloDocumentFilter());
        pomodoroTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomodoroTimerActionPerformed(evt);
            }
        });

        jLabel1.setText("CONTÉM MÚSICA DE FUNDO");

        novoPomodoro.setText("NOVO");
        novoPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoPomodoroActionPerformed(evt);
            }
        });

        pausarPomodoro2.setText("Música");
        pausarPomodoro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutarPomodoroAction(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novoPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addComponent(pausarPomodoro2)
                        .addContainerGap())))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(pausarPomodoro2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
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
        playAudioLoop();
        pomodoroControl = new Timer(1000, new ActionListener() {
            int secondsRemaining = parseTimeString(pomodoroTimer.getText());

            @Override
            public void actionPerformed(ActionEvent e) {
                secondsRemaining--;
                if (secondsRemaining >= 0) {
                    pomodoroTimer.setText(formatTimeString(secondsRemaining));
                } else {
                    pomodoroControl.stop();
                    pomodoroTimer.setEditable(true);
                    iniciarPomodoro.setEnabled(true);
                    enableEditingAfterTimer();
                }
            }
        });
        pomodoroControl.start();
        pausarPomodoro.setEnabled(true);
        novoPomodoro.setEnabled(true);
        pomodoroTimer.setEditable(false);
        iniciarPomodoro.setEnabled(false);

    }//GEN-LAST:event_iniciarPomodoroActionPerformed

    private int parseTimeString(String timeString) {
        String[] parts = timeString.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    private String formatTimeString(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }

    private void enableEditingAfterTimer() {
        pomodoroTimer.setEditable(true);
        iniciarPomodoro.setEnabled(true);
        pausarPomodoro.setEnabled(false);
        stopAudioLoop();
    }

    private void playAudioLoop() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/sounds/lofi1.wav").getAbsoluteFile());
            audioClip = AudioSystem.getClip();
            audioClip.open(audioInputStream);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
            audioClip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean stopAudioLoop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
            audioClip.close();
            
            return true;
        }
        
        return false;
    }

    private void pausarPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarPomodoroActionPerformed
        if (!isPaused) {
            pomodoroControl.stop();
            pausarPomodoro.setText("RETOMAR");
            stopAudioLoop();
        } else {
            pomodoroControl.start();
            pausarPomodoro.setText("PAUSAR");
            playAudioLoop();
        }
        isPaused = !isPaused;
    }//GEN-LAST:event_pausarPomodoroActionPerformed

    private void novoPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoPomodoroActionPerformed
        if (pomodoroControl != null && pomodoroControl.isRunning()) {
            pomodoroControl.stop();
        }
        stopAudioLoop();
        pomodoroTimer.setText("25:00");
        pausarPomodoro.setText("PAUSAR");
        pomodoroTimer.setEditable(true);
        iniciarPomodoro.setEnabled(true);
        pausarPomodoro.setEnabled(false);
        novoPomodoro.setEnabled(false);
    }//GEN-LAST:event_novoPomodoroActionPerformed

    private void pomodoroTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomodoroTimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomodoroTimerActionPerformed

    private void mutarPomodoroAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutarPomodoroAction
        if(!stopAudioLoop()){
            playAudioLoop();
        }
    }//GEN-LAST:event_mutarPomodoroAction


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mainDialog.card.Card card1;
    private javax.swing.JButton iniciarPomodoro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton novoPomodoro;
    private javax.swing.JButton pausarPomodoro;
    private javax.swing.JButton pausarPomodoro2;
    private javax.swing.JTextField pomodoroTimer;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
