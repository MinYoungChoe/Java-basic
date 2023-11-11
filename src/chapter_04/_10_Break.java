package chapter_04;

public class _10_Break {
    public static void main(String[] args) {
        int max = 20;
        boolean isAvailable = true;

        for (int i = 0; i <= 50; i++) {
            if(i == max){
                System.out.println("Sold out!");
                isAvailable = false;
                break;
            }
        }
        if (!isAvailable){
            System.out.println("We closed");
        }
    }
}
