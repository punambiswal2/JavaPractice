package Looping;

import java.util.Scanner;

public class Multiplication_Table{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++)
        {
            int multiply=num * i;
            System.out.println(num +"*"+ i+"="+multiply);
        }

    }
}
