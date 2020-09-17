package day11_Nested_If;

public class compare_2_numbers {
    public static void main(String[] args) {
  

       int a = 10;
        int b = 20;
        String result ="";
        if(a> b ){
            result = "a is greater";
        }else
            if(b>a){
                result = "b is greater";
            }
            System.out.println(result);
            String result2 = (a>b)? "a is greater" : "b is greater";
        System.out.println(result2);
        System.out.println(result);
    }





}
