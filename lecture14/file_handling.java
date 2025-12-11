package lecture14;
import java.io.*;

public class file_handling {
    public static void main(String[] args){
        try{
            File file = new File("index.html");
            System.out.println("donee"+ file.getName());
        }
        else{
            System.out.println("alraedy file created");
        }
        catch(Excepttion e){
            
        }
    }
}
