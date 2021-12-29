// ****************************** BASIC PROGRAMS ********************************** //

//1. Fibonacci Series

class FibonacciExample1 {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);// printing 0 and 1

        for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}



// 2. Prime Number Program

public class PrimeExample {
    public static void main(String args[]) {
        int i, m = 0, flag = 0;
        int n = 3;// it is the number to be checked
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        } // end of else
    }
}



// 3. Palindrome Program

class PalindromeExample {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        int n = 454;// It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}



// 4. Factorial Program

class FactorialExample {
    public static void main(String args[]) {
        int i, fact = 1;
        int number = 5;// It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}



// 5. Armstrong Number

import java.util.Scanner;
import java.lang.Math;

public class ArmstsrongNumberExample {
    // function to check if the number is Armstrong or not
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        // assigning n into a temp variable
        temp = n;
        // loop execute until the condition becomes false
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            // determines the last digit from the number
            last = temp % 10;
            // calculates the power of a number up to digit times and add the resultant to
            // the sum variable
            sum += (Math.pow(last, digits));
            // removes the last digit
            temp = temp / 10;
        }
        // compares the sum with n
        if (n == sum)
            // returns if sum and n are equal
            return true;
        // returns false if sum and n are not equal
        else
            return false;
    }

    // driver code
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        // reads the limit from the user
        num = sc.nextInt();
        System.out.println("Armstrong Number up to " + num + " are: ");
        for (int i = 0; i <= num; i++)
            // function calling
            if (isArmstrong(i))
                // prints the armstrong numbers
                System.out.print(i + ", ");
    }
}



// 6. How to Generate Random Number

import java.lang.Math;

public class RandomNumberExample1 {
    public static void main(String args[]) {
        // Generating random numbers
        System.out.println("1st Random Number: " + Math.random());
        System.out.println("2nd Random Number: " + Math.random());
        System.out.println("3rd Random Number: " + Math.random());
        System.out.println("4th Random Number: " + Math.random());
    }
}

public class RandomNumberExample2 {
    public static void main(String args[]) {
        int min = 200;
        int max = 400;
        // Generate random double value from 200 to 400
        System.out.println("Random value of type double between " + min + " to " + max + ":");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        // Generate random int value from 200 to 400
        System.out.println("Random value of type int between " + min + " to " + max + ":");
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
    }
}



//7. How to Print Pattern
