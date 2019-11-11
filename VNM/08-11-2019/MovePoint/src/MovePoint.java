public class MovePoint extends Point {
    public float xspeed =0.0f;
    public float yspeed =0.0f;

    public MovePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MovePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public MovePoint(){};

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setSpeed(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public float[] getSpeed(float xspeed, float yspeed ){
        float[] xyspeed = {this.xspeed, this.yspeed};
        return xyspeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", speed=" + "( " + xspeed + " , " + yspeed + " )";
    }
    public MovePoint move() {
        setX(getX() + xspeed);
        setY(getY() + yspeed);
        return this;
    }

    public static void main(String[] args) {
        MovePoint moveablePoint = new MovePoint(2.0f, 4.0f, 5.0f, 5.0f);
        System.out.println(moveablePoint.move());
    }
}
