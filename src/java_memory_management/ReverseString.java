package java_memory_management;

import mutable_immutable.StringBuilder_methods;

public class ReverseString {
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
       return new StringBuilder(str).reverse().toString().equals(str);
    }


    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("Java"));
        System.out.println(reverseString("Hi there"));
        System.out.println(reverseString("1234"));

        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Java"));
    }
}
