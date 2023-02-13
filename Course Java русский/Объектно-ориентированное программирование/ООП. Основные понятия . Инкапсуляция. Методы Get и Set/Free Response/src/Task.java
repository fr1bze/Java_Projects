class Main{
  public static void main(String[] args) {
    Animal tiger = new Animal();
    tiger.type = "тигр";
    tiger.name = "Артём";
    tiger.age = 15;
    tiger.weight = 300.6;
    tiger.isSwim = true;
    tiger.isWalk = true;
    tiger.isFly = false;
    tiger.display();
    tiger.rename("Антон");
    tiger.display();

    Animal sparrow = new Animal();
    sparrow.type = "воробей";
    sparrow.name = "Капитан Джек";
    sparrow.age = 3;
    sparrow.weight = 2;
    sparrow.isSwim = false;
    sparrow.isWalk = true;
    sparrow.isFly = true;
    sparrow.display();
    sparrow.holiday(2);
    sparrow.display();
  }
}
class Animal {
  String type;
  String name;
  int age;
  double weight;
  boolean isSwim;
  boolean isFly;
  boolean isWalk;
  public void display()
  {
    System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", Умеет летать: " + (isFly==true?"Да":"Нет") + ", Умеет ходить: "+ (isWalk==true?"Да":"Нет") + ", Умеет плавать: " + (isSwim==true?"Да":"Нет") + ".");
  }
  public void rename(String new_name)
  {
    this.name = new_name;
  }
  public void holiday(int holidays)
  {
    this.weight += holidays * 0.1;
  }
}