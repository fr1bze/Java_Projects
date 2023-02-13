public class Task {
  public static void main(String[] args) {
    Library lib = new Library();
    lib.setName("New library");
    lib.setBuildYear(1935);
    lib.setBookCountPerFloor(100);
    lib.setFloorCount(4);
    lib.reBuilt();
    System.out.println(lib.bookCount());
    lib.isRare();
    System.out.println(lib.getBookCountPerFloor());
    System.out.println(lib.getFloorCount());
    System.out.println(lib.getName());


  }
}

abstract class Building {
  private String name;
  private String adress;
  private int buildYear;
  private String archName;
  private boolean isCulture;
  {
    name = "Неизевстное здание";
    adress = "Адрес не задан";
    archName = "Неизвестен";
    isCulture = false;
  }
  public abstract void reBuilt();
  public void setName(String name) {
    this.name = name;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public void setArchName(String archName) {
    this.archName = archName;
  }

  public void setBuildYear(int buildYear) {
    this.buildYear = buildYear;
  }

  public void setCulture(boolean culture) {
    isCulture = culture;
  }

  public String getName() {
    return name;
  }

  public int getBuildYear() {
    return buildYear;
  }

  public String getAdress() {
    return adress;
  }

  public String getArchName() {
    return archName;
  }

  public boolean isCulture() {
    return isCulture;
  }
}

class Library extends Building {
  private int floorCount;
  private int bookCountPerFloor;
  {
    floorCount = 1;
    setName("Библиотека");
  }
  //Set and Get

  public void setBookCountPerFloor(int bookCountPerFloor) {
    if (bookCountPerFloor > 0)
    this.bookCountPerFloor = bookCountPerFloor;
    else System.out.println("Book count < 0 - false");
  }

  public void setFloorCount(int floorCount) {
    if (floorCount > 0)
    this.floorCount = floorCount;
    else System.out.println("Floor count < 0 - false");
  }

  public int getBookCountPerFloor() {
    return bookCountPerFloor;
  }

  public int getFloorCount() {
    return floorCount;
  }
  public void reBuilt()
  {
    if (getBuildYear() <= 1950)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }
  public int bookCount() {
    return floorCount * bookCountPerFloor;
  }
  public void isRare()
  {
    if (this.floorCount > 1 && this.floorCount < 5)
      System.out.println("Интересная библиотека");
    else if (this.floorCount >= 5)
      System.out.println("Очень старая библиотека, здесь точно стоит задержаться!");
    else System.out.println("Это очень старое здание!");
  }
  @Override
  public String toString() {
    return "Это переопределенный метод toString в классе " + this.getClass().getSimpleName();
  }
}

class House extends Building {
  {
    setName("Небольшой жилой дом");
  }
  private boolean isOurSelfWater;
  private int familiesCount;
  public void reBuilt()
  {
    if (getBuildYear() <= 1980)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }
  public void moving(int n)
  {
    if (n < familiesCount) {
      if (n % 10  == 1)
      System.out.println(n + " семья решила переехать");
      if (n % 10  > 1 && n % 10 < 5)
        System.out.println(n + " семьи решили переехать");
      if (n % 10  >= 5)
        System.out.println(n + " семей решили переехать");
    }
    else System.out.println("Тут столько и не жило");
  }
  public void waterDisable(boolean isDisabled){
    if(isDisabled)
      System.out.println("Сегодня без воды");
    else System.out.println("Можно помыться");
  }

  //set && get
  public void setFamiliesCount(int familiesCount) {
    if (familiesCount > 0 && familiesCount <= 2) {
      System.out.println("It's a private house");
      this.familiesCount = familiesCount;
    }
    else if (familiesCount > 2)
    {
      System.out.println("It's not a private house");
      this.familiesCount = familiesCount;
    }
    else System.out.println("Count of families can't be less than 0");
  }

  public void setOurSelfWater(boolean ourSelfWater) {
    isOurSelfWater = ourSelfWater;
  }

  public int getFamiliesCount() {
    return familiesCount;
  }

