// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.util.Scanner;


public class PasswordGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What Is Your First Name");
        String firstname = input.nextLine();
        String firsta =  firstname.substring(0,1).toLowerCase();
        String firstb = firstname.substring(0,1).toUpperCase();
        System.out.println("What Is Your Last Name");
        String lastname = input.nextLine();
        String lasta =  lastname.substring(0,1).toUpperCase();
        String lastb =  lastname.toLowerCase();
        System.out.println("What Year Were You Born");
        String year = input.nextLine();
        System.out.println("Your New Username:" + " " + firstb + lastb);
        System.out.println("Your New Password Is:" + " " + firsta + lasta + year);
    }



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
    }
