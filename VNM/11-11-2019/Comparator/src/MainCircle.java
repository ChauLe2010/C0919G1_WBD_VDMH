import javafx.scene.shape.Circle;
import java.util.Comparator;
import java.util.Arrays;

public class MainCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6,3,5);
        circles[1] = new Circle(7.9,7,8);
        circles[2] = new Circle(3.5,4,19);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
