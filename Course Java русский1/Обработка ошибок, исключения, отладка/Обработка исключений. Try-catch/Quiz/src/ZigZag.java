public class ZigZag {
    public String convert(String s, int numRows) {
        if (s.length() == 1)
            return s;
        StringBuffer result = new StringBuffer();
        int k = 2 * numRows + 1;
        for (int i = 0; i <= numRows; i++) {
            result.append(s.charAt(i));
          //  result.append(s.charAt(2 * i + 1));
            while (2*i + 1 < k) {
                result.append(s.charAt(2*i+1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        System.out.println(zigZag.convert("PAYPALISHIRING",3));
        System.out.println(zigZag.convert("PAYPALISHIRING",4));
    }
}
