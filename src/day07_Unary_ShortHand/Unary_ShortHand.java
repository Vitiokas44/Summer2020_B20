package day07_Unary_ShortHand;

public class Unary_ShortHand {
    public static void main(String[] args) {
int a = 10;
        System.out.println(++a);//11
        System.out.println(a);//11
        System.out.println(a++);//
        System.out.println("===========================");


        int A = 1;
        A = -A-- + A++ / -A--* --A;
       //   -1  + 0   /   -1 *     -1
 //          -1 + 0       *- 1
      //  A =  -1 + 0 = -1;
        System.out.println(A);
        System.out.println("----------------------------");
        int b = 50;
        //b = --b + b++ + b-- + b++;
        //b = 49 + 49  + 50  + 49;
            System.out.println("''''''''''''''''''''");
            int Y = 1;
            Y = -Y-- + Y++ / -Y-- + --Y;
            //Y =-1 + 0  / -1     +  -1
            //Y =  -1  +   0 *        -1
            //-1 +0 = -1;

    }




}

