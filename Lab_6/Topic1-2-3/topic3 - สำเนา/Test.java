

public class Test
{
    public static void main(String[] args)
    {
        MyClass test1 = new MyClass();
        test1.A = 1;
        test1.B = 3;
        System.out.println("test1.A = " + test1.A + " test1.B = " + test1.B);
        MyClass test2 = new MyClass();
        test2.A = 2;
        test2.B = 4;//การเซ้ตค่าตรงนี้ให้B = 4
        System.out.println("test2.A = " + test2.A + " test2.B = " + test2.B);
        test1.B = 10;//เซ็ตให้B = 10,ฺBคือตัวแปรแบบclass variableทำให้แชร์กันระหว่างtest1.B and test.2.B
        System.out.println("test1.A = " + test1.A + " test1.B = " + test1.B);
        System.out.println("test2.A = " + test2.A + " test2.B = " + test2.B);//มีค่า10จากบรรทัด15
    }
}

