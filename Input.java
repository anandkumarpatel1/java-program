import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        System.out.println("Enter the two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.print("sum of two numbers :");
        System.out.print(sum);
    }
}
