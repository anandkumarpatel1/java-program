import java.awt.*;
import java.util.Scanner;

public class calculatePercentage {
    public static void main(String[] args){
        System.out.println("Enter the CPTC marks");
        Scanner in = new Scanner(System.in);
        int eng = in.nextInt();
        System.out.println("Enter the DM marks");
        int dm = in.nextInt();
        System.out.println("Enter the DE&m marks");
        int de = in.nextInt();
        System.out.println("Enter the COA marks");
        int coa = in.nextInt();
        System.out.println("Enter the Web tech marks");
        int wt = in.nextInt();
        int sum = eng+dm+de+coa+wt;
        float per = (float) sum/5;
        System.out.print("Your percentage is: ");
        System.out.print(per);
    }
}
