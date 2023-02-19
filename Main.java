import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = in.nextInt();
        if (num == 1)
        {
            System.out.println("This  is not prime number");
        }
        else if (num == 2)
        {
            System.out.println("This is prime number");
        }
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("This is not prime number");
                break;
            }
            else
            {
                System.out.println("This is prime number");
                break;
            }
        }
    }
}