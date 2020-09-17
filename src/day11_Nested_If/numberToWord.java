package day11_Nested_If;

public class numberToWord {
    public static void main(String[] args) {
        int num = 3;
        String result = "";
        if(num == 1){
            result = "one";
        }if (num == 2){
            result ="one";
        }
        String output = (num == 1)? "one" : (num == 2) ? "two" : (num == 3)? "three" : (num == 4)? "four" : "invalid";

        System.out.println(output);






    }
}
