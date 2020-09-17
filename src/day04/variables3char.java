package day04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class variables3char {
    public static void main(String[] args) {
        char ch1 ='A';
        char ch2 = 65;
        char ch3 = 35000;
        System.out.println(ch1);
        System.out.println();
        System.out.println(ch3);
        /*char ch4 = 66000; you cant assign  this
         amount its out of range ,char is from
        0 to 65535
         */
        char c1 = 'A';//65
        char c2 ='B';//66 FROM ASCHII TABLE
        int resultd = c1 + c2;
        System.out.println(resultd);
        char c7 ='1'; //49 from aschii table
        System.out.println(c7);//prints char'1'
        System.out.println(c7 + 1);// will use its
        System.out.println("================================");
        char a1 ='A';
        System.out.println();

    }


}
