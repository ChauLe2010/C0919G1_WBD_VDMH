import java.util.Scanner;

public class Retangle {

    public static class Rectangle{
        double width,height;

        public Rectangle(){

        }
        public Rectangle(double width, double height){
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
            return this.width * this.height;
        }
        public double getPerimeter(){
            return (this.width*this.height)*2;
        }
        public String display(){
            return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        System.out.println("Area: "+rectangle.getArea());
    }


}
