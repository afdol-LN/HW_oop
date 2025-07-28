public class Test3 {
    public static void main(String[] args) {
        tObject o = new tObject();
        o.t = 100f;
        System.out.println("Before Passing Arguments : o.t = " + o.t);
        F2C(o);
        System.out.println("After Passing Arguments : o.t = " + o.t);//อัปเดตเป็นค่าล่าสุดหลังเข้าฟังชั่น F2C เพราะเป็นattributeของobject 
    }

    public static void F2C(tObject o) {
        o.t = o.t * 5 / 9; //o.t = 55.555557 
        System.out.println("In ChangThem : o.t = " + o.t);
    }
}

class tObject {
    public float t = 10f;
}