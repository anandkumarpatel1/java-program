import java.util.Scanner;

public class IfTax {
    public static void main(String[] args)
    {
        int income;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the income");
        income = in.nextInt();
        float t1 = (float)(income-250000)*5/100;
        float t2 = (float)(income-500000)*20/100;
        float t3 = (float)(income-1000000)*30/100;
        System.out.println(t1);
        if (income <= 250000)
        {
            System.out.println("Your income is less than 2.5L so you can't pay tax");
        }
        else if (income > 250000 && income <= 500000)
        {
            System.out.println("Your Payable tax is " + t1);
        }
        else if (income > 500000 && income <= 1000000)
        {
            System.out.println("your Payable tax is " + t2);
        }
        else if (income > 1000000)
        {
            System.out.println("Your payable tax is " + t3);
        }
    }
}
