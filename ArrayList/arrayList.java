package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        // add elements
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        // to get an element
        int element = list1.get(0); // 0 is the index
        System.out.println(element);

        // add element in between
        list1.add(1, 2); // 1 is the index and 2 is the element to be added
        System.out.println(list1);

       list1.set(0,0);
       System.out.println(list1);


       //delete elements
       list1.remove(0); // 0 is the index
       System.out.println(list1);


       //size of list1
       int size = list1.size();
       System.out.println(size);


       //Loops on lists
       for(int i=0; i<list1.size(); i++) {
           System.out.print(list1.get(i) + " ");
       }
       System.out.println();


       //Sorting the list1
       list1.add(0);
       Collections.sort(list1);
       System.out.println(list1);


    }
}
