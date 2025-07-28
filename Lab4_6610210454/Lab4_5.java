import java.lang.*;
class Lab4_5 
{
  public static void main(String[] args) 
  {
    boolean x = true;
    boolean y = false;
    boolean m = x | y;
    System.out.println("m=" + m);
    boolean n =  x & y;
    System.out.println("n=" + n);
    boolean o = x^ y;
    System.out.println("o=" + o);
    boolean p = !x;
    System.out.println("p=" + p);
    boolean q = !(m | n) & (o | p);
    System.out.println("q=" + q);
   }
}
