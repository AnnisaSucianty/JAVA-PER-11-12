public class EqualsTest {
    public static void main (String[] arguments){
        String str1, str2;
        str1 = "free the bound periodicals.";
        str2 = str1;
        System.out.println("String1 : " + str1);
        System.out.println("String2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        str2 = new String(str1);
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Sama value? " + str1.equals(str2)); 
    }
}