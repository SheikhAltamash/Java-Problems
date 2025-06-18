import java.util.*;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(9);
        list.add(43);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);
        list.set(2 , 5);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.contains(2));
        System.out.println(list.size());


        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     if (max < list.get(i)) {
        //         max = list.get(i);
        //     }

        // }
        // System.out.println(max);
    

    }    
}
