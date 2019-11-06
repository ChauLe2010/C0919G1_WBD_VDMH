public class PTB2 {

    private double a, b, c;

    PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double delta() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    double getX1() {
        return (-this.b + (Math.pow(this.delta(), 0.5))) / (2 * this.a);
    }

    double getX2() {
        return (-this.b - (Math.pow(this.delta(), 0.5))) / (2 * this.a);
    }

    double getX() {
        return -this.b / (2 * this.a);
    }
}
