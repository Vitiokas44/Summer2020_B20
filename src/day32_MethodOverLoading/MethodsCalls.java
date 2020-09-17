package day32_MethodOverLoading;
import Library.Util;





public class MethodsCalls {
    public static void main(String[] args) {


    String firstName = "victor";
    String lastName = "RuSS";
    String fullname = Util.formatFullName(firstName, lastName);
    System.out.println(fullname);
    String uniques=Util.uniques(fullname);
    System.out.println(uniques);

}
 }