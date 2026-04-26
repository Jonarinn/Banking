package App;

import App.RunningStrategy.ConsoleRunningStrategy;
import App.RunningStrategy.IApplicationRunningStrategy;
import App.RunningStrategy.WebRunningStrategy;
import App.RunningStrategy.WindowRunningStrategy;

/**
 * Responsibility for the type of application that is being run, for example a window popup or just in the console.
 * This class should convert an input type to its corresponding ApplicationRunningStrategy.
 * */
public class ApplicationTypeController {
    public static IApplicationRunningStrategy GetApplicationRunningStrategy(ApplicationType applicationType) {
        return switch (applicationType) {
            case Console -> new ConsoleRunningStrategy();
            case Window -> new WindowRunningStrategy();
            case Web -> new WebRunningStrategy();
        };
    }
}
