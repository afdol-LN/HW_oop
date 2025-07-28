

public class NumberHolder {
    public int anInt;
    public float aFloat;
    public NumberHolder(int number,float decimal){
        this.anInt = number;
        this.aFloat = decimal;
    }
    public void showAnInt(){
        System.out.println("anInt is "+anInt);
    }
    public void showAfloat(){
        System.out.println("aFloat is "+aFloat);
    }
}

