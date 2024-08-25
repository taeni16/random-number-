import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create an instance of Random
        Random random = new Random();

        // Generate a random number between min (inclusive) and max (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
