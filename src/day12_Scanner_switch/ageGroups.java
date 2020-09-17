package day12_Scanner_switch;

public class ageGroups {
    public static void main(String[] args) {
        int age =151;
        String ageGROUP = "";
       // boolean teenager = age< 21 && age>= 0;
     //   boolean adult = age>= 21 && age< 55;
     //   boolean senior = age >55;
        boolean eligible =age>0 &&age< 150;
         boolean invalidAgeGRoup = age<0 && age> 150;
        if(age>0 &&age <= 150 ) {

         if (age > 0 && age < 21) {

                ageGROUP = "teenager";
            } else if (age >= 21 && age < 55) {
                ageGROUP = "adult";
            } else {
                ageGROUP = "senior";
            }
        }else{
             ageGROUP = "invalid age group";
            }
            System.out.println(ageGROUP);
   ageGROUP = (age<21)? "Teenager" :(age<=55)? "Adult": "Senior";
    }
}
