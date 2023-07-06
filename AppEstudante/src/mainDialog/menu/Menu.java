package mainDialog.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import mainDialog.structural.scroll.ScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Menu extends JPanel {

    private int myIndex = -1;
    private final List<EventMenuSelected> myEventsList = new ArrayList<>();
    private MigLayout myMenuLayout;
    private JPanel myMenuPanel;

    public Menu() {
        initialize();
    }

    private void initialize() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        JScrollPane myScrollPane = createScrollPane();
        myMenuPanel = createMenuPanel();
        myScrollPane.setViewportView(myMenuPanel);
        myScrollPane.getViewport().setOpaque(false);
        myScrollPane.setViewportBorder(null);
        add(myScrollPane);
        addMenuTitle("USUÁRIO");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Dashboard"));
        addMenuTitle("ESTUDOS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ADD, "Adicionar disciplina"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.STORAGE, "Banco de questões"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERM_CONTACT_CALENDAR, "Calendário"));
        addMenuTitle("PROGRESSOS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SYNC, "Progresso por disciplina"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.EVENT, "Rendimento semanal"));
        addMenuTitle("OUTROS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.BOOK, "ENEM", "Vídeos", "Materiais"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TIMER, "Pomodoro"));
    }

    private JScrollPane createScrollPane() {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBar(new ScrollBar());
        return scrollPane;
    }

    private JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setOpaque(false);
        myMenuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        menuPanel.setLayout(myMenuLayout);

        return menuPanel;
    }

    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++myIndex, myMenuLayout);
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelectedItems();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (EventMenuSelected event : myEventsList) {
            event.menuSelected(index, indexSubMenu);
        }
    }

// Public Methods
    public void addMenuItem(ModelMenuItem menu) {
        myMenuPanel.add(createMenuItem(menu), "h 35!");
    }

    public void addMenuTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        label.setForeground(new Color(170, 170, 170));
        myMenuPanel.add(label);
    }

    public void addSpace(int size) {
        myMenuPanel.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component component : myMenuPanel.getComponents()) {
            if (component instanceof MenuItem) {
                MenuItem item = (MenuItem) component;
                if (item.getIndex()== index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelectedItems() {
        for (Component component : myMenuPanel.getComponents()) {
            if (component instanceof MenuItem) {
                MenuItem item = (MenuItem) component;
                item.clearSelected();
            }
        }
    }

    public void addMenuEvent(EventMenuSelected event) {
        myEventsList.add(event);
    }
}
