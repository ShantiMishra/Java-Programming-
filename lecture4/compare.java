package lecture4;
import java.util.*;

public class compare {
    public static void main(String[] args ){
        String str1="abcd";
        String str2="bcda";
      char ch[]=str1.toCharArray();
      char ch1[]=str2.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(ch1);
      String val1=new String(ch);
      String val2=new String(ch1);
      if(val1.equals(val2)){
        System.out.println("true");
      }
      else{
        System.out.println("False");
      }
         }

    }

