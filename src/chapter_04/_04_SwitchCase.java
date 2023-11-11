package chapter_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int spicy = 1;

        switch (spicy){
            case 1:
                System.out.println("Mild spicy");
                break;
            case 2:
                System.out.println("Medium spicy");
                break;
            case 3:
                System.out.println("Very spicy");
            default:
                System.out.println("Error");
        }

    }
}
