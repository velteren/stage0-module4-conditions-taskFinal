package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0) System.out.println("zero");
        if (x >= 0 && y >= 0) System.out.println("first");
        if (x >= 0 && y < 0) System.out.println("fourth");
        if (y >= 0 && x < 0) System.out.println("second");
        if (y < 0 && x < 0) System.out.println("third");
    }
}
