import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // variables
        System.out.print("I love pizza\n");
        System.out.println("Hello World");
        int x = 123;
        float y = 3.14f;
        double z = 3.14;
        boolean is = true;
        char symbol = '@';
        String name = "Cheer";

        System.out.println("My number is: " + x);
        System.out.println("Hello: " + name);

        // ---------------------------------------- //
        // swap two variables
        String water = "Water";
        String k_aid = "Kool-Aid";

        // water = k_aid;
        // System.out.println("water: " + water);
        // System.out.println("k_aid: " + k_aid);

        String temp = water;
        water = k_aid;
        k_aid = temp;
        System.out.println("water: " + water);
        System.out.println("k_aid: " + k_aid);

        // ---------------------------------------- //
        // user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String your_name = scanner.nextLine();
        System.out.println("What is your age?");
        int your_age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your fav food?");
        String your_fav_food = scanner.nextLine();

        System.out.println("Hello " + your_name);
        System.out.println("You are " + your_age + " years old");
        System.out.println("You like " + your_fav_food);
    }
}
