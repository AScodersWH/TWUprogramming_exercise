package untils;

public class AsterisksGenetator {
    public void horizontalGenerator(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public void verticalGenerator(int ynum,int xnum) {
        for (int i = 0; i < ynum; i++) {
            horizontalGenerator(xnum);
        }
    }
}
