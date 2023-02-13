import javax.swing.*;
import java.awt.*;

public class Calculator {
    static JPanel panel = new JPanel();
    static JFrame frame = new JFrame("Calculator");
    public static void size(JComponent c)
    {
        c.setPreferredSize(new Dimension(60,35));
    }

    public static String calculate(String str)
    {
        double result = 0;
        int index = 0;
        String n1 ="",n2="";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length;i++)
        {
            if (Character.isDigit(arr[i]))
                continue;
            else if (arr[i] == '+')
            {
                index = i;
                n1 = str.substring(0,index);
                n2 = str.substring(index+1,str.length());
                result = Integer.parseInt(n1) + Integer.parseInt(n2);
            }
            else if (arr[i] == '-' && i!=0 && i!= index +1)
            {
                index = i;
                n1 = str.substring(0,index);
                n2 = str.substring(index+1,str.length());
                result = Integer.parseInt(n1) - Integer.parseInt(n2);
            }
            else if (arr[i] == '*')
            {
                index = i;
                n1 = str.substring(0,index);
                n2 = str.substring(index+1,str.length());
                result = Integer.parseInt(n1) * Integer.parseInt(n2);
            }
            else if (arr[i] == '/') {
                index = i;
                n1 = str.substring(0, index);
                n2 = str.substring(index+1, str.length() );
                if (Integer.parseInt(n2) != 0) {
                    result = (double)Integer.parseInt(n1) / Integer.parseInt(n2);
                } else {
                    JOptionPane.showMessageDialog(frame, "Dividing on zero!");
                    result = 0;
                }

            }
        }
        System.out.println(result);
        return Double.toString(result);
    }
    public static void main(String[] args) {
        int width = 300, height = 270;
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JTextField textField = new JTextField("");
        textField.setFont(new Font("Calibri", Font.BOLD, 30));
        textField.setPreferredSize(new Dimension(250,50));
        JButton button0 = new JButton("0");
        size(button0);
        JButton button1 = new JButton("1");
        size(button1);
        JButton button2 = new JButton("2");
        size(button2);
        JButton button3 = new JButton("3");
        size(button3);
        JButton button4 = new JButton("4");
        size(button4);
        JButton button5 = new JButton("5");
        size(button5);
        JButton button6 = new JButton("6");
        size(button6);
        JButton button7 = new JButton("7");
        size(button7);
        JButton button8 = new JButton("8");
        size(button8);
        JButton button9 = new JButton("9");
        size(button9);
        JButton plus = new JButton("+");
        size(plus);
        JButton minus = new JButton("-");
        size(minus);
        JButton multiply = new JButton("*");
        size(multiply);
        JButton divide = new JButton("/");
        size(divide);
        JButton equals = new JButton("=");
        size(equals);
        JButton clear = new JButton("C");
        size(clear);
        panel.add(textField,Component.CENTER_ALIGNMENT);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(plus);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(minus);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(multiply);
        panel.add(button9);
        panel.add(divide);
        panel.add(equals);
        panel.add(clear);
        button0.addActionListener(e->textField.setText(textField.getText()+ button0.getText()));
        button1.addActionListener(e->textField.setText(textField.getText()+ button1.getText()));
        button2.addActionListener(e->textField.setText(textField.getText()+ button2.getText()));
        button3.addActionListener(e->textField.setText(textField.getText()+ button3.getText()));
        button4.addActionListener(e->textField.setText(textField.getText()+ button4.getText()));
        button5.addActionListener(e->textField.setText(textField.getText()+ button5.getText()));
        button6.addActionListener(e->textField.setText(textField.getText()+ button6.getText()));
        button7.addActionListener(e->textField.setText(textField.getText()+ button7.getText()));
        button8.addActionListener(e->textField.setText(textField.getText()+ button8.getText()));
        button9.addActionListener(e->textField.setText(textField.getText()+ button9.getText()));
        plus.addActionListener(e->textField.setText(textField.getText()+ plus.getText()));
        minus.addActionListener(e->textField.setText(textField.getText()+ minus.getText()));
        multiply.addActionListener(e->textField.setText(textField.getText()+ multiply.getText()));
        divide.addActionListener(e->textField.setText(textField.getText()+ divide.getText()));
        equals.addActionListener(e->textField.setText(calculate(textField.getText())));
        clear.addActionListener(e->textField.setText(null));

        panel.setBackground(Color.lightGray);
        frame.add(panel);
        frame.setVisible(true);
    }
}

