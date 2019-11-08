public class Rectangle extends Shape {
    private double width =1.0;
    private double height = 1.0;
    public Rectangle(){

    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return 2*(width+this.height);
    }

    @Override
    public String toString() {
        return "A rectangle with width = "
                +getWidth()
                + " and height = "
                + getHeight()
                + " , which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setWidth(2.3);
        rectangle.setHeight(5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);
    }
}
