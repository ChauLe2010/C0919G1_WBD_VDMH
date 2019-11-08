import java.util.Scanner;

public class PTBac2 {
    public static class Account{

            public static class Accounts{
            Double a,b,c;

            public Accounts(){
            }
            public Accounts(double a, double b, double c){
                this.a =a;
                this.b =b;
                this.c =c;

            }

            public Double getA() {
                return a;
            }

            public void setA(Double a) {
                this.a = a;
            }

            public Double getB() {
                return b;
            }

            public void setB(Double b) {
                this.b = b;
            }

            public Double getC() {
                return c;
            }

            public void setC(Double c) {
                this.c = c;
            }
            public double getDiscriminant(){
                return ( (this.b*this.b) - 4*this.a*this.c );
            }
            public double getRoot1(){
                return ( (-(this.b) + Math.pow(getDiscriminant(),0.5)) / (2*this.a) );
            }
            public double getRoot2(){
                return ( (-(this.b) - Math.pow(getDiscriminant(),0.5)) / (2*this.a) );
            }


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        Account.Accounts account1 = new Account.Accounts(a,b,c);
        if (account1.getDiscriminant() < 0 ){
            System.out.println("The equation has no roots");
        }
        else if (account1.getDiscriminant() ==0){
            System.out.println("PT co 1 nghiem" + account1.getRoot1());
        }
        else {
            System.out.print("Nghiem 1: " + account1.getRoot1());
            System.out.println();
            System.out.print("Nghiem 2: " + account1.getRoot2());
        }


    }

}
