// Пример использования диалоговых окон JOptionPane

import javax.swing.*;
import java.awt.event.*;

public class MessageDialogOk extends JFrame
{
    private        JPanel  contents       = null;
    private        JButton btnInput1      = null;

    public MessageDialogOk()
    {
        super("Пример использования JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        contents = new JPanel();
        // Иконка для отображения в окне сообщений
        btnInput1 = new JButton("Press it");

        addInputListeners();


        contents.add(btnInput1);
        setContentPane(contents);
        // Вывод окна на экран
        setSize(500, 140);
        setVisible(true);
    }
    private void addInputListeners()
    {
        btnInput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных : родитель, HTML сообщение
                String result = JOptionPane.showInputDialog(
                        MessageDialogOk.this,
                        "<html><h2>Добро пожаловать");
                JOptionPane.showMessageDialog(MessageDialogOk.this,"Вы ответили: "+result);
            }
        });
    }
    public static void main(String[] args)
    {
        JFrame MessageDialogOk =  new MessageDialogOk();
    }
}