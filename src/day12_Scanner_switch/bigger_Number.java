package day12_Scanner_switch;

public class bigger_Number {

    public static void main(String[] args) {
       double n1 = 11;
       double n2 = 18;
       double n3 = 19;
       boolean  n1IsBigger = n1>n2 && n1> n3;
        boolean   n2IsBigger =  n2>n1 && n2> n3;//false && n2> n3;
      //  boolean n3IsBigger= !n1IsBigger && !n2IsBigger;
        // String result ="";
          /* if(n1IsBigger){
               result = "n1 is bigger";
           }else if(n2IsBigger){
               result = "n2 is bigger";
           }else {
             result = "n3 is bigger"; */
        String result2 = (n1IsBigger) ? "n1 is bigger" : (n2IsBigger) ? "n2 is bigger" : "n3 is bigger";
        System.out.println(result2);

    }
}