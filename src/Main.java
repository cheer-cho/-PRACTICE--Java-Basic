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

//        water = k_aid;
//        System.out.println("water: " + water);
//        System.out.println("k_aid: " + k_aid);

        String temp = water;
        water = k_aid;
        k_aid = temp;
        System.out.println("water: " + water);
        System.out.println("k_aid: " + k_aid);
    }
}
