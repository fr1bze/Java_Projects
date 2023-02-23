// You can experiment here, it won’t be checked
public class Task {
  public static void main(String[] args) {

    String original = new String("Ы");
    byte[] defaultBytes = original.getBytes();
    for (byte b : defaultBytes) {
      System.out.println(b & 0xFF);
    }
  }
}
