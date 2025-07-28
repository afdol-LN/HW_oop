 import java.util.Scanner;
 class Homework1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x number:");
        int x = scanner.nextInt();
        System.out.print("Enter Y number:");
        int y = scanner.nextInt();
        // firstFunc(x);
        // secondFunc(x,y);
        thirdFunc(x,y);
    };
    static void firstFunc(int number){
        if(number == 0){
            System.out.println("bye");
        }
        else{
            number = number - 1;
            System.out.println("x = "+ number);
        }
        
    }
    static void secondFunc(int numberX,int numberY){
        if(numberX == 0){
            numberY++;
            numberX=numberY;
        }
        System.out.println("x : "+numberX);
        System.out.println("Y : "+numberY);
    }
    static void thirdFunc(int numberX,int numberY){
        if((numberX != 0)&&(numberY>10)){
            numberX = numberX + numberY;
        }
        else{
            numberY = numberX * numberY;
        }
        System.out.println("x : "+numberX);
        System.out.println("Y : "+numberY);
    }
 }