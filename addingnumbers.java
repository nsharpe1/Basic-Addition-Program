import java.util.Scanner;
import java.util.*;
public class addingnumbers{
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);
        System.out.println("Type first number");
        a = input.nextInt();
        System.out.println("Type second number");
        b = input.nextInt();

        int c = a + b;

        System.out.println("The total is: " + c);
    }
}