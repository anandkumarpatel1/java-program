import java.util.Scanner;

public class IfPercentage {
    public static void main(String[] args)
    {
        int c,dm,web,sum;
        float per;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks in C, DM, WEB");
        c = in.nextInt();
        dm = in.nextInt();
        web = in.nextInt();
        sum = c + dm + web;
        per = (float)sum/3;
        if (c < 33 || dm < 33 || web < 33)
        {
            System.out.println("Your percentage is " + per + " and you are fail");
        }
        else if ((c+dm+web) >= 40)
        {
            System.out.println("your are pass and your percentage is " + per);
        }
        else
        {
            System.out.println("your percentage is " + per + " and you are fail");
        }
    }
}
