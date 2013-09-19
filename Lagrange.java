/*
 * Lagrange.java
 *
 * Computer Science E-22
 */

import java.util.*;

/**
 * An application that reads positive integers from the user and
 * breaks them into sums of at most four positive perfect squares.
 */
public class Lagrange {
    private int number;      // the number we are trying to break up
    
    /* Put any additional fields below. */
    

    /*
     * largestSquare - a private helper method that returns the 
     * largest perfect square less than or equal to the specified 
     * positive integer n.
     */
    private static int largestSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt;
    }

    /**
     * constructor
     */
    public Lagrange(int num) {
        number = num;
        
        // initialize the field(s) that you add below
        
    }

    /**
     * printSolution - print the solution to the problem
     */
    public void printSolution() {
        System.out.print(number + " = ");
        
        // Complete this method below.
        
    }
    
    /**
     * findSum - the key recursive-backtracking method.
     * We call it to break the specified number (num) into a sum 
     * of at most maxTerms perfect squares.  
     * Returns true if the solution has been found and false otherwise.
     * 
     * NOTE: If you choose to modify the signature of this method,
     * you must also change the code in the main method that
     * uses the method.
     */
    public boolean findSum(int num, int maxTerms) {
        // Replace the line below -- which we have included
        // to allow the code to compile -- with your implementation
        // of the method.
        return false;      // backtrack
    }
    
    /* Put any additional methods below. */
    

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer (-1 to quit): ");
            int n = console.nextInt();
            console.nextLine();
            
            if (n == -1) {
                System.out.println("Goodbye!");
                return;
            } else if (n <= 0)
                continue;
    
            Lagrange problem = new Lagrange(n);
            
            if (problem.findSum(n, 4)) {
                problem.printSolution();
            } else {
                System.out.println("could not find a sum for " + n);
                System.out.println();
            }
            System.out.println();
        }
    }
}

