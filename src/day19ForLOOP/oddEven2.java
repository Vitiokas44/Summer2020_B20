package day19ForLOOP;

public class oddEven2 {
    public static void main(String[] args) {
     /*
 3. print odd numbers between 1 to 50
 4. print even number between 1 to 50
 MUST use continue statement
 */
        for(int i =0; i <= 50; i++){ // in order to print even, we can choose skip odd number

            if(i % 2 != 0){ // if the number is odd, then skip
                continue;
            }

            System.out.print(i+" ");

        }


        for(int i =0; i <= 50; i++){  // in order to print odd, we can choose skip even number

            if(i % 2 == 0){ // if the number is even, then skip
                continue;
            }

            System.out.print(i+" ");

        }



    }

}