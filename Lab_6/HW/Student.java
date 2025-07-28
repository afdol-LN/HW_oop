
public class Student extends People{
    //attributes
    private String studentID;
    public String faculty;
    public String major;

    private double GPAX;

    // class variable
    static int numberOfStudent;
    //constructors
    public Student(){
        System.out.println("Student()"); 
        numberOfStudent = numberOfStudent + 1;
    }

    public Student(String gender, String nickname){
      System.out.println("Student(String gender, String nickname)");  
      this.gender = gender;
      this.nickname = nickname;
      numberOfStudent = numberOfStudent + 1;
    }
    public Student(int year,String sex,String nickname){
        super(year,sex,nickname);
    }

    //setter/methods
    public void setStudentID(String studentID){
        this.studentID = studentID;
    };
    public String getStudentID(){
        return studentID;
    }

    //methods
}