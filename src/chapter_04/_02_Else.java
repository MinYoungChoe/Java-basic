package chapter_04;

public class _02_Else {
    public static void main(String[] args) {
        int hour = 10;

        if (hour < 14){
            System.out.println("You can drink a cup of coffee");
        }
        else{
            System.out.println("You better to drink a coffee before 2pm");
        }

        boolean hadCoffee = true;
        if (hour >= 14 || hadCoffee == true){
            System.out.println("You can drink a cup of coffee");
        }
        else {
            System.out.println("You better to drink a coffee before 2pm");
        }
    }
}
