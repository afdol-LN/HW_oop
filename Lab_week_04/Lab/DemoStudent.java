// calling class
public class DemoStudent{  
  public static void main(String[] args) {
    System.out.println("Hello"); 
    // People[] p = new People[1000];
    // // p[0] = new People();
    // // p[999] = new People();
    // for (int i = 0; i < p.length; i++) {
    //       p[i] = new People(); // Create a new People object for each index
    // }
    // People p1 = new People(); //use the default constructor
    
    // People p2 = new People(); //use overloading constructor
    // p1.getNickname();
    // p1.getGender();
    // p1.getIdentifcationID();
    // p1.getFullname();
    // p1.setNickname("Sonic");
    // p1.printInfo();

   // public vs. private attribute demo
    // p2.setNickname("Baiyok");
    // //p2.identifcationID = "888";
    // p2.setIdentificationID("888");
    // p2.gender = "Female";
    // p2.printInfo();

    //  public String gender; // "male", "female" 
    // public String nickname;
    // private String identifcationID;
    // public String fullname;
    // People p3 = new People("Female", "Golf", "777", "Khun Golf Winner");
    // p3.printInfo();

  //   People p4 = new People("Male", "Hunsen");
  //   p4.setWeight(80);
  //   p4.setHeight(170);
  //   p4.calBMI();
  //   p4.printBMI();
  //   p4.printInfo();

  //   People p5 = new People(1953, "Male", "Tony");
  //   p5.setWeight(70);
  //   p5.setHeight(165);
  //   double p5BMI = p4.calBMI(p5); 
  //   System.out.println(p5BMI);
  //  // p5.setBMI(p5BMI);
  //   p5.printBMI();
    
  //   p4.printBMI();

    People afdol = new People(60,175);
    People charif = new People(53,180);
    // People aonglee = new People("aonglee", 98, 180);

    // aonglee.calBMI();
    // aonglee.printBMI();

    afdol.setNickname("afdol");
    afdol.calBMI();
    afdol.printBMI();
    //charif
    charif.setNickname("charif");
    double CharifBMI = afdol.calBMI(charif);
    charif.setBMI(CharifBMI);
    charif.printBMI();

    //p1.calBMI();
    //System.out.println("p1 BMI " + p1.getBMI());

    System.out.println("Bye.");
  }
}