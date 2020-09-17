package day38recap;

import java.util.ArrayList;
import java.util.Arrays;

public class wrapper {
    public static void main(String[] args) {
        String s="123";
        int a=Integer.parseInt(s);
        a=a+1;
        s=s+1;
        System.out.println(a+" "+s);
        System.out.println("/////////////////");
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,45,5,68,73,88,9) );
        ArrayList<Integer>list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,3,568,9,9,8,7,0));
        boolean r=list.containsAll(Arrays.asList(1,3,8,9));
        System.out.println(r);
        list2.retainAll(Arrays.asList(568,9,8,7));
        System.out.println(list2);
        ArrayList<Integer>num= new ArrayList<>();
        num.addAll(list);
        num.removeIf(p->p>10&&p<79);
        System.out.println(num);





    }
}
