package Views;
import Models.Funcionario;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCadast {
    private JButton cadastrarButton;
    private JTextField txtNomeFunc;
    private JTextField txtSalFunc;
    private JTextField txtFuncaoFunc;
    private JPanel panelCadast;
    private JTextField txtCpfFunc;

    public TelaCadast() {
        cadastrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Funcionario func = new Funcionario();
                func.setCpf(txtCpfFunc.getText());
                func.setName(txtNomeFunc.getText());
                func.setFuncao(txtFuncaoFunc.getText());
                func.setSalario(Double.parseDouble(txtSalFunc.getText()));
                JOptionPane.showMessageDialog(
                        null,
                        func.toString(),
                        "Cadastro Efetuado com Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });
    }

    public JPanel getpanelCadast() {
        return panelCadast;
    }

}
