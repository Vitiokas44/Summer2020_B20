package day34_wrapperClass;

import java.util.ArrayList;

public class list_Intro {
    public static void main(String[] args) {
        ArrayList<Integer>scores=new ArrayList<>();
        scores.add(95);//autoBoxing
        scores.add(100);
        scores.add(85);
        scores.add(75);
        scores.add(4,88);
        System.out.println(scores);
        System.out.println(scores.get(2));
        System.out.println( scores.size());
    }
}
