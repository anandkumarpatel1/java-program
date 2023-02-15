import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args){
        System.out.println("Enter the value in kilometer");
        Scanner in = new Scanner(System.in);
        int kilo = in.nextInt();
        float mile = kilo * 0.62f;
        System.out.println(kilo + " Kilometer in miles is " + mile);
    }
}
