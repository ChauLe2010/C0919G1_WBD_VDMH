import java.util.Date;

public class Stopwatch {
    private Date startTime;
    private Date stopTime;

    public Stopwatch() {
        Date now = new Date();
        this.startTime = now;
    }

    //    static {
//        Date now = new Date();
//    }
    public Date getStartTime() {
        return startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void start() {
        Date now = new Date();
        this.startTime = now;
        System.out.println(this.startTime);
    }

    public void stop() {
        Date now = new Date();
        this.stopTime = now;
        System.out.println(this.stopTime);
    }

    public long getElapsedTime() {
        long startTime = this.startTime.getTime();
        long stopTime = this.stopTime.getTime();
        return (stopTime - startTime);
    }

}