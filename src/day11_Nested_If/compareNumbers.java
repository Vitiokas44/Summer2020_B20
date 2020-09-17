package day11_Nested_If;

public class compareNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        String result = "";


        if(a>b){
            result ="a is greater";
        }else if(b>a){
            result = " b is greater";
        }else if (a == b) {
            result = "a is equal to b";
         System.out.println(result);
        }String result2 =(a>b)? "a is greater" : (b>a)? "b is greater" : "a equal to b";
            System.out.println(result2);








    }
}













