
//Reverse a string
package String;

public class Reverse_String {
    public static void main(String[] args) {

        String str = "Punam";
        String reverse = " ";
        StringBuffer sb=new StringBuffer(str);

        reverse = sb.reverse().toString();

        System.out.println(reverse);


    }
}
