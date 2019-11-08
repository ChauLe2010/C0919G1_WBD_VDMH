public class Main {
    public static void main(String[] args) {
        int slow = 1;
        int medium =2;
        int fast =3;

        Fan fan2 = new Fan();
        Fan fan3 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fast);
        fan2.setColor("Yellow");
        System.out.print(fan2.toString());
    }
}
