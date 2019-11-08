public class Main {
    public static void main(String[] args) {
        Stopwatch stopWatch = new Stopwatch();
        double[] array = new double[10000];
//        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            array[i] = Math.random() * 10000;
        }
        stopWatch.start();
        for (int i = 0; i < 10000; i++) {
            for (int j = (i + 1); j < 10000; j++) {
                if (array[i] > array[j]) {
                    double tempt = array[i];
                    array[i] = array[j];
                    array[j] = tempt;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Total time:" + stopWatch.getElapsedTime() + " millisecond");
    }
}