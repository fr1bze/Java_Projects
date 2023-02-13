// This is a free response task. You can use this editor as a playground

public class Task {
  public static void main(String[] args) {
    // put your code here
  }
}

class Product implements ProductPrice {
  private double price;
  private int count;
  private String StorageTime;
  public Product()
  {}
  public Product(double price, int count, String StorageTime)
  {
    if (price > 0 && count > 0) {
      this.price = price;
      this.count = count;
    }
    else if(price < 0 && count > 0) {
      this.price = 0;
      this.count = count;
    }
    else {
      this.price = 0;
      this.count = 0;
    }
    this.StorageTime = StorageTime;

  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public double getPrice() {
    return price;
  }

  public void setStorageTime(String storageTime) {
    StorageTime = storageTime;
  }

  public String getStorageTime() {
    return StorageTime;
  }

  @Override
  public void priceUp(double price) {
    this.price += price;
  }

  @Override
  public void priceDown(double price) {
    this.price -= price;
  }
}

abstract class Personal{
  static private int employee_count;
  final static int limitWorkersCount = 20;
  private int salary;
  private String name;
  private String FamilyName;
  private String dateOfBirth;
  private boolean education;
  private boolean isMarried;
  private long insurance;
  private String sex;
  {
    employee_count = 0;
    name = "Безымянный работник";
    FamilyName = "Фамилия безымянного работника";
    dateOfBirth = "Не задано";
    education =false;
    isMarried =false;
    insurance = 0;
    sex = "Не задан";
  }
  public static void setEmployee_count(int employee_count) {
    Personal.employee_count = employee_count;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public static int getEmployee_count() {
    return employee_count;
  }

  public int getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setEducation(boolean education) {
    this.education = education;
  }

  public void setFamilyName(String familyName) {
    FamilyName = familyName;
  }

  public void setInsurance(long insurance) {
    this.insurance = insurance;
  }

  public void setMarried(boolean isMarried) {
    this.isMarried = isMarried;
  }

  public boolean isEducation() {
    return education;
  }

  public String getName() {
    return name;
  }

  public long getInsurance() {
    return insurance;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getFamilyName() {
    return FamilyName;
  }

  public boolean isMarried() {
    return isMarried;
  }
}


interface ProductPrice {
  public void priceUp(double price);
  public void priceDown(double price);
}

interface PersonalSalaryAndCount{
  public void hireEmployee();
  public void fireEmployee();
  public void UpSalary(double d);
  public void DownSalary(double d);
}

abstract class Provider{
  private int productsCount;
  private String DeliveryTime;
  private boolean isNeededProduct;
  public String isNeededProduct(boolean isNeededProduct)
  {
    if(isNeededProduct)
      return "Необходимо доставить продуктов";
    else return "Доставлять ничего не надо";
  }
}

class Administrator extends Personal implements PersonalSalaryAndCount {
  private int countAdmins;
  private double salary;
  {
    setName("Admin");
    setEducation(true);
    setInsurance(1111);
    setSalary(120000);
    countAdmins = 1;
  }
  public boolean isEnoughAdmins(){
    if(this.countAdmins == 1)
      return true;
    else return false;
  }
  @Override
  public void hireEmployee() {
    if (getEmployee_count()<limitWorkersCount) {
      System.out.println("Поздравляем, вы приняты");
      Personal.setEmployee_count(getEmployee_count()+1);
    }
    else System.out.println("Работников достаточно");
  }
  @Override
  public void fireEmployee() {
      System.out.println("К сожалению, мы вынуждены вас уволить");
      Personal.setEmployee_count(getEmployee_count()-1);
    }
    @Override
  public void UpSalary(double d)
    {
      this.salary+= d;
    }
  @Override
  public void DownSalary(double d)
  {
    this.salary-= d;
  }
}

class Manager extends Personal implements PersonalSalaryAndCount{
  private boolean isMain;
  private double salary;
  public void isMainManager() {
    if (this.isMain)
      System.out.println("Это главный менеджер по продажам");
    else System.out.println("Это обычный менеджер");
  }
  @Override
  public void hireEmployee() {
    if (getEmployee_count()<limitWorkersCount) {
      Personal.setEmployee_count(getEmployee_count()+1);
    }
    else System.out.println("Работников достаточно");
  }
  @Override
  public void fireEmployee() {
    Personal.setEmployee_count(getEmployee_count()-1);
  }
  @Override
  public void UpSalary(double d)
  {
    this.salary+= d;
  }
  @Override
  public void DownSalary(double d)
  {
    this.salary-= d;
  }
}

class Seller extends Personal implements PersonalSalaryAndCount{
  private double salary;
  private int productCountSaled;
  @Override
  public void hireEmployee() {
    if (getEmployee_count()<limitWorkersCount) {
      Personal.setEmployee_count(getEmployee_count()+1);
    }
    else System.out.println("Работников достаточно");
  }
  @Override
  public void fireEmployee() {
    Personal.setEmployee_count(getEmployee_count()-1);
  }
  @Override
  public void UpSalary(double d)
  {
    this.salary+= d;
  }
  @Override
  public void DownSalary(double d)
  {
    this.salary-= d;
  }

  public void setProductCountSaled(int productCountSaled) {
    if(productCountSaled > 0)
    this.productCountSaled = productCountSaled;
    else {
      System.out.println("Неверное количество продуктов");
      this.productCountSaled = 0;
    }
  }
}



