package day44;

public class Student {
    String name;
    int age;
    char gender;
    static String schoolName= "Cybertek University";


    public void setInfo(String name, int age, char gender){
        this.name =name;
        this.age = age;
        this.gender = gender;
    }


    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", School Name: "+schoolName;
    }





}