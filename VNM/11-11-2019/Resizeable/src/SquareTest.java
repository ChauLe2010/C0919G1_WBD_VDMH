public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println("pre rezie");
        square = new Square(4);
        square.howToColor();
        System.out.println(square);

        System.out.println("after rezie");
        square.resize(Math.floor((Math.random() * 100) + 1)/100);
        System.out.println(square);

    }
}
