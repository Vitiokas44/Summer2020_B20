package day38recap;

import java.util.ArrayList;
import java.util.Arrays;

public class grades {
    public static void main(String[] args) {
        ArrayList<Integer>grades= new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,66,33,11,44,20,88,72,56,75,85,65,85,55,45,73,35,47));

        ArrayList<Integer>gradeOfA= new ArrayList<>();
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(each->each<90 ||each>100);

        ArrayList<Integer>gradeOfB= new ArrayList<>();
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(each->each<80||each>89);

        ArrayList<Integer>gradeOfC= new ArrayList<>();
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(each->each<70||each>79);

        ArrayList<Integer>gradeOfD= new ArrayList<>();
        gradeOfD.addAll(grades);
        gradeOfC.removeIf(each->each<60||each>69);

        ArrayList<Integer>gradeOfE= new ArrayList<>();
        gradeOfE.addAll(grades);
        gradeOfE.removeIf(each->each<59);

        System.out.println(gradeOfA.size()+ " students with grade A");
        System.out.println(gradeOfB.size()+ " students with grade B");
        System.out.println(gradeOfC.size()+ " students with grade C");
        System.out.println(gradeOfD.size()+ " students with grade D");
        System.out.println(gradeOfE.size()+ " students with grade E");





    }
}
