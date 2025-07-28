
public class Person {
    private String name ; 

    public Person(){
        this("no name yet");
    }
    public Person(String name){
        this.name = name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }

    public void showInfo(){
        System.out.println("name is" + this.name);
    }

}

