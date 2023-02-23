import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new CharArrayReader(new char[] {'1','2','3'});
        doubleStream(reader);
    }
    private static void doubleStream (Reader reader) throws IOException {
        Scanner sc = new Scanner(reader);
        double d = 0;
        while (sc.hasNext())
        {
            try {
                d += Double.parseDouble(sc.next());
            }
            catch (NumberFormatException e)
            {

            }
        }
        System.out.printf("%.6f",d);
        sc.close();
    }
}