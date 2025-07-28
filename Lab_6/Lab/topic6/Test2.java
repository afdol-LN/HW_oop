public class Test2 {
    public static void main(String[] args) {
        float t = 100f;
        System.out.println("Before Passing Arguments : t = " + t);
        F2C(t);
        System.out.println("After Passing Arguments : t = " + t);//ใช้ค่า t เดิมจากบรรทัด3 ไม่ได้อัปเดตตามฟังชั่นF2Cเนื่อจากไม่ได้returnกลับ
    }

    public static void F2C(float t) {
        t = t * 5 / 9;//t=55.555557
        System.out.println("In ChangThem : t = " + t);
    }
}

class tObject {
    public float t = 10f;
}
