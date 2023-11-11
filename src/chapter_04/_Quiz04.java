package chapter_04;

public class _Quiz04 {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = false;
        boolean withCoupon = false;

        int fee = hour * 4;

        if (fee > 4){
            fee = 4;
        }

        if (isSmallCar || withCoupon){
            fee /= 2;
        }

        System.out.println("Fee: $" + fee);
    }


}
