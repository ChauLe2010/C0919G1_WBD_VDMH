public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter(){
        return 2 *this.radius *Math.PI;
    }
    public String toString(){
        return "this circle has : "
                + getColor()
                + " and "
                + getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5,"blue");
        System.out.println(circle.getPerimeter());
        System.out.println(circle);

    }
}

