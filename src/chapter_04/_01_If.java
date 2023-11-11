package chapter_04;

public class _01_If {
    public static void main(String[] args) {

        int hour = 10;

        if(hour >= 14){
            System.out.println("You better to drink coffee before 2pm");
        }
        boolean hadCoffeToday = false;
        if (hour < 14 && !hadCoffeToday){
            System.out.println("Okay, you can drink a cup of coffe!");
            }



    }
}
