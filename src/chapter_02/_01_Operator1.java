package chapter_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        System.out.println(2 + 2 * 2);//6
        System.out.println((2 + 2) * 2);//8
        System.out.println(2 + (2 * 2));//6

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); //30

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        int val;

        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);



    }
}
