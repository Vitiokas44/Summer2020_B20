package day23_Array;

public class grocery_array {
    public static void main(String[] args) {
        String[]items ={"totatoes","milk","eggs","butter"};
        double[]prices={2.5,5,8,7};
        for(int y=0;y<=items.length-1;y++){
            System.out.println(items[y]+": $"+prices[y]);
        }

    }
}
