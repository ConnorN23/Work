import java.io.*;
import java.util.Scanner;
import java.util.*;
public class L11_file1 {


    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("output.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number For The Time Table");
            int answer1=input.nextInt();
            for( int count=1; count<=12; count++) {
                out.write(answer1*count);
            }
            out.close();

        }
        catch (Exception e) {
            e.getStackTrace();

        }
    }
    }