public class Test1
{
    static int sq (int n)
    {
        return n*n ;
    }
    static double sq (float n)
    {
        return n*n;
    }
    static double sq (double n)
    {
        return n*n;
    }

    public static void main (String[] args)
    {
        int x = sq(10);//เรียกใข้ static int sq (int n) บรรทัดที่3
        double y = sq(11.0);//เรียกใข้ static double sq (double n) บรรทัดที่11
        System.out.println(x);
        System.out.println(y);
    }
}

