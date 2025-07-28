// import java.io.IOException;//read3
// import java.util.Scanner;//rea3
import java.io.*;//read1-2
import java.util.Date;//for hellodate
class Slide03 {

    public static void main(String[] args)throws IOException {
        hellodate();
    }

    static void hellodate(){
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
    // static void read1() throws IOException{
    // char c;
    //     System.out.println("Enter one character: ");
    //     c = (char) System.in.read();
    //     System.out.println("Your data is " + c );
    // } 

    // static void read3(){
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.print("Enter input: ");
    //         String data = scanner.nextLine();
    //         System.out.print("your input is "+data);
    //     }


    // static void read2() throws IOException{
    //     BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
    //     String Input ="";
    //     System.out.println("Enter any input");
    //     Input = stdin.readLine();
    //     System.out.println("Your input is "  + Input);
    // }
  

}

