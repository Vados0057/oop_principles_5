package mutable_immutable;

public class Exercise01 {

    public static void main(String[] args) {
        String test = "aa";
        System.out.println(insertMiddle(test));
        String test2 = "Olena";
        System.out.println(insertMiddle(test2));
        String  test3 = "";
        System.out.println(insertMiddle(test3));
        String test4 = "a";
        System.out.println(insertMiddle(test4));
        String test5 = "bbb";
        System.out.println(insertMiddle(test5));
        String test6 = "ccccc";
        System.out.println(insertMiddle(test6));
    }

    public static String insertMiddle (String str){

        if (str.length() <= 1) return str;
        if (str.length() % 2 == 0) return new StringBuilder(str).insert(str.length()/2, '*').toString();
        else return new StringBuilder(str).insert(str.length()/2 , '*').insert(str.length()/2 +2, '*').toString();

    }
}
