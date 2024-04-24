
//Check if the given number is even or odd
package Looping;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scanner.nextInt();

        if(num%2 == 0)
            System.out.println("The"+num +"is even");
        else
            System.out.println("The"+num+"is odd");
    }
}
