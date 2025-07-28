

public class Calculate {
    private int number[] ;
    private int maxNumber;
    private int minNumber;
    private int sumNumber;
    private int A,B;
    public Calculate(int number[]){
        this.number = number;
    }
    
    public void showResult(){
        //show numbers * 10
        for(int i =0 ; i<number.length ; i++){
            System.out.println(this.number[i]*10);
        }
        //Minimun number
        int tempnum = number[0];
        for (int i=0;i<number.length;i++) {
            if(number[i]>tempnum){
                tempnum = number[i];
            }
        }
        System.out.println("Max number is "+tempnum);
        maxNumber = tempnum;
        //Maximun number
        tempnum = number[0];
        for (int i=0;i<number.length;i++) {
            if(number[i]<tempnum){
                tempnum = number[i];
            }
        }
        System.out.println("Min number is "+tempnum);
        minNumber = tempnum;
        //summary of numbers
        for (int i=0;i<number.length;i++) {
            sumNumber += number[i];
        }
        System.out.println("Summary is " + sumNumber);
        //find A value
        A= (minNumber+maxNumber)/2;
        System.out.println("[A] (Max+Min)/2 = " + A);
        //find B value
        B= sumNumber/(number.length);
        System.out.println("[B] Average = " + B);
        //compare A and B
        if (A>B) {
            System.out.println("A more than B");
        }
        else if (A==B) {
            System.out.println("A equal to B");
        }
        else{
            System.out.println("A less than B");
        }
    }
}
