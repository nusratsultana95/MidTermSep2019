package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> cityList = new ArrayList();
        cityList.add("Tampa");
        cityList.add("St Pete");
        cityList.add("Miami");
        cityList.add("Orlando");
        System.out.println(cityList.get(2));
        System.out.println(cityList.remove(3));
        System.out.println(cityList.size());


        //using for each loop to retrieve data
        for(String city:cityList){
            System.out.println(city);
        }

        //using iterator with while loop to retrieve data
        Iterator<String>iterator=cityList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
