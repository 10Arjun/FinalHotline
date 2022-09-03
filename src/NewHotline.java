import java.awt.*;
import java.net.URI;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;


public class NewHotline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runtime rt = Runtime.getRuntime();
        String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley";
        System.out.print("Enter your hotline: ");
        String HotlineInput = "";
        Desktop desktop = java.awt.Desktop.getDesktop();
        HotlineInput = sc.nextLine();
//Make all lowercase for conversion to be quick
        HotlineInput = HotlineInput.toLowerCase();
        char[] Term = HotlineInput.toCharArray();
        String temp = "";

        for (int Space = 0; Space < Term.length; Space++) {
            if (Term[Space] != ' ') {
                temp = temp + Term[Space];
            }
        }
        char[] Replacement = temp.toCharArray();
        String newStr = "";
        if (Replacement.length > 7) {
            for (int GreaterThan = 0; GreaterThan < 7; GreaterThan++) {
                newStr += Replacement[GreaterThan];
            }
        } else if (Replacement.length < 7) {
            for (int LessThan = 0; LessThan < Replacement.length; LessThan++) {
                newStr += Replacement[LessThan];
            }
            int Count0 = 7 - Replacement.length;
            for (int EqualTo = 0; EqualTo < Count0; EqualTo++) {
                newStr += "0";
            }
        } else if (Replacement.length == 7) {
            for (int SIU = 0; SIU < Replacement.length; SIU++) {
                newStr += Replacement[SIU];
            }
        }


        char[] InsertedLetter = newStr.toCharArray();
        String OutputNumber = "";
        for (int Index = 0; Index < InsertedLetter.length; Index++) {
            if (InsertedLetter[Index] == 'a' || InsertedLetter[Index] == 'b' || InsertedLetter[Index] == 'c') {
                OutputNumber = OutputNumber + "2";
            } else if (InsertedLetter[Index] == 'd' || InsertedLetter[Index] == 'e' || InsertedLetter[Index] == 'f') {
                OutputNumber = OutputNumber + "3";
            } else if (InsertedLetter[Index] == 'g' || InsertedLetter[Index] == 'h' || InsertedLetter[Index] == 'i') {
                OutputNumber = OutputNumber + "4";
            } else if (InsertedLetter[Index] == 'j' || InsertedLetter[Index] == 'k' || InsertedLetter[Index] == 'l') {
                OutputNumber = OutputNumber + "5";
            } else if (InsertedLetter[Index] == 'm' || InsertedLetter[Index] == 'n' || InsertedLetter[Index] == 'o') {
                OutputNumber = OutputNumber + "6";
            } else if (InsertedLetter[Index] == 'p' || InsertedLetter[Index] == 'q' || InsertedLetter[Index] == 'r' || InsertedLetter[Index] == 's') {
                OutputNumber = OutputNumber + "7";
            } else if (InsertedLetter[Index] == 't' || InsertedLetter[Index] == 'u' || InsertedLetter[Index] == 'v') {
                OutputNumber = OutputNumber + "8";
            } else if (InsertedLetter[Index] == 'w' || InsertedLetter[Index] == 'x' || InsertedLetter[Index] == 'y' || InsertedLetter[Index] == 'z') {
                OutputNumber = OutputNumber + "9";
            } else if (InsertedLetter[Index] == '0' || InsertedLetter[Index] == '1' || InsertedLetter[Index] == '2' || InsertedLetter[Index] == '3' || InsertedLetter[Index] == '4' || InsertedLetter[Index] == '5' || InsertedLetter[Index] == '6' || InsertedLetter[Index] == '7' || InsertedLetter[Index] == '8' || InsertedLetter[Index] == '9') {
                OutputNumber = OutputNumber + InsertedLetter[Index];
            }
        }
        String PART1 = OutputNumber.substring(0, 3);//not right
        String PART2 = OutputNumber.substring(3, 7);//not right


        System.out.println("Your Number is: 1-800-" + PART1 + "-" + PART2);


    }
}

