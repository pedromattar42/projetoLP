/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaswingdev.form;

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
import javax.swing.JList;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Soundtrack 1", "Soundtrack 2", "Soundtrack 3", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("SELECIONAR MÚSICA DE FUNDO (OPCIONAL)");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(pomodoroTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pausarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(card1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
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
            .addGap(0, 964, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
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

                // Reprodução do áudio em uma nova thread
                Thread audioThread = new Thread(() -> {
                    try {
                        Clip clip = AudioSystem.getClip();
                        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("sounds/lofi1.mp3"));
                        clip.open(inputStream);
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                        clip.start();

                        // Aguarda a conclusão do pomodoro para parar a reprodução do áudio
                        Thread.sleep(totalSegundos * 1000);

                        clip.stop();
                        clip.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

                audioThread.start();

                // Resto do seu código...
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

    

    private void playAudio(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pausarPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarPomodoroActionPerformed
        if (pomodoroControl != null) {
            pomodoroControl.stop();
        }
    }//GEN-LAST:event_pausarPomodoroActionPerformed

    private void pomodoroTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomodoroTimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomodoroTimerActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList<String> source = (JList<String>) evt.getSource();
            int selectedIndex = source.getSelectedIndex();

            if (selectedIndex == 0) {
                String audioFilePath = "sounds/jh4TnnbIAKo_128.mp3";
            }
        }    }//GEN-LAST:event_jList1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JButton iniciarPomodoro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pausarPomodoro;
    private javax.swing.JTextField pomodoroTimer;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
