// You can experiment here, it won’t be checked

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Task {
  public static void main(String[] args) {
    out('ы',System.out);
  }

  private static void out (char c,OutputStream outputStream) {
    try {
      Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
      writer.write(c);
      writer.flush();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
