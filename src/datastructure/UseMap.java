package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        //Map
        Map state= new HashMap<>();
        state.put(1,"FL");
        state.put(2,"NY");
        state.put(3,"SC");
        state.put(4,"NJ");
        System.out.println(state.get(3));
        System.out.println(state);

       //List
        List<String> cityList= new LinkedList();
        cityList.add("Tampa");
        cityList.add("St Pete");
        cityList.add("Miami");
        cityList.add("Orlando");

        //using for each loop to retrieve data
        for(String data:cityList){
            System.out.println(data);
        }

        List<String>listOfCountry=new LinkedList<>();
        listOfCountry.add("Bangladesh");
        listOfCountry.add("USA");
        listOfCountry.add("India");
        listOfCountry.add("England");

        //using iterator to retrieve data
        Iterator iterator= listOfCountry.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //using List into Map

        Map<String,List<String>> newMap= new HashMap<>();
        newMap.put("1",cityList);
        newMap.put("2",listOfCountry);
        System.out.println(newMap);




    }

}
