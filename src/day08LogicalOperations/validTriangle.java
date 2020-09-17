package day08LogicalOperations;

public class validTriangle {
    public static void main(String[] args) {

     double angle1 = 100;
     double angle = 60;
     double angle2 = 20;

        boolean valid = angle + angle1 + angle2 == 180;
        boolean invalid = ! valid ;
     if (valid){
         System.out.println("Valid Triangle");
     }

     if(invalid){
         System.out.println("invalid triangle");
     }

    }
}
