package day27ArrayRecap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        String[] names = {"Aalia", "Nurbuy", "Ayse"};
        System.out.println(names[1]);//Nurbuy;
        System.out.println(names[0]);//Aalia;
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&////////////////&&&&&&&&&&&&&&&&");
        for (int i = 0; i <= names.length - 1; i++) {
            if (names[i].charAt(2) == 'A') {
                continue;
            }
            if (!names[i].startsWith("N")) {
                System.out.println(Arrays.toString(names));
            }
            System.out.println(names[i]);//"Aalia","Nurbuy","Ayse"
            System.out.println("////////////////////&&&&&&&&&&&&&&&&//////////////////////");
            int[] numbers = new int[3];
            numbers[1] = 25;
            numbers[2] = 100;
            numbers[0] = 175;
            System.out.println(Arrays.toString(numbers));

        }
    }
}