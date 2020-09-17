package day29_customMethods;

public class oddnrEvennr {
    public static void main(String[] args) {
        evenNumber();
        oddNumber();
        System.out.println("enter a number");
        System.out.println("yyyi");
        oddNumber();
        }
        public static void evenNumber(){
        for(int i=0;i<=100;i+=2){
            System.out.print(i+" ");
        } }
    public static void oddNumber(){
        for(int k = 100;k>=1;k--){
            System.out.print(k+" ");
        }
    }
}
