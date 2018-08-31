package diamondExercises;

import untils.AsterisksGenetator;

import java.util.Scanner;

public class GenerateAsterisksWithNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNext()) {
            number = scanner.nextInt();
        }

        AsterisksGenetator asterisksGenetator = new AsterisksGenetator();
        asterisksGenetator.horizontalGenerator(number);
    }
}
