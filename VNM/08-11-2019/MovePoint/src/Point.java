public class Point {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(float x, float y ){
        float[] xy = {this.x, this.y};
        return xy;
    }
    @Override
    public String toString() {
        return "{" + "x=" + x + ", y=" + y + '}';
    }

        public static void main(String[] args) {
            Point point = new Point(2.0f, 4.0f);
            String chuoi = point.toString();
            System.out.println(chuoi);
        }

}
