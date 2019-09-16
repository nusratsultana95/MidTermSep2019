package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Factorial factorial=new Factorial();
        int newnumber=factorial.Findfactorial(5);
        System.out.println("Factorial of 5 is : "+newnumber);

    }
    public int Findfactorial(int x){
        int number =1;
        for(int a=1;a<=x;a++){
            number=number*a;
        }
        return number;


    }
}
