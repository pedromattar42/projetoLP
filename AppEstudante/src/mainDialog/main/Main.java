package mainDialog.main;

import java.awt.Component;
import mainDialog.form.Form_AdicionarDisciplina;
import mainDialog.form.Form_BancoQuestoes;
import mainDialog.form.Form_Calendario;
import mainDialog.form.Form_Dashboard;
import mainDialog.form.Form_Empty;
import mainDialog.form.Form_Enem_Materiais;
import mainDialog.form.Form_Enem_Videos;
import mainDialog.form.Form_Pomodoro;
import mainDialog.form.Form_Rendimento;
import mainDialog.menu.EventMenuSelected;

public class Main extends javax.swing.JFrame {

    private static Main main;
    static int id_estudante;
    private Form_Pomodoro pomodoroForm;
    private Form_Dashboard dashboardForm;
    private Form_Rendimento rendimentoForm;
    private Form_AdicionarDisciplina adicionarDisciplinaForm;
    private Form_Enem_Videos enemFormVideos;
    private Form_Enem_Materiais enemFormMateriais;
    private Form_Calendario calendarioForm;
    private Form_BancoQuestoes bancoQuestoesForm;

    public Main() {
        initComponents();
        init();
    }

    public static void setUser(int id_estudante) {
        Main.id_estudante = id_estudante;
    }

    public static int getUser() {
        return id_estudante;
    }

    private void init() {
        main = this;
        pomodoroForm = new Form_Pomodoro();
        dashboardForm = new Form_Dashboard();
        rendimentoForm = new Form_Rendimento();
        adicionarDisciplinaForm = new Form_AdicionarDisciplina();
        enemFormVideos = new Form_Enem_Videos();
        enemFormMateriais = new Form_Enem_Materiais();
        calendarioForm = new Form_Calendario();
        bancoQuestoesForm = new Form_BancoQuestoes();

        titleBar.initializeJFrame(this);
        menu.addMenuEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                showFormByIndex(index, indexSubMenu);
            }
        });
        menu.setSelectedIndex(0, 0);
    }

    public void showComponentsAndForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    public void showFormByIndex(int index, int indexSubMenu) {
        if (index == 0 && indexSubMenu == 0) {
            showComponentsAndForm(dashboardForm);
        } else if (index == 1 && indexSubMenu == 0) {
            showComponentsAndForm(adicionarDisciplinaForm);
        } else if (index == 2 && indexSubMenu == 0) {
            showComponentsAndForm(bancoQuestoesForm);
        } else if (index == 3 && indexSubMenu == 0) {
            showComponentsAndForm(calendarioForm);
        } else if (index == 5 && indexSubMenu == 0) {
            showComponentsAndForm(rendimentoForm);
        } else if (index == 6 && indexSubMenu == 1) {
            showComponentsAndForm(enemFormVideos);
        } else if (index == 6 && indexSubMenu == 2) {
            showComponentsAndForm(enemFormMateriais);
        } else if (index == 7 && indexSubMenu == 0) {
            showComponentsAndForm(pomodoroForm);
        } else {
            showComponentsAndForm(new Form_Empty(index + " " + indexSubMenu));
        }
    }

    public static Main getMain() {
        return main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menu = new mainDialog.menu.Menu();
        titleBar = new mainDialog.structural.titlebar.TitleBar();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private mainDialog.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private mainDialog.structural.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables
}
