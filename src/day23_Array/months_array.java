package day23_Array;

public class months_array {
    public static void main(String[] args) {
        String[]months={"january","February","March","April","May","June"};
        int[]days={31,30,28,45,54,19};
        for(int i=0;i<=months.length-1;i++){
            System.out.println(months[i]+" "+days[i]);
        }
    }
}
