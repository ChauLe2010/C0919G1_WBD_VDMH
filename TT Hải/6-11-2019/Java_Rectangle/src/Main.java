import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        String chuoi = rectangle.display();
        double cv = rectangle.getPerimeter();
        double S = rectangle.getArea();
        System.out.print(chuoi + " Perimeter: " + cv + " Area: " + S);
    }
}
