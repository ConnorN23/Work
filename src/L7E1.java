// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//.
public class L7E1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int option;
        option = 0;
        showMenu();

    }

    public static void showMenu() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Option1");
            System.out.println("2. Option2");
            System.out.println("3. Option3");
            System.out.println("4. Quit");
            int option = input.nextInt();
            if (option == 1)
                option1();
            else if (option == 2) {
                option2();
            }
            else if (option == 3) {
                option3();
            }
            else if (option == 4) {
                option4();
            }
            else {
                System.out.println("Not A Valid Option");
            }
            }

        }

    public static void option1() throws InterruptedException {
        System.out.println("Option1");
        System.out.println("Showing Menu In 5 Seconds, Type '4' to exit the program");
        TimeUnit.SECONDS.sleep(5);
        showMenu();
    }

    public static void option2() throws InterruptedException {
        System.out.println("Option2");
        System.out.println("Showing Menu In 5 Seconds, Type '4' to exit the program");
        TimeUnit.SECONDS.sleep(5);
        showMenu();
    }
    public static void option3() throws InterruptedException {
        System.out.println("Option3");
        System.out.println("Showing Menu In 5 Seconds, Type '4' to exit the program");
        TimeUnit.SECONDS.sleep(5);
        showMenu();
    }
    public static void option4() throws InterruptedException {
        System.out.println("5");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("4");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Bye!");
        System.exit(0);
    }
}





    /* Output #1
    doubleRandomNumber = 2.431392914284627
    randomNumber = 2
    */
