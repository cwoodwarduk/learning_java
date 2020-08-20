import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        double circle = AreaCalculator.area(5.0);
        System.out.println(circle);

        double rectangle = AreaCalculator.area(5, 10);
        System.out.println(rectangle);
    }
}
