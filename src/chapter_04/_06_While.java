package chapter_04;

public class _06_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        while (move < distance ){
            System.out.println("Keep run");
            System.out.println("Current distance: " + move);
            move++;

        }
        //infinite loop case
        while (move < distance ){
            System.out.println("Keep run");
            System.out.println("Current distance: " +move);
        }
    }
}
