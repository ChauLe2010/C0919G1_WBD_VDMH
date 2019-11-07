public class Cylinder extends Circle {
    public double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getRadius() * super.getRadius() * Math.PI * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "height=" + height + super.toString();
    }
}
