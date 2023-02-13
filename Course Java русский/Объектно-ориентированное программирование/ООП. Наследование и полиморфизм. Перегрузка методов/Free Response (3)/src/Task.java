class Main{
  public static void main(String[] args) {
    WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
    wm.display();

    Pen p = new Pen();
    p.setName("Паркер");
    p.display();
    p.setCountColor(2);
    p.setAuto(false);
    System.out.println(p.getCountColor());
    System.out.println(p.isAuto());
    p.writeMyName();

    Ruler r = new Ruler();
    r.setName("Линейка");
    r.display();
    r.setLength(25);
    r.setWood(true);
    System.out.println(r.getLength());
    System.out.println(r.isWood());
    r.measure();

    Divider d = new Divider();
    d.setName("Циркуль");
    d.display();
    d.setDividerType("С карандашом");
    d.setMetal(true);
    System.out.println(d.getDividerType());
    System.out.println(d.isMetal());
    d.drawCircle();
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

class Pen extends WritingMaterials {
  private int countColor = 1;
  private boolean auto;
  {setDraw(true);}
  public void setAuto(boolean auto) {
    this.auto = auto;
  }

  public void setCountColor(int countColor) {
    this.countColor = countColor;
  }

  public int getCountColor() {
    return countColor;
  }

  public boolean isAuto()
  {
   if (auto)
     return true;
   else return false;
  }
  public void  writeMyName()
  {
    System.out.print("Михаил");
  }
  public Pen()
  {
    super();


  }
}
class Ruler extends WritingMaterials {
  int length;
  boolean wood;
  {setDraw(false);}
  @Override
  public void setLength(double length) {
    super.setLength(length);
  }

  public void setWood(boolean wood) {
    this.wood = wood;
  }

  public boolean isWood() {
    if (wood)
      return true;
    else return false;
  }
  public void measure()
  {
    System.out.println("Сейчас померим длину");
  }
  public Ruler()
  {
    super();
  }
}
class Divider extends WritingMaterials {
  String dividerType;
  boolean metal;
  boolean draw = true;
  {setDraw(true);}
  public void setDividerType(String dividerType) {
    this.dividerType = dividerType;
  }

  public void setMetal(boolean metal) {
    this.metal = metal;
  }

  public String getDividerType() {
    return dividerType;
  }

  public boolean isMetal()
  {
    if(metal)
      return true;
    else return false;
  }
  public void drawCircle()
  {System.out.println("Нарисовал круг");}
  public Divider()
  {
    super();
  }
}