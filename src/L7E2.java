// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//.
public class L7E2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        questions();

    }

    public static void questions() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int answer1=input.nextInt();
        System.out.println("Enter Second Number");
        int answer2=input.nextInt();
        int sum = answer1 + answer2;
        System.out.println("The Answer Is" + " " + sum);
    }
    }

