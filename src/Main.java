import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Scaling-Potato");
        System.out.println("---");

        Scanner input = new Scanner(System.in);

        System.out.println("Automatic fill or manual?");

        String ans1 = input.nextLine();

        Vial[] vials;

        // VIAL SETUP
        switch (ans1) {
            case "auto":
                System.out.println("How many vials?");
                int amount = input.nextInt();

                System.out.println("How large are the vials?");
                int size = input.nextInt();

                Random rng = new Random();

                vials = new Vial[amount];
                Colour[] cList = new Colour[size];

                // TODO: ensure randomized vials are solvable
                for (int i = 0; i < amount - 2; ++i) {
                    for (int j = 0; j < size; ++j) { cList[j] = Colour.values()[rng.nextInt(Colour.values().length)]; }
                    vials[i] = new Vial(cList);
                }

                vials[amount - 2] = new Vial(size);
                vials[amount - 1] = new Vial(size);

                System.out.println("Vials created!");

                for (Vial v : vials) {
                    System.out.println(v + "\n");
                }
                break;

            // TODO: add manual vial filling
            case "manual":
                System.out.println("incomplete");
        
            default:
                System.out.println("Invalid input!");
                input.close();
                return;
        }

        // TODO: make the game
        // GAME


        input.close();
    }
}
