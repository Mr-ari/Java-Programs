import java.util.Scanner;

public class StringPracCalc{

    public static void main(String[] args) {
        
        String newString = "+";
        Scanner scr = new Scanner (System.in);
        System.out.println("Enter the String");

        String str = scr.next();

        if(str.charAt(str.length()-1) == '+' 
        || str.charAt(str.length()-1) == '-' 
        || str.charAt(str.length()-1) == '*' 
        || str.charAt(str.length()-1) == '/' ){

            str = str.substring(0, str.length()-1);
        //    System.out.println(str);
        }

        str += newString;
        System.out.println("Your New String is - " + str);
    }
}