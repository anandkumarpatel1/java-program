import java.util.Scanner;

public class SwitchOrg {
    public static void main(String[] args){
        String st;
        System.out.println("Enter the website");
        Scanner in = new Scanner(System.in);
        st = in.next();
        if (st.endsWith(".org")){
            System.out.println("This is organisation website");
        }
        else if (st.endsWith(".in")) {
            System.out.println("This is indian website");
        }
        else if (st.endsWith(".com")){
            System.out.println("This is commercial website");
        }
    }
}
