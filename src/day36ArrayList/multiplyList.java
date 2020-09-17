package day36ArrayList;

import java.util.ArrayList;

public class multiplyList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
      for(int i=1;i<=5;i++){
          list.add(i);
      }
        System.out.println(list);
list.set(list.size()-1,0);
        System.out.println(list);


    }
}
