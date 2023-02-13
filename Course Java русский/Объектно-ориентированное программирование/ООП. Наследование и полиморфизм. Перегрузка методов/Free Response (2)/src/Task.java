class Main{
  public static void main(String[] args) {
    WritingMaterials pen = new WritingMaterials();
    pen.setName("ручка");
    pen.setColor("Красный");
    pen.setLength(11.6);
    pen.setPrice(167);
    pen.setDraw(true);
    pen.draw();
    pen.draw("Синий");
    pen.draw("Зелёный", 15);
    pen.draw(4);

    WritingMaterials ruler = new WritingMaterials("линека", 34);
    ruler.setDraw(false);
    pen.draw();
    pen.draw("Синий");
    pen.draw("Зелёный", 15);
    pen.draw(4);

  }

}

class WritingMaterials {
  private String name;
  private String color;
  private double length;
  private int price;
  private boolean draw;
  public void display()
  {
    System.out.println("Название: " + name + ", Цвет: " + color +", Длина: "+ length +", Цена: "+ price+ ", Умеет рисовать: "+ (draw?"Да":"Нет"));
  }
  public void priceDown(int price){
    this.price -= price;
  }
  public void priceUp(int price){
    this.price += price;
  }
  public void replace_rod(String color)
  {
    this.color = color;
  }
  public void draw()
  {
    if (draw)
      System.out.println(name + " провел линию. Её цвет - " + color);
    else System.out.println(name + " не может ничего нарисовать");
  }
  public void draw(int n){
    if (draw)
      System.out.println(name + " провел линий:" + n + ". Её цвет - " + color);
    else System.out.println(name + " не может ничего нарисовать");
  }
  public void draw(String color){
    if (draw)
      System.out.println(name + " провел линий: 1 . Её цвет - " + color);
    else System.out.println(name + " не может ничего нарисовать");
  }
  public void draw(String color, int n){
    if (draw)
      System.out.println(name + " провел линий:" + n + ". Её цвет - " + color);
    else System.out.println(name + " не может ничего нарисовать");
  }
  WritingMaterials()
  {

  }
  WritingMaterials(String name,String color)
  {
    this.name = name;
    this.color = color;
  }
  WritingMaterials(String name,int price)
  {
    this.name = name;
    this.color = "No color";
    this.price = price;
  }
  WritingMaterials(int price, double length, boolean draw)
  {
    this.price = price;
    this.length = length;
    this.color = "No color";
    this.draw = draw;
    this.name = "No Name";
  }
  WritingMaterials(String name, String color, int price,double length, boolean draw)
  {
    this.name = name;
    this.color = color;
    this.length = length;
    this.price = price;
    this.draw = draw;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setDraw(boolean draw) {
    this.draw = draw;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getLength() {
    return length;
  }

  public int getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }

  public boolean isDraw() {
    return draw;
  }
}