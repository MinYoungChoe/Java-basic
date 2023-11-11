package chapter_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;

        while (move + height < distance ){
            System.out.println("Keep run");
            System.out.println("Current distance: " + move);
            move+=3;
        }
        height = 25;
        move = 0;
        do {
            System.out.println("Keep run");
            System.out.println("Current distance: " + move);
            move+=3;
        } while (move + height < distance);

    }
}
