package chapter_04;

public class _03_Elseif {
    public static void main(String[] args) {
        boolean espresso = true;
        boolean americano = true;

        if (espresso){
            System.out.println("espresso");
        }
        else if (americano) {
            System.out.println("americano");
        }
        else{
            System.out.println("Iced americano");
        }
    }
}
