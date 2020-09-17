package day12_Scanner_switch;

public class switch_practice2 {
    public static void main(String[] args){
        String productName = "Iphone";
     switch (productName){

         case "galaxy":
             System.out.println("Samsung");
         case"Iphone":
         case"Ipad":
         case"MacBook":
             System.out.println("iphone");
             break;
         default:
             System.out.println("invalid");


}}}
