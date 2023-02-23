import java.util.HashMap;

public class ExcelSheet {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        for (int i = 0; i < 26; i++) {
            map.put(i + 1, (char) (i + 65));
        }
        int i = 26;
        while (columnNumber > 0) {
            if (columnNumber % 26 == 0) {
                result.append(map.get(26));
                columnNumber = columnNumber / 26 - 1;
            }
            else {
                result.append(map.get((columnNumber) % 26));
                columnNumber = columnNumber / i;
            }
            }
        return result.reverse().toString();
}

    public static void main(String[] args) {
        System.out.println(ExcelSheet.convertToTitle(26));
        System.out.println(ExcelSheet.convertToTitle(1));
        System.out.println(ExcelSheet.convertToTitle(28));
        System.out.println(ExcelSheet.convertToTitle(701));
         System.out.println(ExcelSheet.convertToTitle(1024));
        System.out.println(ExcelSheet.convertToTitle(35));
        System.out.println(ExcelSheet.convertToTitle(27));
        System.out.println(ExcelSheet.convertToTitle(52));
        System.out.println(ExcelSheet.convertToTitle(78));
    }
}

