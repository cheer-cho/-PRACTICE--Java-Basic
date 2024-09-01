import javax.swing.JOptionPane;
import java.util.Random;
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
        // Scanner scanner = new Scanner(System.in);

        /*
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
        scanner.close();
         */

        // ---------------------------------------- //
        // expression
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        double friends = 10;
        friends = (double) friends % 3;
        System.out.println(friends);

        // ---------------------------------------- //
        // GUI
        /*
        String a_name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + a_name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age name"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
         */

        // ---------------------------------------- //
        // 5. Math class
        /*
        double pi = 3.14;

        double dummy = -10;

        double max = Math.max(pi, dummy);
        System.out.println(max);

        double abs = Math.abs(dummy);
        System.out.println(abs);

        double rounded = Math.round(pi);
        System.out.println(rounded);

        Scanner scanner = new Scanner(System.in);

        double a_x, a_y, a_z;

        System.out.println("Enter side x: ");
        a_x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        a_y = scanner.nextDouble();

        a_z = Math.sqrt(Math.pow(a_x, 2) + Math.pow(a_y, 2));
        System.out.println(a_z);

        scanner.close();
         */

        // ---------------------------------------- //
        // 5. Random numbers
        /*
        Random random = new Random();

        int num_1 = random.nextInt(10) + 1; // 1 - 10;
        System.out.println(num_1);

        double num_2 = random.nextDouble(); // 1 - 10;
        System.out.println(num_2);

        boolean bool_1 = random.nextBoolean();
        System.out.println(bool_1);
        */

        // ---------------------------------------- //
        // 6. If statement
//        Random random = new Random();
//        int age = random.nextInt(85) + 1;
//
//        System.out.println("Age: " + age);
//
//        if (age >= 75) {
//            System.out.println("Okay Boomer!");
//        } else if (age >= 18) {
//            System.out.println("You are an adult!");
//        } else if (age >= 13) {
//            System.out.println("You are a teenager!");
//        } else {
//            System.out.println("You are NOT an adult!");
//        }

        // ---------------------------------------- //
        // 7. Switch statement
//        String day = "Friday";
//        switch (day) {
//            case "Sunday":
//                System.out.println("This is Sunday!");
//                break;
//
//            case "Friday":
//                System.out.println("This is Friday!");
//                break;
//
//            case "Monday":
//                System.out.println("This is Monday!");
//                break;
//        }

        // ---------------------------------------- //
        // 8. logical operators

        // && = (AND)
        // || = (OR)
        // !  = (NOT)

//        Random random = new Random();
//        int temperature = random.nextInt(101);
//
//        System.out.println("Temp: " + temp);
//
//        if (temperature >= 40) {
//            System.out.println("This is too hot outside");
//        } else if (temperature >= 30 && temperature < 40) {
//            System.out.println("It is hot outside");
//        } else if (temperature >= 20 && temperature < 30) {
//            System.out.println("It is chilling outside");
//        } else {
//            System.out.println("It is cold outside");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("You are playing the game! Press q or Q to quite");
//        String response = scanner.next();
//
//        if (response.equals("q") || response.equals("Q")) {
//            System.out.println("You quit the game");
//        } else {
//            System.out.println("You are still playing the game");
//        }
//
//        scanner.close();

        // ---------------------------------------- //
        // 8. while loop & do-while

        Scanner scanner = new Scanner(System.in);
        String name_8 = "";

        while(name_8.isBlank()) {
            System.out.print("Enter your name: ");
            name_8 = scanner.nextLine();
        }
        System.out.println("Your name is: " + name_8);

        do {
            System.out.print("Enter your name: ");
            name_8 = scanner.nextLine();
        } while(name_8.isBlank());

        // ---------------------------------------- //
        // 9. for loop
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Loop #" + (i + 1));
        }

        // ---------------------------------------- //
        // 9. nested loops
        int rows;
        int columns;
        String symbol_2 = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol_2 = scanner.next();

        for (int i = 1; i <= rows; i += 1) {
            System.out.println();
            for (int j = 1; j <= columns; j += 1) {
                System.out.print(symbol_2);
            }
        }
    }
}
