import java.util.*;

public class NewHotline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the hotline you would like to contact");
        String HotlineInput = sc.nextLine();
        String Term = "";
//convert all the characters in the string to lowercase, so that the index value makes it easier to use the index
        HotlineInput = HotlineInput.toLowerCase();
        char[] A = HotlineInput.toCharArray();

//remove the space from the string
        String Term = "";

//create an index for the char character inputted: If a character is taken from the list assign a number to it using
//Assign the values from the letters using the hotline and for the numbers just add the numbers to the string normally
//

        for (int i=0; i <= A.length; i++){
            if (A[i] == 'a' || A[i] == 'b' || A[i] == 'c'){

            }
            else if (A[i] == 'd' || A[i] == 'e' || A[i] == 'f') {

            }
            else if (A[i] == 'g' || A[i] == 'h' || A[i] == 'i'){

            }
            else if (A[i] == 'j' || A[i] == 'k' || A[i] == 'l') {

            }
            else if (A[i] == 'p' || A[i] == 'q' || A[i] == 'r'|| A[i] == 's') {

            }
            else if (A[i] == 't' || A[i] == 'u' || A[i] == 'v') {

            }
            else if (A[i] == 'w' || A[i] == 'x' || A[i] == 'y'|| A[i] == 'z') {

            }
            else if (A[i] == '0' ||A[i] == '1' || A[i] == '2' || A[i] == '3' || A[i] == '4' || A[i] == '5' || A[i] == '6' || A[i] == '7' || A[i] == '8' || A[i] == '9' ||) {

            }
            {
        }

        String StringFinalNumber1 = OutputNumber.substring(0,9);
        String StringFinalNumber2 = OutputNumber.substring(9);
        System.out.println("The number is 1-800-"+StringFinalNumber1 +'-' +StringFinalNumber2);

    }







}
