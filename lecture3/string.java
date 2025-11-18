package lecture3;

public class string {
     public static void main(String[] args){
        String str=new String("hello");  //new is storing  string in different objects
        String str1=new String("hello");
        System.out.println(str==str1);           
        
        System.out.println(str.equals(str1));     //every element of string is compared  
     } 
}
