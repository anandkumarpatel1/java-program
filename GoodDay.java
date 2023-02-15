import java.util.Scanner;

public class GoodDay {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner str = new Scanner(System.in);
        String name = str.nextLine();
        System.out.print("Hello," + name + " have a good day *_*");
    }
}
