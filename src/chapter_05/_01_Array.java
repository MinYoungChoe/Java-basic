package chapter_05;

public class _01_Array {
    public static void main(String[] args) {
//        String[] menu = new String[4];
//        menu[0] = "espresso";
//        menu[1] = "americano";
//        menu[2] = "latte";
//        menu[3] = "cappuccino";

        String[] menu = new String[]{"espresso", "americano", "latte", "cappuccino"};

        int length = menu.length;

        for (int i = 0; i < length; i++) {
            System.out.println(menu[i]);
        }

    }
}
