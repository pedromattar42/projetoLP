package mainDialog.structural.titlebar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class TitleBar extends JComponent {

    private JFrame myFrame;
    private ComponentResizer myResizer;
    private JPanel myPanel;
    private boolean isRegistered = true;
    private int myX;
    private int myY;

    public TitleBar() {
        initialize();
    }

    public void initializeJFrame(JFrame frame) {
        this.myFrame = frame;
        myResizer = new ComponentResizer();
        myResizer.setSnapSize(new Dimension(10, 10));
        myResizer.setMinimumSize(new Dimension(800, 600));
        myResizer.registerComponent(myFrame);
        myFrame.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
                    myResizer.deregisterComponent(myFrame);
                    isRegistered = false;
                } else if (e.getNewState() == JFrame.NORMAL) {
                    if (!isRegistered) {
                        myResizer.registerComponent(myFrame);
                        isRegistered = true;
                    }
                }
            }
        });
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (myFrame.getExtendedState() == JFrame.NORMAL && SwingUtilities.isLeftMouseButton(e)) {
                    myX = e.getX() + 3;
                    myY = e.getY() + 3;
                }
            }
        });
        myPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (myFrame.getExtendedState() == JFrame.NORMAL) {
                        myFrame.setLocation(e.getXOnScreen() - myX, e.getYOnScreen() - myY);
                    }
                }
            }
        });
    }

    private void initialize() {
        setLayout(new MigLayout("inset 3, fill", "[fill]", "[fill]"));
        myPanel = new JPanel();
        myPanel.setOpaque(false);
        add(myPanel);
        myPanel.setLayout(new MigLayout("inset 3"));
        Item myClose = new Item();
        Item myMinimize = new Item();
        Item myResize = new Item();
        myClose.setBackground(new Color(235, 47, 47));
        myMinimize.setBackground(new Color(220, 213, 53));
        myResize.setBackground(new Color(44, 203, 87));
        myPanel.add(myClose);
        myPanel.add(myMinimize);
        myPanel.add(myResize);
        myClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        myMinimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.setState(JFrame.ICONIFIED);
            }
        });
        myResize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myFrame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    myFrame.setExtendedState(JFrame.NORMAL);
                } else {
                    myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });
    }

    private class Item extends JButton {

        public Item() {
            initialize();
        }

        private void initialize() {
            setContentAreaFilled(false);
            setBorder(null);
            setPreferredSize(new Dimension(11, 11));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int myWidth = getWidth();
            int myHeight = getHeight();
            g2.setColor(getBackground());
            g2.fillOval(0, 0, myWidth, myHeight);
            g2.dispose();
        }
    }

}
