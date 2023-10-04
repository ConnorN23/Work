// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Capital of Spain?");
        String answer1 = input.nextLine();

        if (answer1.equalsIgnoreCase("madrid")){
            System.out.println("Correct");
        }
        else {
            System.out.println("Not Correct");
        }

    }



    // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    // Press Shift+F9 to start debugging your code. We have set one breakpoint
    // for you, but you can always add more by pressing Ctrl+F8.
}
