/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainDialog.form;

import DAO.CalendarioDAO;
import DTO.CalendarioDTO;
import java.util.ArrayList;
import mainDialog.main.Main;
import javax.swing.table.DefaultTableModel;


public class Form_Calendario extends javax.swing.JPanel {

    public Form_Calendario() {
        initComponents();
        listarRotina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new mainDialog.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        calendarioTabela = new mainDialog.structural.table.Table();
        submissaoBotao = new javax.swing.JButton();

        card1.setDescription("Nessa aba você poderá customizar a sua rotina de estudos semanal.");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.DATE_RANGE);
        card1.setValues("CALENDÁRIO");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        calendarioTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:00", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(calendarioTabela);

        submissaoBotao.setBackground(new java.awt.Color(153, 153, 255));
        submissaoBotao.setForeground(new java.awt.Color(255, 255, 255));
        submissaoBotao.setText("SALVAR");
        submissaoBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submissaoBotaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submissaoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(submissaoBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submissaoBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submissaoBotaoMouseClicked
        CalendarioDAO rotinaDAO = new CalendarioDAO();
        rotinaDAO.excluirRotina();
        addRotina();
    }//GEN-LAST:event_submissaoBotaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mainDialog.structural.table.Table calendarioTabela;
    private mainDialog.card.Card card1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javax.swing.JButton submissaoBotao;
    // End of variables declaration//GEN-END:variables

    private void addRotina() {
        try {
            DefaultTableModel model = (DefaultTableModel) calendarioTabela.getModel();
            int numRows = model.getRowCount();
            int numCols = model.getColumnCount();

            CalendarioDAO rotinaDAO = new CalendarioDAO();
            ArrayList<Object> valoresNaoNulos = new ArrayList<>();

            for (int i = 0; i < numRows; i++) {
                CalendarioDTO rotina = new CalendarioDTO();
                rotina.setHorario(Integer.toString(i + 8));
                rotina.setId_estudante(Main.getUser());
                for (int j = 1; j < numCols; j++) {
                    Object value = model.getValueAt(i, j);
                    if (value != null) {
                        if (!value.equals("") && !value.equals(" ") && !value.equals(' ')) {
                            valoresNaoNulos.add(value);
                            rotina.setInfo(value.toString());
                            rotina.setDia_semana(model.getColumnName(j));

                            boolean result = rotinaDAO.cadastrarRotina(rotina);

                            if (result) {
                                System.out.println("Sucesso!");
                            } else {
                                System.out.println("Error!");
                            }
                        }
                    }
                } 
            }    
        } catch (Exception e) {
            // tratar erro
            System.out.println("Error (Adicionar rotina)");
        }  
    }
    
    private void listarRotina() {
        try {
            CalendarioDAO rotinaDAO = new CalendarioDAO();
            DefaultTableModel model = (DefaultTableModel) calendarioTabela.getModel();
            ArrayList<CalendarioDTO> lista = rotinaDAO.pegarRotina(Main.getUser());
            int numRows = model.getRowCount();
            int numCols = model.getColumnCount();
            
            for (int num = 0; num < lista.size(); num++) {
                for (int i = 0; i < numRows; i++) {
                    for (int j = 1; j < numCols; j++) {
                        if (lista.get(num).getDia_semana().equals(model.getColumnName(j)) && lista.get(num).getHorario().equals(Integer.toString(i+8))) {  
                            model.setValueAt(lista.get(num).getInfo(), i, j);
                        }
                    }    
                }
            }
        } catch (Exception e) {
            System.out.println("Error (Listar rotina)");
        }
    }
}
