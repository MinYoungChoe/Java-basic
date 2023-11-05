package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((double) score);
        score = 93 + (int)11.1;

        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);

        String s2 = String.valueOf(99.8);
        s2 = Double.toString(97.8);
        System.out.println(s2);

        int i = Integer.parseInt(s1);
        System.out.println(i);
        double d = Double.parseDouble(s2);
        System.out.println(d);
    }
}
