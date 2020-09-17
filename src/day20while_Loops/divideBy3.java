package day20while_Loops;

public class divideBy3 {
    public static void main(String[] args) {
        for(int i =1; i<=1000;i++){
            if(i%3==0){
                continue;
            }System.out.print(i+" ");
        }

    }
}
