package chapter_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
