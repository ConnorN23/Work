// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.util.Scanner;
//.
public class L5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number For The Time Table");
        int answer1=input.nextInt();
        for( int count=1; count<=12; count++)
        {
            System.out.println(answer1*count);
        }

        }
    }
