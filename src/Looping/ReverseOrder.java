
//Print first n numbers in the reverse order
package Looping;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        for(int i=num; i>0; i--)
            System.out.println(i);

    }
}
