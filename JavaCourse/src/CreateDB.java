import javax.xml.transform.Result;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class connection {
    public static Connection conn;
    public static Statement statmt;
    static String[] types = new String[]{"Абиссинская кошка", "Австралийский мист", "Американская жесткошерстная", "Американская короткошерстная", "Американский бобтейл", "Американский кёрл", "Балинезийская кошка", "Бенгальская кошка", "Бирманская кошка", "Бомбейская кошка", "Британская длинношерстная", "Британская короткошерстная", "Бурманская кошка", "Бурмилла кошка", "Гавана", "Гималайская кошка",
            "Девон-рекс", "Донской сфинкс", "Европейская короткошерстная", "Египетская мау", "Канадский сфинкс", "Кимрик", "Корат", "Корниш-рекс", "Курильский бобтейл", "Лаперм", "Манчкин", "Мейн-ку́н", "Меконгский бобтейл", "Мэнкс кошка", "Наполеон", "Немецкий рекс", "Нибелунг", "Норвежская лесная кошка", "Ориентальная кошка", "Оцикет", "Персидская кошка", "Петерболд", "Пиксибоб", "Рагамаффин", "Русская голубая кошка", "Рэгдолл", "Саванна", "Селкирк-рекс", "Сиамская кошка", "Сибирская кошка", "Сингапурская кошка", "Скоттиш-фолд", "Сноу-шу", "Сомалийская кошка", "Тайская кошка", "Тойгер", "Тонкинская кошка", "Турецкая ангорская кошка", "Турецкий ван", "Украинский левкой", "Чаузи", "Шартрез", "Экзотическая короткошерстная", "Японский бобтейл"
    };


    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:/Users/mikhail/IdeaProjects/JavaCourse/types.db");

        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
     static void CreateD() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'types' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'type' VARCHAR);");

        System.out.println("Таблица создана или уже существует.");
    }
    public static void WriteDB() throws ClassNotFoundException, SQLException, IOException {
        statmt = conn.createStatement();
        for (int i = 0; i < types.length;i++)
        statmt.execute("INSERT INTO types (type) VALUES ('" + types[i] + "')");
    }
    public static void delete_type(int id) throws SQLException {
        String query = "DELETE FROM types WHERE id = " + id;

        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }
    public static void update_type(int id, String new_type) throws SQLException
    {
//        PreparedStatement statmt = conn.prepareStatement("UPDATE types SET type = (?) WHERE id = (?)");
//        statmt.setString(1, new_type);
//        statmt.setInt(2, id);
//        statmt.executeUpdate();
        String query = "UPDATE types SET type = '" + new_type +"' WHERE id = " + id;
        statmt = conn.createStatement();
        statmt.executeUpdate(query);
    }
    public static String get_type(int id) throws SQLException
    {
        statmt = conn.createStatement();
        String query = "SELECT type FROM types WHERE id = " + id;
        ResultSet res = statmt.executeQuery(query);
        String result = res.getString(1);
        return result;
    }
    public static void get_type_where(String where) throws SQLException {
        statmt = conn.createStatement();
        String query = "SELECT * FROM types WHERE " + where;
        ResultSet res = statmt.executeQuery(query);
        while (res.next())
            System.out.println(res.getString(1) +" " + res.getString(2));
    }
    public static void get_all_types() throws SQLException {
        statmt = conn.createStatement();
        String query = "SELECT DISTINCT type from types";
        ResultSet resultSet = statmt.executeQuery(query);
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }

    }
}

public class CreateDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        connection.Conn();
       // connection.update_type(2, "Моя кошка");
        //System.out.println(connection.get_type(3));
        connection.get_type_where("id<15");
        //connection.get_all_types();

    }
}
