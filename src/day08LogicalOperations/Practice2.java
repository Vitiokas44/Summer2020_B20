package day08LogicalOperations;

public class Practice2 {
    public static void main(String[] args) {
        int age = 12;
        String citizenShip1 = "USA";
        String citizenShip2 = "FRANCE";
        boolean eligibleAge = age >= 18;
        boolean usCitizen = citizenShip1 =="USA" || citizenShip2 == "USA";
        boolean eligibleToVote = eligibleAge && usCitizen;
        System.out.println(eligibleToVote);

    }
}
