package day25Arrayloop;
//   4. Write a program that can count the even and odd number from an array of integers
public class count_odd_even {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,100, -100, -200, 400, 50000, 10000000, 123};
        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for( int each : nums){

            if(each %2 ==0){
                countEven += 1;
                even += each+" ";
            }else{
                countOdd++;
                odd += each+" ";;
            }

        /*
           if(each %2 ==0){
               countEven += 1;
               even += each+" ";
               continue;
           }
           countOdd++;
           odd += each+" ";
        */

        }


        System.out.println("Even Numbers: "+even);
        System.out.println(countEven);
        System.out.println("Odd Numbers: "+odd);
        System.out.println(countOdd);





    }

}