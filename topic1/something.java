class something {
    public static void main(String args[]) {

        int mul;
        int sum = 0;
        int index = args.length;
        int number[] = new int[index];
        int max = number[0];//->int max = interger.parseInt(args[0])
        int min = number[0];//->int min = interger.parseInt(args[0])
        for (int i = 0; i < index; i++) {
            
            int Anumber = Integer.parseInt(args[i]);
            mul = Anumber * 10;
            System.out.println("multiply by 10 : " + mul);

            if (Anumber > max) {
                max = Anumber;
                
            }
            
            if (Anumber < min) {
                min = Anumber;
                
            }

            sum = sum + Anumber;
            


        }

        int A, B;
        A = (max + min) / 2;
        B = sum / index;

        System.out.println("maximum number : " + max);
        System.out.println("minimum number : " + min);
        System.out.println("sum of all numbers : " + sum);
        System.out.println("[A] (Max + Min)/2 : " + A);
        System.out.println("[B] : Average : " + B);
        
        if(A < B) {
            System.out.println("A less than B");
        } else if(A > B) {
            System.out.println("A more then B");
        }else {
            System.out.println("A equal B");
        }

    }
}