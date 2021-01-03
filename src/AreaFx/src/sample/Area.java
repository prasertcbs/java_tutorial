package sample;

public class Area {
    public static double rectangle(double width, double height) {
        return width * height;
    }

    public static double square(double width) {
        return rectangle(width, width);
    }

    public static double triangle(double width, double height) {
        return .5 * rectangle(width, height);
    }
}
