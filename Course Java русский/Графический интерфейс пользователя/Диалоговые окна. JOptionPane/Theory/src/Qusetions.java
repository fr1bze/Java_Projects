// Пример использования диалоговых окон JOptionPane

import javax.swing.*;
import java.awt.event.*;

public class Qusetions extends JFrame
{
    private JPanel  contents = null;
    private JButton btnConfirm1 = null;
    private final  String   TITLE_confirm = "Окно подтверждения";
   static String[] YES_answers = {"Вы согласны?", "Меня зовут Миша", "Молодец!", "Дай Бог здоровья)"};
    static String[] NO_answers = {"Вы точно не согласны?", "Меня зовут Сергей", "Не Молодец!", "Не Дай Бог здоровья)"};


    public Qusetions()
    {
        super("Окно подтверждения");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");



        contents = new JPanel();
        // Иконка для отображения в окне сообщений
        btnConfirm1 = new JButton("ConfirmDialog 4+2");


        addConfirmListeners();


        contents.add(btnConfirm1);
        setContentPane(contents);
        // Вывод окна на экран
        setSize(500, 140);
        setVisible(true);
    }
    private void addConfirmListeners() {
        btnConfirm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Окно подтверждения c 4-мя параметрами
                int result = JOptionPane.showConfirmDialog(
                        Qusetions.this,
                        "Вам это нужно?",
                        TITLE_confirm,
                        JOptionPane.YES_NO_CANCEL_OPTION);
                // Окна подтверждения c 2-мя параметрами
                if (result == JOptionPane.YES_OPTION)
                    JOptionPane.showConfirmDialog(Qusetions.this,
                            YES_answers[(int) (Math.random()*4)]);
                else if (result == JOptionPane.NO_OPTION)
                    JOptionPane.showConfirmDialog(Qusetions.this,
                            NO_answers[(int) (Math.random()*4)]);
            }
        });
    }
    public static void main(String[] args)
    {
        JFrame frame =  new Qusetions();
    }
}