public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return this.height*getRadius()*Math.PI;
    }
    public String toString(){
        return "this Cylinder has "
                + getColor()
                + " and "
                + getRadius()
                + " and "
                + getHeight()
                + " Which is a sub class of "
                + super.toString();

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("before " + cylinder.getPerimeter() );
        cylinder = new Cylinder(1.6,"black",5.0);
        System.out.println(cylinder);
        System.out.println("after " + cylinder.getPerimeter() );
    }
}
