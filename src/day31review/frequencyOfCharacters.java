package day31review;
import Library.Util;
public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBBCCC";
        String expectedResult="";//A2B3C3;
        String nonDup=Util.removeDup(str);
        System.out.println(nonDup);


        for (int i=0;i<=nonDup.length()-1;i++){

        char ch1=nonDup.charAt(i);
        int count=Util.frequency(str,ch1);
        expectedResult+=" "+ch1+count;
    }
        System.out.println(expectedResult);

        }
    }