  public boolean isOurSelfWater() {
    return isOurSelfWater;
  }
}


class PoliceDepartment extends Building {
  private int employersCount;
  private int severityLevel;
  {
    setName("Здание полиции");
  }
  public void reBuilt()
  {
    if (getBuildYear() <= 1960)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }
  public int hirePoliceman(){
    return ++employersCount;
  }
  public int firePoliceman() {
    System.out.println("You are so bad");
    return --employersCount;
  }

  public void isTooSeverity()
  {
    if(getSeverityLevel() > 3)
      System.out.println("Строгие ребята");
    else System.out.println("Нестрогие работяги");
  }

  //get && set
  public void setEmployersCount(int employersCount) {
    this.employersCount = employersCount;
  }
  public void setSeverityLevel(int severityLevel) {
    this.severityLevel = severityLevel;
  }
  public int getSeverityLevel() {
    return severityLevel;
  }

  public int getEmployersCount() {
    return employersCount;
  }

}

class University extends Building {
  private int studentsCount;
  private double avgExamScore;
  {setName("Университет");
    studentsCount = 0;
    avgExamScore = 0;
  }

  public void setStudentsCount(int studentsCount) {
    if(studentsCount > 0) this.studentsCount = studentsCount;
    else {
      System.out.println("Incorrect number");
    }
  }

  public void setAvgExamScore(double avgExamScore) {
    if (avgExamScore > 0 && avgExamScore <= 100)
    this.avgExamScore = avgExamScore;
    else System.out.println("Incorrect number");
  }

  public double getAvgExamScore() {
    return avgExamScore;
  }

  public int getStudentsCount() {
    return studentsCount;
  }

  public void reBuilt()
  {
    if (getBuildYear() <= 1940)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }
  public void isGood() {
    if (this.avgExamScore > 90)
      System.out.println("This is high-rate university");
    else System.out.println("It's medium university");
  }
  public void isHuge()
  {
    if (this.studentsCount > 1000)
      System.out.println("It's huge");
    else System.out.println("It's not big university");
  }
}
class ShoppingCenter extends Building {
  int floorCount;
  int shopsCount;
  int visitorsPerWeek;
  {
    setName("Торговый центр");
  }
  public void reBuilt()
  {
    if (getBuildYear() <= 2000)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }

  public void setFloorCount(int floorCount) {
    if (floorCount > 0)
    this.floorCount = floorCount;
    else System.out.println("incorrect number");
  }

  public void setShopsCount(int shopsCount) {
    if (shopsCount > 0)
    this.shopsCount = shopsCount;
    else System.out.println("Incorrect count");
  }

  public void setVisitorsPerWeek(int visitorsPerWeek) {
    if (visitorsPerWeek > 0)
    this.visitorsPerWeek = visitorsPerWeek;
    else System.out.println("Incorrect count");
  }

  public int getFloorCount() {
    return floorCount;
  }

  public int getShopsCount() {
    return shopsCount;
  }

  public int getVisitorsPerWeek() {
    return visitorsPerWeek;
  }
  public void shopsPerFloor()
  {
    if (shopsCount / floorCount > 10)
      System.out.println("It's huge shopping center");
    else System.out.println("It's normal shopping center");
  }

  public double checkAmount(double avgCheckSum)
  {
    System.out.print("Average buys per week amount is: ");
    return visitorsPerWeek * avgCheckSum;
  }
}
class HighRiseBuilding extends Building {
  int floors;
  int people;
  {
    setName("Высокое здание");
  }
  public void reBuilt()
  {
    if (getBuildYear() <= 1990)
      System.out.println("It's need to rebuild");
    else System.out.println("It's in a good condition");
  }

  public void setFloors(int floors) {
    if(floors > 0)
    this.floors = floors;
    else System.out.println("Incorrect number");
  }

  public void setPeople(int people) {
    if (people > 0)
    this.people = people;
    else System.out.println("Incorrect number");
  }

  public int getFloors() {
    return floors;
  }

  public int getPeople() {
    return people;
  }
  public void isHuge()
  {
    if (this.floors > 10)
      System.out.println("This building is too high");
    else System.out.println("This building isn't high");
  }
  public void familyCount()
  {
    if (this.people > 50)
      System.out.println("Здесь живет много семей");
  }
}

