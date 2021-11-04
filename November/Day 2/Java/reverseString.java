import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        //taking a user input
        String n=sc.next();
        // We are passing the input to function which will reverse any string
        String rev=reverse(n);
        System.out.println(rev);
        sc.close();
    }
    public static String reverse(String str) {
        // declaring and initialising a temp variable with blank,to store the value and return the string
        String w="";
        for(int i=0;i<str.length();i++) {
            // Since it's a String,we can add any character at any part of the String
            //adding the character extracted,at the front of variable w to get the final reverse value
            w=str.charAt(i)+w;
        }
        return w;
    }
}
