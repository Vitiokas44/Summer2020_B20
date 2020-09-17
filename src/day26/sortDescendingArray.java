package day26;

import java.util.Arrays;
/* 7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
OUTPUT arr2: {15, 12, 11, 10, 9, 8, 5}*/

public class sortDescendingArray {
    public static void main(String[] args) {
        int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr); //arr: {1, 2, 3}
        System.out.println( Arrays.toString(arr));

        int[] desc = new int[arr.length];      // { 3, 2, 1}
            /*
            desc[0] =  arr[2];
             desc[1] =  arr[1];
             desc[2] =  arr[0];
        */

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
            desc[i] =  arr[k];
            k--; // k: 2, 1, 0
        }


        System.out.println(Arrays.toString(desc));

    }

}