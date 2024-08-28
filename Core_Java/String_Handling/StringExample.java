package Core_Java.String_Handling;

public class StringExample {
    public static void main(String[] args) {
        // Creating String by java string literal
        String s1 = "HelloString";
        char[] ch = {'j','a','v','a'};
        // Converting char array to string
        String s2 = new String(ch);
        // Creating Java String by New Keyword
        String s3 = new String("Example.");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
