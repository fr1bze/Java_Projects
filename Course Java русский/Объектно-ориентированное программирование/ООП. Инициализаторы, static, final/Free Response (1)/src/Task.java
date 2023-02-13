class Main{
  public static void main(String[] args) {
    Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
    duck.display();
    Animal.getDescription();

    Bird b = new Bird();
   // b.setName("Bob");
    b.setArea("На юге");
    b.setWinterFly(false);
    b.display();
    //System.out.println(b.getArea());
    //System.out.println(b.isWinterFly());
    b.chirick_chirick();

    Fish f = new Fish();
    //f.setName("Сельдь");
    f.setSquama("Крупная");
    f.setUpStreamSwim(true);
    f.display();
    //System.out.println(f.getSquama());
    //System.out.println(f.isUpStreamSwim());
    f.bul_bul();

    Insect i = new Insect();
   // i.setName("Жук Жукыч");
    i.setWingCount(4);
    i.setLikeJesus(true);
    i.display();
    //System.out.println(i.getWingCount());
    //System.out.println(i.isLikeJesus());
    i.ggggg();
  }
}


class Animal {
  private String type;
  private String name;
  private int age;
  private double weight;
  private boolean isSwim;
  private boolean isFly;
  private boolean isWalk;

  {
    type = "Животное";
    name = "Животное № 1";
  }
  static int count;
  private static String description = "Общий класс животного";
  public void display()
  {
    System.out.printf("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: %.1f   Умеет летать: " + (isFly?"Да":"Нет") + ", Умеет ходить: "+ (isWalk?"Да":"Нет") + ", Умеет плавать: " + (isSwim?"Да":"Нет") + "." + "\n",this.weight);
  }
  public void rename(String new_name)
  {
    this.name = new_name;
  }
  public void holiday(int holidays)
  {
    this.weight += holidays * 0.1;
  }
  public void holiday()
  {
    this.weight +=  0.1;
  }
  public void holiday(double m)
  {
    this.weight += m;
  }
  public void holiday(double m, int n)
  {
    this.weight += m*n;
  }
  public Animal()
  {

  }
  public Animal(String type, String name)
  {
    this.type = type;
    this.name = name;
  }
  public Animal(String type, int age)
  {
    this.type = type;
    this.age = age;
    this.name = "No Name";
  }
  public Animal(String type,String name,int age,double weight,boolean isSwim,boolean isFly,boolean isWalk)
  {
    this.type = type;
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.isSwim = isSwim;
    this.isFly = isFly;
    this.isWalk = isWalk;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
  public void setSwimm(boolean isSwim) {
    this.isSwim = isSwim;
  }

  public void setWalk(boolean walk) {
    isWalk = walk;
  }

  public void setFly(boolean fly) {
    isFly = fly;
  }

  public double getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public boolean isSwimm() {
    return isSwim;
  }

  public boolean isWalk() {
    return isWalk;
  }

  public boolean isFly() {
    return isFly;
  }
  public static void getDescription() {
    System.out.println(description);
  }
}


class Bird extends Animal {
  private String Area;
  private boolean winterFly;
  {
    super.setType("Птица");
    super.setName("Птица № 1");
  }
  @Override
  public void display()
  {
    System.out.printf("I am Bird. Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: %.1f   Умеет летать: " + (isFly()?"Да":"Нет") + ", Умеет ходить: "+ (isWalk()?"Да":"Нет") + ", Умеет плавать: " + (isSwimm()?"Да":"Нет") + "." + "\n" ,getWeight());
    System.out.println("Среда обитания: " + Area + "Перелетная на зиму?: " + (isWinterFly()?"Да":"Нет"));
  }
  public void chirick_chirick()
  {
    System.out.println("Chirik-Chirik");
  }
  public Bird() {
    super();
    setType("Bird");
    setFly(true);
  }
  public void setArea(String Area)
  {
    this.Area = Area;
  }
  public String getArea()
  {
    return this.Area;
  }

  public void setWinterFly(boolean winterFly) {
    this.winterFly = winterFly;
  }

  public boolean isWinterFly()
  {
    if (this.winterFly)
      return true;
    else return false;
  }

}

class Fish extends Animal
{
  private String squama;
  private boolean upStreamSwim;
  {
    super.setType("Рыба");
    super.setName("Рыба № 1");
  }
  public Fish() {
    super();
    setType("Рыба");
    setSwimm(true);
  }
  @Override
  public void display()
  {
    System.out.printf("I am Fish. Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: %.1f   Умеет летать: " + (isFly()?"Да":"Нет") + ", Умеет ходить: "+ (isWalk()?"Да":"Нет") + ", Умеет плавать: " + (isSwimm()?"Да":"Нет") + "." + "\n" ,getWeight());
    System.out.print("Тип чешуи: " + squama + "Умеет плавать против течения?: " + (isUpStreamSwim()?"Да":"Нет"));
  }

  public void setSquama(String squama) {
    this.squama = squama;
  }

  public String getSquama() {
    return squama;
  }

  public void setUpStreamSwim(boolean upStreamSwim) {
    this.upStreamSwim = upStreamSwim;
  }

  public boolean isUpStreamSwim() {
    if(this.upStreamSwim)
      return true;
    else return false;
  }

  public void bul_bul()
  {
    System.out.println("Bul-Bul");
  }
}

class Insect extends Animal {

  private int WingCount;
  private boolean likeJesus;
  {
    super.setType("Насекомое");
    super.setName("Насекомое № 1");
  }
  @Override
  public void display()
  {
    System.out.printf("I am Insect. Тип: " + getType() + ", Имя: " + getName() + ", Возраст: " + getAge() + ", Вес: %.1f   Умеет летать: " + (isFly()?"Да":"Нет") + ", Умеет ходить: "+ (isWalk()?"Да":"Нет") + ", Умеет плавать: " + (isSwimm()?"Да":"Нет") + "." + "\n" ,getWeight());
    System.out.print("Количество крыльев: " + getWingCount() + "Умеет ходить по воде?: " + (likeJesus?"Да":"Нет"));
  }

  public void setWingCount(int wingCount) {
    this.WingCount = wingCount;
  }
  public void setLikeJesus(boolean likeJesus)
  {
    this.likeJesus = likeJesus;
  }

  public int getWingCount() {
    return this.WingCount;
  }

  public String isLikeJesus() {
    return likeJesus?"Да":"Нет";
  }
  public void ggggg ()
  {
    System.out.println("Ggggg");
  }
  public Insect() {
    super();
    setType("Насекомое");
    setWalk(true);
  }
}