package day20while_Loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class whileLoopReverse {
    public static void main(String[] args) {
        String str = "Cybertek";
        String result=" ";
        int index = str.length()-1;
        while (index>=0){
            result +=str.charAt(index);
            index--;
        }System.out.print(result);
    }


}
