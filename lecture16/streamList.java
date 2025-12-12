package lecture16;

import java.lang.reflect.Array;
import java.util.*;

public class streamList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        // list.add(9);
        // list.add(10);
        // list.add(11);
        List<Integer> res = list.stream().filter(n->n>5).toList();        
        List<Integer> Mapres = list.stream().filter(n->n%2!=0).toList();
        int data = res.stream().reduce(0,(a,b)->a+b);

        System.out.println(res);
        System.out.println(Mapres);
        System.out.println(data);
    }
}
