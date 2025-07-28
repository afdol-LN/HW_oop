import java.lang.*;
class Lab4_6
{
  public static void main(String[] args) 
  {
    double x=5.5, y=2.0;
    int m;
    m=(int)x/(int)y;//ทำให้จากfloat มาเป็น int ทำให้ปัดเลขทศนิยมทิ้งทั้งหมด
    System.out.println("m =" + m);
  }
}
