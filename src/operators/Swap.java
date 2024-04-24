
//Swap the numbers in two variables without using another variable
package operators;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swappin \t" + "a =" + a + " b= " +b);


    }
}
