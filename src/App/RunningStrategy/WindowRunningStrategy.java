package App.RunningStrategy;

public class WindowRunningStrategy implements IApplicationRunningStrategy {
    @Override
    public void start(AppConfig appConfig) {
        System.out.println("Application started (window)");
    }
    @Override
    public void stop() {

    }

}
