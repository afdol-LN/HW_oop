
public class Main {
    public static void main(String[] args) {
        int len = args.length;
        int number[] = new int[len];
        for (int i=0;i<len;i++) {
            number[i] = Integer.parseInt(args[i]);
        }
        Calculate setNumber = new Calculate(number);
        setNumber.showResult();
    }
}
