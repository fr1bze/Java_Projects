// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    Counter counter = new Counter();
    counter.invokeCounter();
    counter.invokeCounter();
    counter.invokeCounter();
  }
}

class Counter {
   static int count;

  public static void invokeCounter() {
    count++;
    System.out.println("Текущее значение счётчика - " + count);
  }
}