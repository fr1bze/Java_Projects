class WritingMaterialsProgram {
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setLength(25);
        r.setWood(true);
        r.display();
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.setDividerType("С карандашом");
        d.setMetal(true);
        d.display();
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}
 class WritingMaterials {
   String name;
   String color;
   double length;
   int price;
   boolean draw;

   public void display() {
     System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + (draw ? "Да" : "Нет") + ".");
   }

   public void priceDown(int x) {
     price -= x;
   }

   public void priceUp(int x) {
     price += x;
   }

   void draw(String color, int n) {
     System.out.println(
             draw ?
                     name + " провёл линий: " + n + ". Их цвет - " + color + "."
                     :
                     name + " не может ничего нарисовать."
     );
   }

   void draw() {
     draw(this.color, 1);
   }

   void draw(int n) {
     draw(this.color, n);
   }

   void draw(String color) {
     draw(color, 1);
   }

   public void replace_rod(String color) {
     this.color = color;
   }

   public WritingMaterials(String name, String color) {
     this.name = name;
     this.color = color;
   }

   public WritingMaterials() {
   }

   public WritingMaterials(String name, int price) {
     this.name = name;
     this.price = price;
     color = "No Color";
   }

   public WritingMaterials(int price, double length, boolean draw) {
     this.price = price;
     this.length = length;
     this.draw = draw;
     color = "No Color";
     name = "No Name";
   }

   public WritingMaterials(String name, String color, int price, double length, boolean draw) {
     this.name = name;
     this.color = color;
     this.price = price;
     this.length = length;
     this.draw = draw;
   }

   public void setName(String name) {
     this.name = name;
   }

   public void setColor(String color) {
     this.color = color;
   }

   public void setPrice(int price) {
     this.price = price;
   }

   public void setLength(double length) {
     this.length = length;
   }

   public void setDraw(boolean draw) {
     this.draw = draw;
   }

   public String getName() {
     return name;
   }

   public String getColor() {
     return color;
   }

   public int getPrice() {
     return price;
   }

   public double getLength() {
     return length;
   }

   public boolean isDraw() {
     return draw;
   }
 }
class Pen extends WritingMaterials {
    {
        setDraw(true);
    }

    int countColor;
    boolean auto;

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public int getCountColor() {
        return countColor;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public boolean isAuto() {
        return auto;
    }

    public void writeMyName() {
        System.out.println("Каца");
    }

    @Override
    public void display() {
        System.out.println("This is Pen");
        super.display();
        System.out.printf("Количество цветов: %s, Автоматическая: %s.\n",
                this.countColor, (this.auto ? "Да" : "Нет"));
    }
}
    class Ruler extends WritingMaterials{
    {
      setDraw(false);
    }
    boolean wood;
    public void setWood(boolean wood){
      this.wood = wood;
    }
    public boolean isWood(){
      return wood;
    }
    public void measure(){
      System.out.println("Сейчас померим длину");
    }
        @Override
        public void display() {
            System.out.println("This is Ruler");
            super.display();
            System.out.printf("Длина линейки: %s, Сделана из дерева: %s.\n",
                    this.getLength(), (this.wood ? "Да" : "Нет"));
        }
  }
 class Divider extends WritingMaterials{
    {
      setDraw(true);
    }
    String dividerType;
    boolean metal;
    public void setDividerType(String dividerType){
      this.dividerType = dividerType;
    }
    public void setMetal(boolean metal){
      this.metal = metal;
    }
    public String getDividerType(){
      return this.dividerType;
    }
    public boolean isMetal(){
      return metal;
    }
    public void draw_circle(){
      System.out.println("Нарисован круг");
    }
     @Override
     public void display() {
         System.out.println("This is Divider");
         super.display();
         System.out.printf("Тип циркуля: %s, Сделан из металла: %s.\n",
                 this.dividerType, (this.metal ? "Да" : "Нет"));
     }
  }
