import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream,charset);
        StringBuilder stringBuilder = new StringBuilder();
        int b;
        while ( (b = reader.read()) != -1)
        {
           // System.out.println(b + " " + reader.read());
            stringBuilder.append((char) b);
        }

        return stringBuilder.toString();
    }

}