package day36ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practices {
    public static void main(String[] args) {
        /*inpot{30,20,40,50,15}output{15,50,40,20,30};*/
        ArrayList<Integer>list= new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);//30,20,40,50,15
        Collections.sort(list);//15,20,30,40,50
        System.out.println(list);
        ArrayList<Integer>descendingList= new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            descendingList.add(list.get(i));
           // System.out.println(list.get(i)+" ");
            System.out.println(descendingList);
        }
    }
}
