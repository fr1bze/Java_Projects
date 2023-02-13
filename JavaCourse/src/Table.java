// Настройка заголовка таблицы JTableHeader

import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class Table extends JFrame
{
    // Данные для таблицы
    private String[][] data = {{ "2016.04.05", "68.6753", "78.1662" },
            { "2016.04.06", "68.8901", "78.2798" },
            { "2016.04.07", "68.5215", "78.1662" }};
    // Названия столбцов
    private String[] columnNames = {"Дата", "Курс USD", "Курс EUR"};

    public Table() {
        super("Пример использования TableHeader");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание таблицы
        JTable table = new JTable(data, columnNames);
        // Настройка заголовков таблицы
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        // Подключение заголовка таблицыHeaderRenderer
        header.setDefaultRenderer(new HeaderRenderer());
        // Размещение таблицы в панели прокрутки
        getContentPane().add(new JScrollPane(table));
        // Вывод окна на экран
        setSize(420, 300);
        setVisible(true);
    }
    // Модифицируемый заголовок таблицы
    class HeaderRenderer extends DefaultTableCellRenderer
    {
        // Границы заголовков колонок
        Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED);

        // Метод возвращает визуальный компонент для прорисовки
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column)
        {
            // Надпись из базового класса
            JLabel label = (JLabel)super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            // Выравнивание строки заголовка
            label.setHorizontalAlignment(SwingConstants.CENTER);
            // Настройка цвет фона метки
            float[] hsb = Color.RGBtoHSB(224, 224, 224, null);
            label.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));

            label.setBorder(border);
            return label;
        }
    }
    public static void main(String[] args) {
        new Table();
    }
}