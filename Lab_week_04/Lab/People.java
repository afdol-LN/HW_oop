//a logical class
public class People{
	//attributes: General and which for BMI calculation
    //accessibility/visibility, data type or class, attribute nams
    public String gender; // "male", "female" 
    public String nickname;
    private String identifcationID;
    public String fullname;
    
    private int yearBorn;
    private int age;

    private double weight;
    private double height;   
    private double BMI;
    //default constructor
    public People(){
      System.out.println("People()");  
    }
    // Overloading constructors
    public People(String gender, String nickname, String identifcationID, String fullname){
      System.out.println("Overloading constructor of People()");  
      this.gender = gender;
      this.nickname = nickname;
      this.identifcationID = identifcationID;
      this.fullname = fullname;
    }
    public People(String gender, String nickname){
      System.out.println("Overloading constructor of People()");  
      this.gender = gender;
      this.nickname = nickname;
    }
    public People(int yearBorn, String gender, String nickname){
      System.out.println("Overloading constructor of People()");  
      this.yearBorn = yearBorn;
      this.gender = gender;
      this.nickname = nickname;
    }
    //create new overloading contructer
    public People(double weight,double height){
        this.weight  = weight;
        this.height = height;
    }

    public People(String nickname, double weight,double height){
        this.nickname = nickname;
        this.weight  = weight;
        this.height = height;
    }

    //methods
    public void greeting(){
        System.out.println("Sawasdee");  
    }
    // setter/getter methods
	public void setGender(String gender){ //gender: informal parameter
        this.gender = gender;
    }
    public String getGender(){
        //return gender;
        return this.gender;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return this.nickname;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    // Overloading methods
    public void calBMI(){
        this.BMI = this.weight / ( (this.height/100.0) * (this.height/100.0) );
    }
    public double calBMI(People people){
        double tempBMI = people.getWeight() / ( (people.getHeight()/100.0) * (people.getHeight()/100.0) );
        return tempBMI;
    }
    
    public void setBMI(double BMI){
        this.BMI = BMI;
    }
    public double getBMI(){
        return this.BMI;
    }
    // helper methods
    // public String gender; // "male", "female" 
    // public String nickname;
    public void setIdentificationID(String identifcationID){
        this.identifcationID = identifcationID;
    }
    public void calAge(){
        //this.age = currentYear - this.yearBorn;
        this.age = 2025 - this.yearBorn;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println();
        System.out.println("Year born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Nickname: " + nickname);
        System.out.println("Identifcation ID: " + identifcationID);
        System.out.println("Fullname: " + fullname);
    }
    public void printInfo(int parameterNumbers){ //p5.printInfo(3);
        System.out.println();
        System.out.println("Year born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void printBMI(){
        System.out.println();
        System.out.println("Nickname: " + nickname);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + BMI);
    }
    
}