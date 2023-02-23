import java.io.IOException;
import java.io.*;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void castWindowsToUnix(InputStream inputStream, OutputStream outputStream) throws IOException {
        int prev = inputStream.read();
        int next = 0;
        while (prev != -1) {
            next = inputStream.read();
            if (!(prev == 13 && next == 10)) {
               outputStream.write(prev);
            }
            prev = next;
        }
       outputStream.flush();
    }
    public static void main(String[] args) throws IOException {
        byte[] data = {65,13,10,13,10,13};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(16);
        castWindowsToUnix(inputStream, outputStream); // здесь ваша функция
        byte [] out = outputStream.toByteArray();
        for (byte b : out){
            System.out.print(b + " ");
        }
    }
}