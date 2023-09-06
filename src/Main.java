// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Alright" + " " + name + " " + " What is your last name?");
        String last = input.nextLine();
        System.out.println("Your Name Is" + " "+ name + " " + last);
        System.out.println("Enter your age :");
        int age=input.nextInt();
        if (age <= 18 ) {
            System.out.println("You Are Too Young");
        }
        else {
            System.out.println("How Old Is Your Mother? :");
            int mage = input.nextInt();
            int result = mage - age;
            System.out.format("Your Mum Was %d Years Old When You Were Born %n", result);
        }
        System.out.println("Would You List To List Prices (Y/N):");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("N")){
            System.out.println("Sure");
        }
        else {
            System.out.println("Sure Here Are The Lists:");
            double item1 = 0.20;
            double item2 = 1.00;
            double item3 = 0.50;

            double results1 = item1 + item2 + item3;
            System.out.format("Results Are" + " " + "£"+ results1 + "0");
        }



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        }
    }