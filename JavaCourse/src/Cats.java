import java.io.IOException;
import java.sql.*;

class connect {
    public static Connection conn;
    public static Connection conn1;
    public static Statement statmt;
    public static Statement statmt1;
    public static ResultSet resSet;
    static String[] names = {"Гарфилд", "Том", "Гудвин", "Рокки", "Ленивец", "Пушок", "Спорти", "Бегемот", "Пират", "Гудини", "Зорро", "Саймон", "Альбус", "Базилио", "Леопольд", "Нарцисс", "Атос", "Каспер", "Валлито", "Оксфорд", "Бисквит", "Соня", "Клеопатра", "Цунами", "Забияка", "Матильда", "Кнопка", "Масяня", "Царапка", "Серсея", "Ворсинка", "Амели", "Наоми", "Маркиза", "Изольда", "Вальс", "Несквик", "Златан", "Баскет", "Изюм", "Цукат", "Мокко", "Месси", "Кокос", "Адидас", "Бейлиз", "Тайгер", "Зефир", "Мохи", "Валенсия", "Баунти", "Свити", "Текила", "Ириска", "Карамель", "Виски", "Кукуруза", "Гренка", "Фасолька", "Льдинка", "Китана", "Офелия", "Дайкири", "Брусника", "Аватар", "Космос", "Призрак", "Изумруд", "Плинтус",
            "Яндекс", "Крисмас", "Метеор", "Оптимус", "Смайлик", "Цельсий", "Краска", "Дейзи", "Пенка", "Веста", "Астра", "Эйприл", "Среда", "Бусинка", "Гайка", "Елка", "Золушка", "Мята", "Радость", "Сиам", "Оскар", "Феликс", "Гарри", "Байрон", "Чарли", "Симба", "Тао", "Абу", "Ватсон", "Енисей", "Измир", "Кайзер", "Васаби", "Байкал", "Багира", "Айрис", "Диана", "Мими", "Сакура", "Индия", "Тиффани", "Скарлетт", "Пикси", "Лиззи", "Алиса", "Лило", "Ямайка", "Пэрис", "Мальта", "Аляска"
    };
    static String[] types = new String[]{"Абиссинская кошка", "Австралийский мист", "Американская жесткошерстная", "Американская короткошерстная", "Американский бобтейл", "Американский кёрл", "Балинезийская кошка", "Бенгальская кошка", "Бирманская кошка", "Бомбейская кошка", "Британская длинношерстная", "Британская короткошерстная", "Бурманская кошка", "Бурмилла кошка", "Гавана", "Гималайская кошка",
            "Девон-рекс", "Донской сфинкс", "Европейская короткошерстная", "Египетская мау", "Канадский сфинкс", "Кимрик", "Корат", "Корниш-рекс", "Курильский бобтейл", "Лаперм", "Манчкин", "Мейн-ку́н", "Меконгский бобтейл", "Мэнкс кошка", "Наполеон", "Немецкий рекс", "Нибелунг", "Норвежская лесная кошка", "Ориентальная кошка", "Оцикет", "Персидская кошка", "Петерболд", "Пиксибоб", "Рагамаффин", "Русская голубая кошка", "Рэгдолл", "Саванна", "Селкирк-рекс", "Сиамская кошка", "Сибирская кошка", "Сингапурская кошка", "Скоттиш-фолд", "Сноу-шу", "Сомалийская кошка", "Тайская кошка", "Тойгер", "Тонкинская кошка", "Турецкая ангорская кошка", "Турецкий ван", "Украинский левкой", "Чаузи", "Шартрез", "Экзотическая короткошерстная", "Японский бобтейл"};

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        conn1 = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:/Users/mikhail/IdeaProjects/JavaCourse/db/cats.db");
        conn1 = DriverManager.getConnection("jdbc:sqlite:/Users/mikhail/IdeaProjects/JavaCourse/db/types.db");

        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
    public static void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt1 = conn1.createStatement();
        statmt.execute("CREATE TABLE if not exists 'cats' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' VARCHAR(20) NOT NULL,type_id INTEGER NOT NULL REFERENCES types (id),age INTEGER NOT NULL, weight DOUBLE);");

        System.out.println("Таблица создана или уже существует.");
    }

    public static ResultSet getType(String where) throws SQLException {
        statmt1 = conn1.createStatement();
        ResultSet rs = statmt1.executeQuery("SELECT id, type FROM types WHERE " + where);
        return rs;
    }

    public static void insertType(String type) throws ClassNotFoundException, SQLException, IOException {
        statmt1 = conn1.createStatement();
        statmt1.executeUpdate("INSERT INTO types (type) VALUES ('" + type + "')");
    }

    public static void insertCat(String name, String type, int age, Double weight) throws SQLException, IOException, ClassNotFoundException {
        statmt = conn.createStatement();
        ResultSet rs = getType("type='" + type + "'");
        int id;
        if (rs.isBeforeFirst())
            id = rs.getInt("id");
        else {
            insertType(type);
            id = getType("type='" + type + "'").getInt("id");
        }
        String query = "INSERT INTO 'cats' ('name','type_id','age','weight') VALUES ('" + name + "'," + id + "," + age + "," + weight + ")";
        statmt.executeUpdate(query);
    }

    public static void addMoreCats(int n) throws SQLException, IOException, ClassNotFoundException
    {
        for (int i = 0; i < n; i++)
            insertCat(names[(int) (Math.random()*names.length)],types[(int) (Math.random()* types.length)],(int)(Math.random()*22),Math.random() * 20);
    }

//    public static void CloseDB() throws ClassNotFoundException, SQLException {
//        conn.close();
//        statmt.close();
//        //conn1.close();
//        //statmt1.close();
//        //resSet.close();
//
//        System.out.println("Соединения закрыты");
//    }
    public static void deleteCat(int id) throws SQLException {
        String query = "DELETE FROM cats WHERE id = " + id;
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }
    public static void deleteCat(String where) throws SQLException {
        String query = "DELETE FROM cats WHERE " + where;
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }
    public static void updateCat(int id, String set, String where) throws SQLException {
        String query = "UPDATE cats SET name = '" + set + "' WHERE id = " + id;
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }
    public static void getCat(int id) throws SQLException {
    String query = "SELECT * FROM cats where id = " + id;
        Statement statement = conn.createStatement();
        statement.executeQuery(query);

    }
    public static void getCatWhere(String where) throws SQLException {
        String query = "SELECT * FROM cats WHERE " + where;
        Statement statement = conn.createStatement();
        statement.executeQuery(query);
    }
    public static void getAllCats() throws SQLException {
        ResultSet set = statmt.executeQuery("SELECT * FROM cats");
        while (set.next())
        {
            int id = set.getInt("id");
            String  age = set.getString("age");
            String  type_id = set.getString("type_id");
            String  weight = set.getString("weight");
            System.out.println( "ID = " + id );
            System.out.println( "age = " + age );
            System.out.println( "type_id = " + type_id );
            System.out.println( "weight = " + weight );
            System.out.println();
        }
    }
}



    public class Cats {
        public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
            connect.Conn();
            connect.deleteCat(1);
            connect.deleteCat("age = 11");
            connect.updateCat(4, "weight = 4", "name = 'Мурзик'");

        }
    }