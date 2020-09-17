package day21Loops;

public class reverse {
    public static void main(String[] args) {
        String word = "VICTOR";
        String result = " ";
        int index= word.length()-1;
        while (index >= 0) {
            result += word.charAt(index);
            index--;
        }
        System.out.println(result.toLowerCase());
    }
}
