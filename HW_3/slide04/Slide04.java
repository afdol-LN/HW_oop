// import com.bruceeckel.simpletest.*;
public class Slide04 {
    public static void main(String[] args) {
        EqualsMethod2();
    }

    static void EqualsMethod2(){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }

    static void EqualsMethod(){
        Integer n1 = Integer.valueOf(47);
        Integer n2 = Integer.valueOf(47);
        System.out.println(n1.equals(n2));
    }

    static void Equivalence(){
        Integer n1 = Integer.valueOf(47);
        Integer n2 = Integer.valueOf(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }

    static void autoInc(){
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Pre-increment
        System.out.println("i++ : " + i++); // Post-increment
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Pre-decrement
        System.out.println("i-- : " + i--); // Post-decrement
        System.out.println("i : " + i);
    }

    static void continuesTest(){
        String searchMe = "peter piper picked a peck ofpickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        for (int i = 0; i < max; i++) {
        //interested only in p's
            if (searchMe.charAt(i) != 'p') {
                continue;
            }
        //process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in thestring.");
    }

    static void breakTest(){
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchfor = 12;
        int i;
        boolean foundIt = false;
        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }

    static void EnhancedForDemo(){
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for (int item : numbers) {
        System.out.println("Count is: " + item);
    }
    }

    static void forCounter(){
        int counter;
        for(counter=1; counter<=10; counter++)
        {
            System.out.println(counter);
        }
        System.out.println();
    }

    static void dowhileTest(){
        int counter=1;
        do
        {
            System.out.println(counter);
            ++counter;
        }while(counter <=10);
        System.out.println();
    }

    static void whileTest(){
            double r = 0;
    while(r < 0.99d) {
        r = Math.random();
        System.out.println(r);
        }
    }

    static void whileDemo(){
        int count = 1;
        while (count < 11) {
        System.out.println("Count is: " + count);
        count++;
        }
    }

    static void switchdemo(){
            int month = 8;
        switch (month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month.");break;
            }
        }


    static void ifElseDemo(){
        int testscore = 76;
        char grade;
        if (testscore >= 90) {
        grade = 'A';
        } else if (testscore >= 80) {
        grade = 'B';
        } else if (testscore >= 70) {
        grade = 'C';
        } else if (testscore >= 60) {
        grade = 'D';
        } else {
        grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

    
}
