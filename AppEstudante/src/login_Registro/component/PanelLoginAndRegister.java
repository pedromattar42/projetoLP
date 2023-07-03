package login_Registro.component;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import login_Registro.swing.Button;
import login_Registro.swing.MyPasswordField;
import login_Registro.swing.MyTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import mainDialog.main.Main;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Criar conta");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(78, 84, 200));
        register.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/user.png")));
        txtUser.setHint("Nome");
        register.add(txtUser, "w 60%");
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail, "w 60%");
        MyTextField txtNumeroMatricula = new MyTextField();
        txtNumeroMatricula.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtNumeroMatricula.setHint("Número de matrícula");
        register.add(txtNumeroMatricula, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/pass.png")));
        txtPass.setHint("Senha");
        register.add(txtPass, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(new Color(78, 84, 200));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("CADASTRAR");
        register.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    UsuarioDTO estudante = new UsuarioDTO();

                    estudante.setEmail(txtEmail.getText());
                    estudante.setSenha(txtPass.getText());
                    estudante.setNome(txtUser.getText());
                    estudante.setMatricula(txtNumeroMatricula.getText());

                    UsuarioDAO estudanteDAO = new UsuarioDAO();
                    int resultUsuarioDAO = estudanteDAO.cadastrarUsuario(estudante);

                    if (resultUsuarioDAO != -1) {
                        Main.setUser(resultUsuarioDAO);
                        Main main = new Main();
                        main.show();
                        ((JFrame) SwingUtilities.getWindowAncestor(register)).dispose();
                    } else {
                        // tratar error
                        System.err.println("Usuario inválido!");
                    }

                } catch (Exception exception) {
                    System.err.println("Error: " + exception);
                }
            }
        });
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Login");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(78, 84, 200));
        login.add(label);
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtEmail.setHint("Email");
        login.add(txtEmail, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/pass.png")));
        txtPass.setHint("Senha");
        login.add(txtPass, "w 60%");
        JButton cmdForget = new JButton("Esqueceu sua senha?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        Button cmd = new Button();
        cmd.setBackground(new Color(78, 84, 200));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("LOGIN");
        login.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Checar se o login e senha existe
                    UsuarioDTO estudante = new UsuarioDTO();
                    estudante.setEmail(txtEmail.getText());
                    estudante.setSenha(txtPass.getText());

                    UsuarioDAO estudanteDAO = new UsuarioDAO();
                    int resultUsuarioDAO = estudanteDAO.antenticacaoUsuario(estudante);

                    if (resultUsuarioDAO != -1) {
                        Main.setUser(resultUsuarioDAO);
                        Main main = new Main();
                        main.show();
                        ((JFrame) SwingUtilities.getWindowAncestor(login)).dispose();
                    } else {
                        // tratar error
                        System.err.println("Usuario inválido!");
                    }
                } catch (Exception exception) {
                    System.err.println("Error: " + exception);
                }
            }
        });

    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
