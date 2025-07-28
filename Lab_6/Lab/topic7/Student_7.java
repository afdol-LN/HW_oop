public class Student_7 extends People {
    double grade;

    public Student_7() {//มีconstructor ทำการเซ็ตค่า grade = 2.56 และ age = 17

        grade = 2.56;
        age = 17;
    }

    public void printData() {
        System.out.println("Name : "+super.getName());
        System.out.println("Age : "+super.getAge());
        
        // System.out.println ("Age : " + age);
        System.out.println ("Grade : " + grade);
    }

    public static void main (String [] args) {
        Student_7 s1 = new Student_7();
        s1.setName("Kasikrit");
        // s1.name = "Kasikrit";

        // System.out.println ("Name : " + s1.getName());
        // System.out.print("Age : "+ s1.getAge());
        s1.printData();
    }
}
