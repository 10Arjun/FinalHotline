import java.util.*;
import java.lang.*;

public class NewHotline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String HotlineInput = "";
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
            for (int LessThan = 0; LessThan < 7; LessThan++) {
                newStr += Replacement[LessThan];
            }
        } else if (Replacement.length < 7) {
            for (int GreaterThan = 0; GreaterThan < Replacement.length; GreaterThan++) {
                newStr += Replacement[GreaterThan];
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

        for (int i = 0; i < InsertedLetter.length; i++) {
            if (InsertedLetter[i] == 'a' || InsertedLetter[i] == 'b' || InsertedLetter[i] == 'c') {
                OutputNumber = OutputNumber + "2";
            } else if (InsertedLetter[i] == 'd' || InsertedLetter[i] == 'e' || InsertedLetter[i] == 'f') {
                OutputNumber = OutputNumber + "3";
            } else if (InsertedLetter[i] == 'g' || InsertedLetter[i] == 'h' || InsertedLetter[i] == 'i') {
                OutputNumber = OutputNumber + "4";
            } else if (InsertedLetter[i] == 'j' || InsertedLetter[i] == 'k' || InsertedLetter[i] == 'l') {
                OutputNumber = OutputNumber + "5";
            } else if (InsertedLetter[i] == 'm' || InsertedLetter[i] == 'n' || InsertedLetter[i] == 'o') {
                OutputNumber = OutputNumber + "6";
            } else if (InsertedLetter[i] == 'p' || InsertedLetter[i] == 'q' || InsertedLetter[i] == 'r' || InsertedLetter[i] == 's') {
                OutputNumber = OutputNumber + "7";
            } else if (InsertedLetter[i] == 't' || InsertedLetter[i] == 'u' || InsertedLetter[i] == 'v') {
                OutputNumber = OutputNumber + "8";
            } else if (InsertedLetter[i] == 'w' || InsertedLetter[i] == 'x' || InsertedLetter[i] == 'y' || InsertedLetter[i] == 'z') {
                OutputNumber = OutputNumber + "9";
            } else if (InsertedLetter[i] == '0' || InsertedLetter[i] == '1' || InsertedLetter[i] == '2' || InsertedLetter[i] == '3' || InsertedLetter[i] == '4' || InsertedLetter[i] == '5' || InsertedLetter[i] == '6' || InsertedLetter[i] == '7' || InsertedLetter[i] == '8' || InsertedLetter[i] == '9') {
                OutputNumber = OutputNumber + InsertedLetter[i];
            }
        }

        String PART1 = OutputNumber.substring(0,2);//not right
        String PART2 = OutputNumber.substring(2);//not right

        System.out.println(PART1 +"-" +PART2);

    }
}