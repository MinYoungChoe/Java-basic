package chapter_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i <= 50; i++){
            System.out.println(i + "This is your order!");
            sold++;

            if (i == noShow) {
                System.out.println(i + "You did not show up");
            }
            if (sold == max) {
                System.out.println("Sold out!");
                break;
            }
        }
    }
}
