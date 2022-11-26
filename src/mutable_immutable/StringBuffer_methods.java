package mutable_immutable;

public class StringBuffer_methods {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Word");
        sb.insert(6, "snowy ");
        System.out.println(sb);
    }
}
