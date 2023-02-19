import java.util.Scanner;

public class StringToLowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
    }
}
