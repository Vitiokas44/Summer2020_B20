package day08LogicalOperations;

public class Practice3 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = --b == 2 || --b == 2 && --b ==2;
        //             3  == 2 ||   2 == 2 &&  1  ==2;
        //               false || true    &&    false';
        //                      true         &&  false
                                    //    false
        System.out.println(res);
        System.out.println(b);
  int c = 5;
  boolean r2 = c++ == 6 || c-- == 5;
  //            5   = 6    5 = 5
  //                false    true
  //                   true




    }
}
