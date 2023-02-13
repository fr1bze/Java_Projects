import javax.swing.*;
import java.awt.*;

public class Quiz {
    private static int answer_number = 1;
    private static final int questions = 10;
    private static  int correct_answers = 0;
    public static int index = 1;
    public int width = 800, height = 600;
    public static JFrame frame = new JFrame("Викторина");
    public static JPanel panel = new JPanel();
    public static JLabel text = new JLabel();
    static JLabel label = new JLabel("Вопрос: " + answer_number + "/" + questions);
    static JButton button1 = new JButton();
    static JButton button2 = new JButton();
    static JButton button3 = new JButton();
    static JButton button4 = new JButton();
    private static final String[] questions_arr = {"Кто автор Бременских музыкантов?","В каком городе состоялись игры Олимпиады-2000?",
    "Какой математический знак указывает на порядок действий?","Кто из этих богов и богинь не является сыном или дочерью Зевса?",
    "В честь чего был назван компьютер \"Макинтош\"?","Как по-другому называют инжир?","В каком городе родилась Фаина Раневская?",
    "Столицей какой африканской страны еще не так давно был Лагос?","Где убили Юлия Цезаря?",
    "Какая из этих мер длины наименьшая?"};
    private static final String[][] answers = {{"Братья Гримм","Ганс Христиан Андерсен","Шарль Перро","Сельма Лагерлеф"},
            {"Афины", "Лондон","Сидней","Атланта"},
            {"Равно" ,"Модуль", "Скобки", "Интеграл"},
            {"Гермес", "Аполлон", "Деметра","Афина"},
            {"Сорт яблок","Населенный пункт","Зонт","Вид плаща"},
            {"Кукиш","Дуля","Фига","Шиш"},
            {"Одесса","Таганрог","Москва","Ялта"},
            {"Уганда","Кения","Сенегал","Нигерия"},
            {"На площади","Дома","В сенате","На корабле"},
            {"Аршин","Локоть","Верста","Сажень"}};
    private static final int[] correct_index = {0,2,2,2,0,2,1,3,2,1};

    static void check (JButton o)
    {
        o.addActionListener(e-> {if (e.getSource() == o)

            for (int i = 0; i < answers.length;i ++)
                    if (o.getText().equals(answers[i][correct_index[i]]))
                    {
                        correct_answers++;
                    }
        });
    }

     static void buttonPressed(JButton o)
    {

        o.addActionListener(e-> {if (answer_number != 10){
            text.setText(questions_arr[index]);
            button1.setText(answers[index][0]);
            button2.setText(answers[index][1]);
            button3.setText(answers[index][2]);
            button4.setText(answers[index][3]);
            index++;
            answer_number++;
            label.setText("Вопрос: " + answer_number + "/" + questions);
        }
        else
        JOptionPane.showMessageDialog(frame,"Вы правильно ответили на " + correct_answers + " из 10");
        });
    }

    public static void main(String[] args)
    {
    Quiz quiz = new Quiz();
    int[] answers_index = new int[10];

        frame.setSize(quiz.width,quiz.height);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
        button1.setText(quiz.answers[0][0]);
        button1.setFont(new Font("Calibri", Font.CENTER_BASELINE, 15));
        button2.setText(quiz.answers[0][1]);
        button2.setFont(new Font("Calibri", Font.BOLD, 15));
        button3.setText(quiz.answers[0][2]);
        button3.setFont(new Font("Calibri", Font.BOLD, 15));
        button4.setText(quiz.answers[0][3]);
        button4.setFont(new Font("Calibri", Font.BOLD, 15));
        text.setText(quiz.questions_arr[0]);
        text.setFont(new Font("Calibri", Font.BOLD, 20));
    label.setPreferredSize(new Dimension(100,20));
    panel.add(label);
        panel.add(text,Component.CENTER_ALIGNMENT);
    text.setPreferredSize(new Dimension(quiz.width - 50, 80));
    button1.setPreferredSize(new Dimension(350,100));
    button2.setPreferredSize(new Dimension(350,100));
    button3.setPreferredSize(new Dimension(350,100));
    button4.setPreferredSize(new Dimension(350,100));
        buttonPressed(button1);
        buttonPressed(button2);
        buttonPressed(button3);
        buttonPressed(button4);
        check(button1);
        check(button2);
        check(button3);
        check(button4);

    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    frame.add(panel);
        frame.setVisible(true);
    //добавляем 4 кнопки, по центру ставим текстовую панель, счетчик в углу
        // если количество ответов равно 10, то выводим showMessageDialog с количкством верных ответов
        // при нажатии на кнопку просто меняем текст у каждой из них согласно индексам
    }
}
