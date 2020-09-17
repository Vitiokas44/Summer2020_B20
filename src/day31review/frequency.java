package day31review;

public class frequency {

    public static void frecuencyOfChar(String[] str,char ch){

        int count=0;
        String s=" " +ch;
        for(String each:str){
            for(int i=0;i<=each.length()-1;i++){
                if(each.substring(i,i+1).equals(s)){
                    count++;
                }
            }



        }




    }
}
