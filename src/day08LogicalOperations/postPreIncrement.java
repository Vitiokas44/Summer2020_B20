package day08LogicalOperations;

public class postPreIncrement {
    public static void main(String[] args) {
     /*
        3. manually calculate the following code fragements:
        1. int a = 200;
        int b = -a++ + - --a * a-- % 2
        b = ?
        2. int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;  */

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //b = -200 -   200  *  200 % 2;
          // -200        - 4000  %2;
        //-200    -    0 = -200
        System.out.println(b);





    }




}

