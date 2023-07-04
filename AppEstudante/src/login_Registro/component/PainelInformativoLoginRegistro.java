package login_Registro.component;

import login_Registro.swing.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PainelInformativoLoginRegistro extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###", DecimalFormatSymbols.getInstance(Locale.US));
    private ActionListener evento;
    private MigLayout layout;
    private JLabel titulo;
    private JLabel descricao;
    private JLabel subDescricao;
    private ButtonOutLine botao;
    private boolean isLogin;

    public PainelInformativoLoginRegistro() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]25[]10[]25[]push");
        setLayout(layout);
        init();

    }

    private void init() {
        titulo = new JLabel("Bem vindo!");
        titulo.setFont(new Font("sansserif", 1, 30));
        titulo.setForeground(new Color(245, 245, 245));
        add(titulo);
        descricao = new JLabel("Para acessar a plataforma, faça o login.");
        descricao.setForeground(new Color(245, 245, 245));
        add(descricao);
        subDescricao = new JLabel("Bons estudos!");
        subDescricao.setForeground(new Color(245, 245, 245));
        add(subDescricao);
        botao = new ButtonOutLine();
        botao.setBackground(new Color(255, 255, 255));
        botao.setForeground(new Color(255, 255, 255));
        botao.setText("LOGIN");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                evento.actionPerformed(ae);
            }
        });
        add(botao, "w 60%, h 40");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gradiente = new GradientPaint(0, 0, new Color(78, 84, 200), 0, getHeight(), new Color(143, 148, 251));
        g2.setPaint(gradiente);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public void adicionarEvento(ActionListener evento) {
        this.evento = evento;
    }

    public void registrarEsquerda(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(titulo, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(descricao, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(subDescricao, "pad 0 -" + v + "% 0 0");
    }

    public void registrarDireita(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(titulo, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(descricao, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(subDescricao, "pad 0 -" + v + "% 0 0");
    }

    public void loginEsquerda(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(titulo, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(descricao, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(subDescricao, "pad 0 " + v + "% 0 " + v + "%");
    }

    public void loginDireita(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(titulo, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(descricao, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(subDescricao, "pad 0 " + v + "% 0 " + v + "%");
    }

    public void login(boolean login) {
        if (this.isLogin != login) {
            if (login) {
                titulo.setText("Olá, Estudante!");
                descricao.setText("Informe seus dados pessoais");
                subDescricao.setText("e dê início aos seus estudos");
                botao.setText("CADASTRAR");
            } else {
                titulo.setText("Bem-vindo!");
                descricao.setText("Para acessar a plataforma, faça o login.");
                subDescricao.setText("Bons estudos!");
                botao.setText("LOGIN");
            }
            this.isLogin = login;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
