package untils;

public class AsterisksGenetator {
    public void horizontalGenerator(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public void verticalGenerator(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("*");
        }
    }

    public void rightTriggleGenerator(int num) {
        for (int i = 0; i < num; i++) {
            horizontalGenerator(i+1);
            System.out.println();
        }
    }
}
