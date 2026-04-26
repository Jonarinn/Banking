import App.ApplicationType;
import App.ApplicationTypeController;
import App.RunningStrategy.*;

void main(String[] args) {

    // This should launch the console application
    // Also allow for other methods, maybe some application interface
    ApplicationArgumentHandler argumentHandler = new ApplicationArgumentHandler();
    AppConfig appConfig = argumentHandler.parse(args);

    // Select the correct application Running strategy
    IApplicationRunningStrategy runningStrategy
            = ApplicationTypeController.GetApplicationRunningStrategy(appConfig.applicationType());;

    runningStrategy.start(appConfig);

    Runtime.getRuntime().addShutdownHook(new Thread(runningStrategy::stop));
}
