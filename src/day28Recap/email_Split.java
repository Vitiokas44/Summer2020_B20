package day28Recap;

public class email_Split {

    public static void main(String[] args) {
        String email = "Cybertek.School@yahoo.com";

        String name = email.substring(0, email.indexOf("@")  ) ;
        String domain = email.substring( email.indexOf("@")+1 , email.lastIndexOf(".") ) ;

        System.out.println(name);
        System.out.println(domain);


    }


}