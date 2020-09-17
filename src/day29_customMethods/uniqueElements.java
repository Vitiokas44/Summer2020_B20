package day29_customMethods;

public class uniqueElements {
    public static void main(String[] args) {
        String[]arr={"A","B","B","C"};
        uniques(arr);
    }

    public static void uniques(String[]arr) {
        for (String a : arr) { // gets each of the element

            int count = 0;
            for (String each : arr) { // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }

            if (count == 1) { // unique
                System.out.print(a + " ");
            }
        }
    }}
