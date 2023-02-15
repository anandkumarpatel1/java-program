import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        boolean t = in.hasNextInt();
        System.out.println(t);
    }
}
