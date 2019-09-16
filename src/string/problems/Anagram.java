package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a= "CAT";
        String b= "ACT";
        String c="ARMY";
        String d="MARY";

        char [] charstringA = a.toCharArray();
        char[] charstringB = b.toCharArray();
        char[] charstringC= c.toCharArray();
        char[] charstringD= d.toCharArray();



        Arrays.sort(charstringA);
        Arrays.sort(charstringB);
        Arrays.sort(charstringC);
        Arrays.sort(charstringD);

        if(Arrays.equals(charstringA,charstringB)){
            System.out.println("words are anangram");
        }else System.out.println("words are not anangram");

        if (Arrays.equals(charstringC,charstringD)){
            System.out.println("Words are anangram");
        }else System.out.println("words are not anangram");
    }

}
