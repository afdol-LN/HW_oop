// calling class
public class DemoStudent{  
  public static void main(String[] args) {
    System.out.println("Hello"); 
    
    People kasikrit = new People();
    People hunsen = new People("Male", "Hunsen");
    hunsen.setWeight(80);
    hunsen.setHeight(170);
    hunsen.calBMI();
    hunsen.printInfo();

    People tony = new People(1953, "Male", "Tony");
    tony.setWeight(70);
    tony.setHeight(165);
    //tony.calBMI();
    // double tmpBMI = hunsen.calBMI(tony);
    // tony.setBMI(tmpBMI);
    tony.printInfo();

    System.out.println(hunsen.numberOfPeople);
    System.out.println(kasikrit.numberOfPeople);
    System.out.println(People.numberOfPeople);
    // hunsen = null;
    // System.out.println(People.numberOfPeople);

    // People people[] = new People[100];
    // for(int i=0;i<100; i++){
    //   people[i] = new People();
    // }
    System.out.println("numberOfPeople: " + hunsen.numberOfPeople);

    Student florent = new Student();
    florent.yearBorn = 2004;
    florent.printInfo();
    System.out.println("numberOfPeople: " + People.numberOfPeople);
    System.out.println("numberOfStudent: " + Student.numberOfStudent);
    
    Student baiyok = new Student("Female", "Baiyok");
    baiyok.printInfo();

    
    // People baipoo = new Student();
    //Studen baipoo = new People();

    // Homework: Can calculate ag e, which determined from current year, use API
    System.out.println("calculate Age with real time");
    Student afdol = new Student(2005,"male","dol");
    afdol.calAge();
    afdol.printInfo(1);
    System.out.println("Bye.");
  }
}
