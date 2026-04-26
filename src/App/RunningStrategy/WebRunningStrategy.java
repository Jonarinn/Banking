package App.RunningStrategy;

public class WebRunningStrategy implements IApplicationRunningStrategy {
    @Override
    public void start(AppConfig appConfig) {
        System.out.println("Application started (web)");
    }
    @Override
    public void stop() {}
}
