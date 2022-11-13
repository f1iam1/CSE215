public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;

    StopWatch() {
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
