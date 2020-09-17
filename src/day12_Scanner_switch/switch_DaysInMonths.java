package day12_Scanner_switch;

public class switch_DaysInMonths {
    public static void main(String[] args) {
        int month = 6;
        String result = "";
        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
              result = " 30 days";
            break;
            case 2:
               result = "28 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;
            default:
                result= "Invalid";

        }
        System.out.println(result);



    }
}
