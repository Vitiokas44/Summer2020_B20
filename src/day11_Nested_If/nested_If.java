package day11_Nested_If;

public class nested_If {
    public static void main(String[] args) {
        int day = 4;
         String result ="";
         boolean validNumber = day>=1 && day<=7;
         boolean invalid = day<1 && day> 7;
         if(validNumber){
       if(day==7){
         result = "Sunday";
        }else if(day == 6){
             result = "Saturday";
        }else if(day == 5){
             result = "Friday";
        }else if(day == 4){
             result = "Thursday";
        }else if(day == 3){
             result = "Wednesday";
        }else if(day == 2){
             result = "Tuesday";
        }else {
           result = "Monday";
       }

        }else {
             result = "invalid";
        }
        System.out.println(result);

         /*
            result= (day == 7) ? "Sunday" :(day == 6)? "Saturday" : (day == 5) ?"Friday"
                     :(day == 4)? "Thursday" :(day == 3)? "Wednesday" :(day == 2)? "Tuesday"
                     : "Monday";
          */










    }
}
