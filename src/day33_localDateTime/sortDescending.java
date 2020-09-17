package day33_localDateTime;

import java.util.Arrays;

public class sortDescending {
    public static void main(String[] args) {
        int []arr={1,4,3,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[]arr2= new int[arr.length];
        System.out.println(Arrays.toString(arr2));
      int k= arr.length-1;
     for(int i=0;i<=arr2.length-1;i++){
    arr2[i]=arr[k];
    k--;
}
        System.out.println();;
    }
}
