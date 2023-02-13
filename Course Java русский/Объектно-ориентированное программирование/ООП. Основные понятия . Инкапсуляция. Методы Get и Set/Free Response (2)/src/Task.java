class Main{
  public static void main(String[] args) {
    WritingMaterials pen = new WritingMaterials();
    pen.name = "ручка";
    pen.color = "Красный";
    pen.length = 15.6;
    pen.price = 145;
    pen.draw = true;
    pen.display();
    pen.draw();
    pen.priceDown(10);
    pen.display();
    pen.priceUp(23);
    pen.display();
    pen.replace_rod("Синий");
    pen.draw();

    WritingMaterials ruler = new WritingMaterials();
    ruler.name = "линейка";
    ruler.length = 30.0;
    ruler.price = 25;
    ruler.draw = false;
    ruler.display();
    ruler.draw();
    ruler.priceUp(13);
    ruler.display();
  }
}

class WritingMaterials {
  String name;
  String color;
  double length;
  int price;
  boolean draw;
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

}