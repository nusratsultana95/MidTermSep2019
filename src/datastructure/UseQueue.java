package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> name = new LinkedList<>();
        name.add("KIM");
        name.add("JIM");
        name.add("JON");
        name.add("RON");

        System.out.println(name.peek());
        System.out.println(name.size());
        System.out.println(name.poll());
        System.out.println(name.size());
        System.out.println(name.remove());
        name.add("JENNY");
        System.out.println(name.size());

        //using for loop to retrieve data

        for(String data:name){
            System.out.println(data);
        }

        //using Iterator to retrieve Data
        Iterator iterator=name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
