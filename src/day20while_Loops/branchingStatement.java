package day20while_Loops;

public class branchingStatement {
    public static void main(String[] args) {
        char ch = 'A';
        while(ch<='E'){
            if (ch =='C'){
                continue;
            }
            System.out.println(ch);
            ch++;
        }




    }
}
