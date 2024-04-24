//Find factorial of a number (Apply recursion)
package Looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("The factorial of" +num+"is"+fact(num));
    }

    public static  int fact(int n)
    {
        if(n==0) {
            return 1;
        }

        return  n * fact(n-1);

    }
}
