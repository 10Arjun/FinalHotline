import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;


public class NewHotline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the hotline you would like to contact");
        String HotlineInput = sc.nextLine();
        String Term = "";
//convert all the characters in the string to lowercase, so that the index value makes it easier to use the index
        HotlineInput = HotlineInput.toLowerCase();
        char[] c = HotlineInput.toCharArray();
        char[] Final_Array = Term.toCharArray();
        String newStr = "";
//create an index for the char character inputted: If a character is taken from the list assign a number to it using
//Assign the values from the letters using the hotline and for the numbers just add the numbers to the string normally
        char[] A = newStr.toCharArray();
        String Output = "";
//remove the space from the string, The integer for Space is s
        for (int Space = 0; Space < c.length; Space++) {
            if (c[Space] != ' ') {
                Term = Term + c[Space];
            }
        }
// if there are values less that are 7 in total add 0s
        if (Final_Array.length > 7) {
            for (int LessThan = 0; LessThan < 7; LessThan++) {
                newStr += Final_Array[LessThan];
            }
//if there are more than 7 values remove the values until there are 7
        } else if (Final_Array.length < 7) {
            for (int GreaterThan = 0; GreaterThan < Final_Array.length; GreaterThan++) {
                newStr += Final_Array[GreaterThan];
            }
            int Amountof0s = 7 - Final_Array.length;
            for (int Subtract = 0; Subtract < Amountof0s; Subtract++) {
                newStr += "0";
            }
        } else if (Final_Array.length == 7) {
            for (int Equals = 0; Equals < Final_Array.length; Equals++) {
                newStr += Final_Array[Equals];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'a' || A[i] == 'b' || A[i] == 'c') {
                Output = Output + "2";
            } else if (A[i] == 'd' || A[i] == 'e' || A[i] == 'f') {
                Output = Output + "3";
            } else if (A[i] == 'g' || A[i] == 'h' || A[i] == 'i') {
                Output = Output + "4";
            } else if (A[i] == 'j' || A[i] == 'k' || A[i] == 'l') {
                Output = Output + '5';
            } else if (A[i] == 'm' || A[i] == 'n' || A[i] == 'o') {
                Output = Output + "6";
            } else if (A[i] == 'p' || A[i] == 'q' || A[i] == 'r' || A[i] == 's') {
                Output = Output + "7";
            } else if (A[i] == 't' || A[i] == 'u' || A[i] == 'v') {
                Output = Output + "8";
            } else if (A[i] == 'w' || A[i] == 'x' || A[i] == 'y' || A[i] == 'z') {
                Output = Output + '9';
            } else if (A[i] == '0' || A[i] == '1' || A[i] == '2' || A[i] == '3' || A[i] == '4' || A[i] == '5' || A[i] == '6' || A[i] == '7' || A[i] == '8' || A[i] == '9') {
                Output = Output + A[i];
            }
        }
        String Split0 = Output.substring(0, 6);
        String Split1 = Output.substring(6);
        System.out.println("The Toll Number you are looking for is: 1-800-" + Split0 + Split1);
    }
}

