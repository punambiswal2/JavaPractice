
//Find nth Power of a number
package Looping;

import java.util.Scanner;

public class Power_Of_N {
    public static void main(String[] args) {
        int  number,exponent;
        long power = 1;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        number = scanner.nextInt();

        System.out.println("Enter the exponent");
        exponent = scanner.nextInt();

        for(int i=1; i<=exponent; i++)
        {
            power = power * number;
        }
        System.out.println("The power of number is:"+power);


    }
}
