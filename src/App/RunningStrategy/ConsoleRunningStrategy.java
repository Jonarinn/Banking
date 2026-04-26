package App.RunningStrategy;

import java.io.Console;

public class ConsoleRunningStrategy implements IApplicationRunningStrategy {
    @Override
    public void start(AppConfig appConfig) {
        System.out.println("Application started (console)");
    }
    @Override
    public void stop() {

    }
}
