import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegerTest {
    public static void main(String[] args) {
        //一种线程安全的类
        AtomicInteger a = new AtomicInteger();
        a.set(500000);
        System.out.println(a.compareAndSet(500000,234));
        System.out.println(a);
        String a1 = "1";
        String b1 ="1";
        System.out.println(a1 == b1);

        Random random = new Random();

        System.out.println(random.nextInt(3));


        int[] ss = new  int[]{0,1,2,3,4,5,6};

    }



}
