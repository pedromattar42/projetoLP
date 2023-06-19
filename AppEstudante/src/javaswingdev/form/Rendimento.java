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
        checkBoxAllActivities = new javax.swing.JCheckBox();
        checkBoxEveryClass = new javax.swing.JCheckBox();
        checkBoxAditionalResources = new javax.swing.JCheckBox();
        checkBoxTimeline = new javax.swing.JCheckBox();
        checkBoxReviews = new javax.swing.JCheckBox();
        checkBoxStudyTime = new javax.swing.JCheckBox();
        incomeProgressBar = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        checkBoxAttendClass = new javax.swing.JCheckBox();
        checkBoxMeetDeadlines = new javax.swing.JCheckBox();
        checkBoxContribute = new javax.swing.JCheckBox();
        checkBoxIntegrateKnowledge = new javax.swing.JCheckBox();

        checkBoxAllActivities.setText("Fiz todas as atividades propostas durante a semana");

        checkBoxEveryClass.setText("Compareci a todas as aulas");

        checkBoxAditionalResources.setText("Busquei explorar recursos de estudo adicionais");

        checkBoxTimeline.setText("Mantive meu cronograma de estudos nas disciplinas");

        checkBoxReviews.setText("Fiz revisões regulares");

        checkBoxStudyTime.setText("Dediquei um tempo de estudo para a(s) disciplina(s) que possuo dificuldade");

        incomeProgressBar.setToolTipText("");

        jLabel5.setText("RENDIMENTO GERAL (%)");

        checkBoxAttendClass.setText("Participei ativamente de alguma aula");

        checkBoxMeetDeadlines.setText("Cumprir prazos estabelecidos");

        checkBoxContribute.setText("Contribui de forma colaborativa");

        checkBoxIntegrateKnowledge.setText("Integrei conhecimentos entre as disciplinas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incomeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxEveryClass)
                            .addComponent(checkBoxAllActivities)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(checkBoxAttendClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkBoxAditionalResources, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(checkBoxContribute, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxReviews, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxTimeline)
                            .addComponent(checkBoxStudyTime, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxMeetDeadlines, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxIntegrateKnowledge, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAllActivities)
                    .addComponent(checkBoxTimeline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxReviews)
                    .addComponent(checkBoxEveryClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxStudyTime)
                    .addComponent(checkBoxAditionalResources))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAttendClass)
                    .addComponent(checkBoxMeetDeadlines))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxContribute)
                    .addComponent(checkBoxIntegrateKnowledge))
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
