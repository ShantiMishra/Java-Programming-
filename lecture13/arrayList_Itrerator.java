package lecture13;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_Itrerator {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator<Integer>i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            if(i.next()==6){
                i.remove();
            }
        }
        

    }
}
