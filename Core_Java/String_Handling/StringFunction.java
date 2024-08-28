package Core_Java.String_Handling;

public class StringFunction{
    public static void main(String[] args) {
        String str1 = "Mayank";
        String str2 = "Siddhant";
        String str3 = "Mayank";
        // String Comparision.
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // equalsIgnoreCase();
        String str4 = "MaYanK";
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}