import java.lang.*;
class Lab4_4 
{
   public static void main(String[] args) 
   {
      int x,y, z=5; 
      System.out.println("z=" + z);
      z *=2;
      System.out.println("z=" + z);
      x = y = z+5 ;
System.out.println("x="+ x +",y=" + y + ",z=" + z);
      y += ++y + x++ +(z--) + 5;
      System.out.println("x="+ x +",y=" + y + ",z=" + z);             
    }
}
