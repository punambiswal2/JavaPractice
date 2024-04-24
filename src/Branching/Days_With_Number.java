
//Display the corresponding weekday for a given number. For instance, 1
//would correspond to Monday, 2 to Tuesday, and so forth.

package Branching;

import java.util.Scanner;

public class Days_With_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int num = scanner.nextInt();
        System.out.println(getDayName(num));

    }

    public static String getDayName(int day){
        String dayName = " ";
        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName="Invalid day name" ;
        }

        return  dayName;

    }
}
