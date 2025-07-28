
public class student extends Person {
    private int studentNumber;
    private final int num_of_test = 3;
    private int[] scoreTest = new int[num_of_test];
    private int summary;
    private int countTest=0;
    public student(){
        this("unknow",0);
        for (int i = 0; i < num_of_test; i++) {
            this.scoreTest[i] = -1;
        }
    }
    public student(String newName,int studentNumber){
        super(newName);
        this.studentNumber = studentNumber;

    }
    public student(String newName,int studentNumber,int numberOFtest,int score){
        super(newName);
        this.studentNumber = studentNumber;
        this.scoreTest[numberOFtest] = score;
        countTest++;
    }
    public void setNameAndNumber(String newName,int studentNumber){
        setName(newName);
        this.studentNumber = studentNumber;

    }
    public void setNumber(int newNumber){
        this.studentNumber = newNumber; 
    }
    public int getStudentNumber(){
        return this.studentNumber;
    }
    @Override
    public void showInfo(){
        System.out.println("name is "+getName());
        System.out.println("number of student is "+ getStudentNumber());
    }

    public void setScore(int numberOfTest,int score){
        this.scoreTest[numberOfTest] = score;
        countTest++;
        System.out.println(countTest);
    }
    public int getscore(int numberOfTest){
        return scoreTest[numberOfTest];
    }
    public void calSummary(){
        if(countTest == 3){
            for (int i=0;i<num_of_test;i++) {
            summary += scoreTest[i];
            }
        }
        else{
            System.out.println("not correct value of test");
        }
        
    }
    public int getSum(){
        return summary;
    }
}
