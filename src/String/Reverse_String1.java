package String;

import java.util.Scanner;

public class Reverse_String1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= scanner.nextLine();
        String reverse = " ";

        for(int i = 0; i<str.length(); i++ )
        {
            char ch = str.charAt(i);
            reverse = ch+reverse;
        }

        System.out.println("The reverse  is:"+reverse);
    }
}
