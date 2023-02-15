public class StringMethod {
    public static void main(String[] args) {
        String str = "ANAND KUMAR";
        // int num = str.length();

        // Length of the string
        System.out.println("Length of str string " + str.length());

        // Change lower case string
        System.out.println("Lower case of the str string " + str.toLowerCase());

        // Change upper case string
        String str2 = "anand kumar";
        System.out.println("Upper case of str2 string " + str2.toUpperCase());

        // trimmed string 
        String str3 = "    anand kumar     ";
        System.out.println("NOt trimmed string is " + str3);
        System.out.println("Trimmed string is " + str3.trim());
    }
}
