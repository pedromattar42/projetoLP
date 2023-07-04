package login_Registro.main;

import login_Registro.component.PainelInformativoLoginRegistro;
import login_Registro.component.LoginRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private final DecimalFormat df = new DecimalFormat("##0.###", DecimalFormatSymbols.getInstance(Locale.US));
    private MigLayout layout;
    private PainelInformativoLoginRegistro capa;
    private LoginRegistro loginRegistro;
    private boolean isLogin = true;
    private final double tamanhoAdicional = 30;
    private final double tamanhoCapa = 40;
    private final double tamanhoLogin = 60;

    public Main() {
        initComponents();
        inicializar();
    }

    private void inicializar() {
        layout = new MigLayout("fill, insets 0");
        capa = new PainelInformativoLoginRegistro();
        loginRegistro = new LoginRegistro();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double fracaoCapa;
                double fracaoLogin;
                double tamanho = tamanhoCapa;
                if (fraction <= 0.5f) {
                    tamanho += fraction * tamanhoAdicional;
                } else {
                    tamanho += tamanhoAdicional - fraction * tamanhoAdicional;
                }
                if (isLogin) {
                    fracaoCapa = 1f - fraction;
                    fracaoLogin = fraction;
                    if (fraction >= 0.5f) {
                        capa.registrarDireita(fracaoCapa * 100);
                    } else {
                        capa.loginDireita(fracaoLogin * 100);
                    }
                } else {
                    fracaoCapa = fraction;
                    fracaoLogin = 1f - fraction;
                    if (fraction <= 0.5f) {
                        capa.registrarEsquerda(fraction * 100);
                    } else {
                        capa.loginEsquerda((1f - fraction) * 100);
                    }
                }
                if (fraction >= 0.5f) {
                    loginRegistro.showRegister(isLogin);
                }
                fracaoCapa = Double.valueOf(df.format(fracaoCapa));
                fracaoLogin = Double.valueOf(df.format(fracaoLogin));
                layout.setComponentConstraints(capa, "width " + tamanho + "%, pos " + fracaoCapa + "al 0 n 100%");
                layout.setComponentConstraints(loginRegistro, "width " + tamanhoLogin + "%, pos " + fracaoLogin + "al 0 n 100%");
                painelFundo.revalidate();
            }

            @Override
            public void end() {
                isLogin = !isLogin;
            }
        };
        Animator animator = new Animator(800, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);  //  para animação suave
        painelFundo.setLayout(layout);
        painelFundo.add(capa, "width " + tamanhoCapa + "%, pos " + (isLogin ? "1al" : "0al") + " 0 n 100%");
        painelFundo.add(loginRegistro, "width " + tamanhoLogin + "%, pos " + (isLogin ? "0al" : "1al") + " 0 n 100%"); //  1al como 100%
        loginRegistro.showRegister(!isLogin);
        capa.login(isLogin);
        capa.adicionarEvento(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane painelFundo;
    // End of variables declaration//GEN-END:variables
}
