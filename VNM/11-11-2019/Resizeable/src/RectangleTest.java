public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("pre rezie");
        rectangle = new Rectangle(3,8);
        System.out.println(rectangle);

        System.out.println("after rezie");
        rectangle.resize(Math.floor((Math.random() * 100) + 1)/100);
        System.out.println(rectangle);

    }
}
