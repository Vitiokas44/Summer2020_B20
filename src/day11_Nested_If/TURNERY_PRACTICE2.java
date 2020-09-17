package day11_Nested_If;

public class TURNERY_PRACTICE2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
            // CONVERT TO TURNERY ? IF KEYWORD : ELSE
            String  result2 = (num>0)? "Positive" : (num < 0) ?"Negative": "Zero";
            System.out.println(result);
            System.out.println(result2);







        }


    }
}


