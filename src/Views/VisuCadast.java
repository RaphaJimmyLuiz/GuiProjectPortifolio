package Views;

import Models.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.lang.invoke.StringConcatFactory;

public class VisuCadast {


    private JLabel NomeFunc;
    private JLabel SalarioFunc;
    private JLabel FuncaoFunc;
    private JLabel cpfFunc;
    private JPanel panelVisuCadast;



    public JLabel getNomeFunc() {
        return NomeFunc;
    }

    public void setNomeFunc(JLabel nomeFunc) {
        NomeFunc = nomeFunc;
    }

    public JLabel getSalarioFunc() {
        return SalarioFunc;
    }

    public void setSalarioFunc(JLabel salarioFunc) {
        SalarioFunc = salarioFunc;
    }

    public JLabel getFuncaoFunc() {
        return FuncaoFunc;
    }

    public void setFuncaoFunc(JLabel funcaoFunc) {
        FuncaoFunc = funcaoFunc;
    }

    public JLabel getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(JLabel cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public JPanel getPanelVisuCadast() {
        return panelVisuCadast;
    }

    public void setPanelVisuCadast(JPanel panelVisuCadast) {
        this.panelVisuCadast = panelVisuCadast;
    }

    public void VisuCadastR(){

        Funcionario  Func = new Funcionario();
        String Salario = String.valueOf(Func.getSalario());
        NomeFunc.setText(Func.getName());
        SalarioFunc.setText(Salario);
        FuncaoFunc.setText(Func.getFuncao());
        cpfFunc.setText(Func.getCpf());

    }

}

