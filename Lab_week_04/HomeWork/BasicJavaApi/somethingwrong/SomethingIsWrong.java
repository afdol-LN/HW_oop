
public class SomethingIsWrong {

    public static void main(String[] args) {
        
        Rectangle myRect;// <- ไม่มีการสร้างobject/ขั้นตอนการสร้างobject ยังไม่สมบูรณ์
        
        myRect.width = 40;// <-  ยังไม่มีobjectที่ชื่อ myReact
        myRect.height = 50;// <-  ยังไม่มีobjectที่ชื่อ myReact

        System.out.println("myRect's area is " + myRect.area());
    }
}