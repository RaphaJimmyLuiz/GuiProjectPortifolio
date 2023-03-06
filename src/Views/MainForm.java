package Views;


import Models.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm {

    private JPanel MainPanel;
    private JButton btnTelaCadast;
    private JButton btnVisuCadast;
    private JButton btnSalReajuste;

    public MainForm() {
        btnTelaCadast.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame TelaCadast = TelaCadast = new JFrame("Cadastro");
                TelaCadast.setContentPane(new TelaCadast().getpanelCadast());
                TelaCadast.setExtendedState(Frame.MAXIMIZED_BOTH);
                TelaCadast.pack();
                TelaCadast.setVisible(true);


            }
        });
        btnVisuCadast.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                
                JFrame VisuCadast = VisuCadast = new JFrame("Visualizar Cadastros");
                VisuCadast.setContentPane(new VisuCadast().getPanelVisuCadast());
                VisuCadast.setExtendedState(Frame.MAXIMIZED_BOTH);
                VisuCadast.pack();
                VisuCadast.setVisible(true);





            }
        });
        btnSalReajuste.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFrame TelaSalReajus = TelaSalReajus = new JFrame("Reajuste de Salario de Funcionario");
                TelaSalReajus.setContentPane(new TelaSalReajus().getPanelSalReajus());
                TelaSalReajus.setSize(600,300);
                TelaSalReajus.setResizable(false);
                TelaSalReajus.setExtendedState(Frame.MAXIMIZED_BOTH);
                TelaSalReajus.pack();
                TelaSalReajus.setVisible(true);


            }
        });
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

}
