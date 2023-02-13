import java.math.BigDecimal;

class Main{
  public static void main(String[] args) {
    Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
    duck.display();

    duck.holiday();
    duck.display();

    duck.holiday(5);
    duck.display();

    duck.holiday(0.4);
    duck.display();

    duck.holiday(0.3, 2);
    duck.display();
  }
}

class Animal {
  private final String type;
  private String name;
  private int age;
  private double weight;
  private boolean isSwim;
  private boolean isFly;
  private boolean isWalk;
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
}
