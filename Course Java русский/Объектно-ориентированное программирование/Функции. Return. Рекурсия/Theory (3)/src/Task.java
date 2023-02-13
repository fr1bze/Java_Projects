import java.util.HashMap;

class Main{

  static HashMap<Integer, Integer> cash;

  public static void main(String[] args) {
    cash = new HashMap<>();
    cash.put(1, 1);
    cash.put(2, 1);
    System.out.println(fib(41));
  }

  static int fib(int n){
    System.out. println("Запускается вычисление " + n + " числа Фиббоначи");
    if (!cash.containsKey(n))
      cash.put(n, fib(n-1) + fib(n-2));
    return cash.get(n);
  }

}