import java.util.Random;
import java.util.Scanner;

public class RandomPicker {
    private static final String[] participants = {
            "Hector Ramirez",
            "Pride Mbalit",
            "Sebastian Holguin",
            "Alfredo Palacios",
            "Jonathon Carrera",
            "Nylan Pierre",
            "Lucas Moehlenbrock",
            "Nigel Jennings",
            "Kyle McAllister",
            "Samuel Zewdu",
            "Yamilet Gutierrez",
            "Jasmine Lin",
            "Raul Garcia",
            "Alfredo Canseco",
            "Syerra Ryan",
            "Adriaan Veney",
            "Anta Ndiaye",
            "Bennie Lee",
            "Deaz Nunoo",
            "Even Timko"
    };

    private static final String GENERATE_RANDOM = "R";
    private static final String QUIT = "Q";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        boolean quit = false;
        while(!quit) {
            System.out.printf("Press %s to get a new random person, %s to quit. (Not case sensitive): ", GENERATE_RANDOM, QUIT);
            String userInput = input.next();
            if(userInput.equalsIgnoreCase(QUIT)) {
                System.out.println("Bye!");
                quit = true;
            } else if(userInput.equalsIgnoreCase(GENERATE_RANDOM)) {
                System.out.println("Person Picked: " + participants[rng.nextInt(Integer.MAX_VALUE) % participants.length]);
            } else {
                System.out.println("Wrong option passed try again. ");
            }
        }
    }



}
