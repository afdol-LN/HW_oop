
public class Student
{
    String id;
    String name;
    String addr;
    double gpa;

    Student(String id,String name){
        System.out.println("Student method 1");
    }

    Student(String id,String name,String addr){
        System.out.println("Student method 2");
    }

    Student(String id,String name,String addr,double gpa){
        System.out.println("Student method 3");
    }

    public static void main(String[] args) {
        Student x = new Student("001", "somsri");//call overload constructer at Line 9 to set id,name
        Student y = new Student("001", "somsri"," Hatyai");//call overloading constructer at Line 13 to set id,name,addr
        Student z = new Student("001", "somsri", "Hatyai", 3.15);//call overloading constructer at Line 17 to set id,name,addr,gpa
    }
}

