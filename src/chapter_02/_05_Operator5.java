package chapter_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y ) ? "Defferent" : "Same";
        System.out.println(s);


    }
}
