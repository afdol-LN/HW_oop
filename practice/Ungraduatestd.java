
public class Ungraduatestd extends student{
    private final int passScore = 70;
    public String status;
    public Ungraduatestd(){
        super("unknow",0);
        this.status = "unknow";
    }
    public Ungraduatestd(String name,int numberstd){
        super(name,numberstd);
    }
    public Ungraduatestd(String name,int numberstd,int numberOFtest,int score){
        super(name,numberstd,numberOFtest,score);
    }
    public String checkStatus(){
        if(getSum()>passScore){
            this.status = "pass";
        }
        else{
            this.status= "not pass noob";
        }   
        return status;
    }
}
