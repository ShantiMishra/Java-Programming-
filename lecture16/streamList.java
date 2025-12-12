package lecture16;

import java.lang.reflect.Array;
import java.util.*;

public class streamList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        List<Integer> res = list.stream().filter(n->n>60).toList();
        List<Integer> Mapres = list.stream().map(n->n*60).toList();
        int data = list.stream().reduce(0,(a,b)->a+b);

        System.out.println(res);
        System.out.println(Mapres);
        System.out.println(data);
    }
}
