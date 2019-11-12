public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("pre rezie");
        circle = new Circle(3.5);
        System.out.println(circle);

        System.out.println("after rezie");
        circle.resize(Math.floor((Math.random() * 100) + 1)/100);
        System.out.println(circle);

    }
}

