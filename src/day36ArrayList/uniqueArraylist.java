package day36ArrayList;

import java.util.ArrayList;

public class uniqueArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for( Integer element: list){  // gets the each element from list
            int count = 0 ;
            for(Integer each : list){  // finds the frequency of element
                if(each == element){
                    count++;
                }
            }
            if(count == 1){  // to verify if  element is unique
                uniques.add(element);
            }
        }


        System.out.println(uniques);




    }

}