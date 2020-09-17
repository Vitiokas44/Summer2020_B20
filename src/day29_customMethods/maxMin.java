package day29_customMethods;

public class maxMin {
     // 11. wirte a method that can print out the maximum number from any array of integers
  //  12. wirte a method that can print out the minimum number from any array of integers
    public static void MaxNum(int[]arr){
        int max=arr[0];
        int min = arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        for(int each:arr){
            if (each<min){
                min=+each;
            }
        }
        System.out.println("Max nr is: "+max);
        System.out.println("Min nr is: "+min);
    }

}
