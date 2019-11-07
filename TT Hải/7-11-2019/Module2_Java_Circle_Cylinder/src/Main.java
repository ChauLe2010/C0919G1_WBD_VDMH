public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "red");
        String chuoi1 = circle.toString();
        System.out.print(chuoi1);

        Cylinder cylinder = new Cylinder(3.0, "blue", 2.0 );
        double V = cylinder.getVolume();
        System.out.println();
        System.out.println("The tich la: " + V);
        String chuoi2 = cylinder.toString();
        System.out.println(chuoi2);
    }
}
