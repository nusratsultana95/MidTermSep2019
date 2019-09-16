package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 1000000;
        for(int x = 2; x<=max;x++){
            boolean prime = true;
            for(int y=2;y<Math.sqrt(x);y++)
                if(x%y==0){
                    prime=false;
                    break;
                }
            if(prime)
                arrayList.add(x);
        }
        System.out.println(arrayList);


    }

}
