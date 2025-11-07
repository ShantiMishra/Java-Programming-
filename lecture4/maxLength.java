package lecture4;

public class maxLength {
    public static void main(String[] args){
        String str ="java is powerfull";

        String a[]=str.split(" ");
        String largest ="";
        for(String str1 : a){
            if (str1.length()>largest.length()){
                largest=str1;
            }
        }
        System.out.println(largest);
    }
}
