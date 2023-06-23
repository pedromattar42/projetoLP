/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaswingdev.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

/**
 *
 * @author pedro
 */
public class Rendimento extends javax.swing.JPanel {

    private int totalYield = 0; //total do rendimento do aluno
    private JProgressBar pbar;

    public Rendimento() {
        initComponents();
        pbar = incomeProgressBar;
        addCheckBoxListeners(checkBoxEveryClass, checkBoxAllActivities, checkBoxTimeline, checkBoxAditionalResources,
                checkBoxStudyTime, checkBoxAttendClass, checkBoxMeetDeadlines, checkBoxContribute,
                checkBoxIntegrateKnowledge, checkBoxReviews);
    }

    private void addCheckBoxListeners(JCheckBox... checkBoxes) {
        for (JCheckBox checkBox : checkBoxes) {
            checkBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkBox.isSelected()) {
                        totalYield += 10;
                    } else {
                        totalYield -= 10;
                    }

                    pbar.setValue(totalYield);
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        checkBoxAllActivities = new javax.swing.JCheckBox();
        checkBoxEveryClass = new javax.swing.JCheckBox();
        checkBoxAditionalResources = new javax.swing.JCheckBox();
        checkBoxAttendClass = new javax.swing.JCheckBox();
        checkBoxContribute = new javax.swing.JCheckBox();
        checkBoxReviews = new javax.swing.JCheckBox();
        checkBoxTimeline = new javax.swing.JCheckBox();
        checkBoxStudyTime = new javax.swing.JCheckBox();
        checkBoxMeetDeadlines = new javax.swing.JCheckBox();
        checkBoxIntegrateKnowledge = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        incomeProgressBar = new javax.swing.JProgressBar();
        card1 = new javaswingdev.card.Card();

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        checkBoxAllActivities.setText("Fiz todas as atividades propostas durante a semana");

        checkBoxEveryClass.setText("Compareci a todas as aulas");

        checkBoxAditionalResources.setText("Busquei explorar recursos de estudo adicionais");

        checkBoxAttendClass.setText("Participei ativamente de alguma aula");

        checkBoxContribute.setText("Contribui de forma colaborativa");

        checkBoxReviews.setText("Fiz revisões regulares");

        checkBoxTimeline.setText("Mantive meu cronograma de estudos nas disciplinas");

        checkBoxStudyTime.setText("Dediquei um tempo de estudo para a(s) disciplina(s) que possuo dificuldade");

        checkBoxMeetDeadlines.setText("Cumprir prazos estabelecidos");

        checkBoxIntegrateKnowledge.setText("Integrei conhecimentos entre as disciplinas");

        jLabel5.setText("RENDIMENTO GERAL (%)");

        incomeProgressBar.setToolTipText("");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxAllActivities)
                                    .addComponent(checkBoxEveryClass))
                                .addGap(32, 32, 32))
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addComponent(checkBoxAditionalResources, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxAttendClass, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBoxContribute, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxStudyTime, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBoxTimeline)))
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(checkBoxReviews, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxMeetDeadlines, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(checkBoxIntegrateKnowledge, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(incomeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAllActivities)
                    .addComponent(checkBoxAttendClass)
                    .addComponent(checkBoxTimeline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxEveryClass)
                    .addComponent(checkBoxContribute)
                    .addComponent(checkBoxStudyTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAditionalResources)
                    .addComponent(checkBoxReviews)
                    .addComponent(checkBoxMeetDeadlines))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxIntegrateKnowledge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        card1.setDescription("Nessa aba você poderá acompanhar seu rendimento estudantil semanal.");
        card1.setValues("RENDIMENTO SEMANAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JCheckBox checkBoxAditionalResources;
    private javax.swing.JCheckBox checkBoxAllActivities;
    private javax.swing.JCheckBox checkBoxAttendClass;
    private javax.swing.JCheckBox checkBoxContribute;
    private javax.swing.JCheckBox checkBoxEveryClass;
    private javax.swing.JCheckBox checkBoxIntegrateKnowledge;
    private javax.swing.JCheckBox checkBoxMeetDeadlines;
    private javax.swing.JCheckBox checkBoxReviews;
    private javax.swing.JCheckBox checkBoxStudyTime;
    private javax.swing.JCheckBox checkBoxTimeline;
    private javax.swing.JProgressBar incomeProgressBar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    private textfield.TextField textField1;
    private textfield.TextField textField2;
    private textfield.TextField textField3;
    private textfield.TextField textField4;
    private textfield.TextField textField5;
    private textfield.TextField textField6;
    private textfield.TextField textField7;
    private textfield.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
