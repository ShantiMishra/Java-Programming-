package lecture3;

public class string_builtinFn {
     public static void main(String[] args){
    String str="Hello World";
    System.out.println(str.length());
    System.out.println(str.charAt(5));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.indexOf("e"));
    System.out.println(str.substring(0, 5));  // it will not print the ending index
    System.out.println(str.trim());
    }
}
