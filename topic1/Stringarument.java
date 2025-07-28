class Stringargument{
    public static void main(String args[]){
        //number * 10
        for (int i=0;i<args.length;i++) {
            int number = Integer.parseInt(args[i]);
            System.out.println((number*10));
        }
        //maximum number
        int max = Integer.parseInt(args[0]);
        for (int i=0;i<args.length;i++){
            int number = Integer.parseInt(args[i]);
            if(number>max){
                max=number;
            }
        }
        System.out.println("max:"+max);
        //minimum number
        int min = Integer.parseInt(args[0]);
        for (int i=0;i<args.length;i++){
            int number = Integer.parseInt(args[i]);
            if(number<min){
                min=number;
            }
        }
        System.out.println("min:"+min);
        //summary
        int sum = 0;
        for (int i=0;i<args.length;i++){
            int number = Integer.parseInt(args[i]);
            sum = sum+number;
        }
        System.out.println("summary:"+sum);
        //[A]
        int A=(min+max)/2;
        System.out.println("[A]<Max + Min>/2 = "+(A));
        //[B]
        int B=(sum)/args.length;
        System.out.println("[B]Average = "+(B));
        //compare A and B
        if(A>B){
            System.out.println("B less than A");
        }
        else if(B>A){
            System.out.println("A less than B");
        }
        else{
             System.out.println("A and B is equal");
        }

    };
}