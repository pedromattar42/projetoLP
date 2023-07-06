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
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class LoginRegistro extends javax.swing.JLayeredPane {

    public LoginRegistro() {
        initComponents();
        initRegister();
        initLogin();
        painelDeRegistro.setVisible(true);
        painelDeLogin.setVisible(false);
    }

    private void initRegister() {
        painelDeRegistro.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Criar conta");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(78, 84, 200));
        painelDeRegistro.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/user.png")));
        txtUser.setHint("Nome");
        painelDeRegistro.add(txtUser, "w 60%");
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtEmail.setHint("Email");
        painelDeRegistro.add(txtEmail, "w 60%");
        MyTextField txtNumeroMatricula = new MyTextField();
        txtNumeroMatricula.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtNumeroMatricula.setHint("Número de matrícula");
        painelDeRegistro.add(txtNumeroMatricula, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/pass.png")));
        txtPass.setHint("Senha");
        painelDeRegistro.add(txtPass, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(new Color(78, 84, 200));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("CADASTRAR");
        painelDeRegistro.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    UsuarioDTO estudante = new UsuarioDTO();
                    
                    System.out.println(txtEmail.getText().equals("") );
                    System.out.println(txtEmail.getText().equals(null) );
                    System.out.println(txtEmail.getText().equals(" ") );
                    
                    if (!txtEmail.getText().equals("") && !txtPass.getText().equals("") && !txtUser.getText().equals("") && !txtNumeroMatricula.getText().equals("")){
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
                            ((JFrame) SwingUtilities.getWindowAncestor(painelDeRegistro)).dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Falha ao registrar. Dados inválidos!", "Falha!", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao registrar. Dados inválidos!", "Falha!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception exception) {
                    System.err.println("Error: " + exception);
                }
            }
        });
    }

    private void initLogin() {
        painelDeLogin.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Login");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(78, 84, 200));
        painelDeLogin.add(label);
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/mail.png")));
        txtEmail.setHint("Email");
        painelDeLogin.add(txtEmail, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/login_Registro/icon/pass.png")));
        txtPass.setHint("Senha");
        painelDeLogin.add(txtPass, "w 60%");
        JButton cmdForget = new JButton("Esqueceu sua senha?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelDeLogin.add(cmdForget);
        Button cmd = new Button();
        cmd.setBackground(new Color(78, 84, 200));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("LOGIN");
        painelDeLogin.add(cmd, "w 40%, h 40");
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
                        ((JFrame) SwingUtilities.getWindowAncestor(painelDeLogin)).dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao fazer Login. Dados inválidos!", "Falha!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception exception) {
                    System.err.println("Error: " + exception);
                }
            }
        });

    }

    public void showRegister(boolean show) {
        if (show) {
            painelDeRegistro.setVisible(true);
            painelDeLogin.setVisible(false);
        } else {
            painelDeRegistro.setVisible(false);
            painelDeLogin.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDeLogin = new javax.swing.JPanel();
        painelDeRegistro = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        painelDeLogin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(painelDeLogin);
        painelDeLogin.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(painelDeLogin, "card3");

        painelDeRegistro.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(painelDeRegistro);
        painelDeRegistro.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(painelDeRegistro, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelDeLogin;
    private javax.swing.JPanel painelDeRegistro;
    // End of variables declaration//GEN-END:variables
}
