
package day08LogicalOperations;

public class Practices {
    public static void main(String[] args) {
        String name =" Victor";
        String lastName = "Russ";
        int age = 30;
        String citizenShip = "USA";
String citizenShip2 = "RUSSIAN";
    boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        System.out.println(eligibleToVote);
        System.out.println(name+" "+lastName+"  eligible to vote for TRUMP "+eligibleToVote);
}
}

