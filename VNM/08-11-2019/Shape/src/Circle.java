public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){

    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2 *this.radius *Math.PI;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = "
                + getRadius()
                +", which is  a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
    }
}
