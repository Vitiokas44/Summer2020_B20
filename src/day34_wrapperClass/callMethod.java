package day34_wrapperClass;

import Library.Util;

import java.util.Arrays;

public class callMethod {
    public static void main(String[] args) {
        Integer[]arr1={1,2,3,4};
        Integer[]arr2={4,5,6,7};
        Integer[]arr3= Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
        Integer max=Util.maxNum(arr3);
        }

    }

