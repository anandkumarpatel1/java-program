import java.util.Scanner;

public class StringTemplate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = in.nextLine();
        System.out.println("Hello, " + str + " Your welcome in this program");
    }
}
