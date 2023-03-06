import Views.MainForm;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

      /*  try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
       */
        JFrame MainForm = MainForm = new JFrame("Menu Principal");
        MainForm.setContentPane(new MainForm().getMainPanel());
        MainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainForm.setExtendedState(Frame.MAXIMIZED_BOTH);
        MainForm.pack();
        MainForm.setVisible(true);

    }
}