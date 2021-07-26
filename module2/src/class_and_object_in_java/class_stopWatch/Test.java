package class_and_object_in_java.class_stopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] number = new int[100000];
        for (int i = 0; i < number.length; i++) {
            number[i] =(int) (Math.random()*100000);
        }

        StopWatch test = new StopWatch();

        test.start();
        Arrays.sort(number);
        test.end();
        System.out.println(test.getElapsedTime());
    }
}
