package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Beslan= new BankAccount();
        BankAccount Ahmet= new BankAccount();
        BankAccount Viorel= new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Wagar = new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan","4567890123");
        Ahmet.setAccountInfo("Checking","Ahmet","963852741");
        Viorel.setAccountInfo("Checking","Viorel","789658967485");
        Nurmamet.setAccountInfo("Checking","Nurmamet","456789123");
        Wagar.setAccountInfo("Checking","Wagar","258741852");

        ArrayList<BankAccount>accounts= new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Viorel,Ahmet,Nurmamet,Wagar));
         for(BankAccount each: accounts){
             each.deposit(500);
             each.getAccountInfo();
         }
    }
}
