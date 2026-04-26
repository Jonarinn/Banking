package App.RunningStrategy;

import App.ApplicationType;

import java.util.HashMap;
import java.util.Map;

public class ApplicationArgumentHandler {
    public AppConfig parse(String[] args) {
        Map<String, String> argMap = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            var arg = args[i];
            if (arg.startsWith("-")) {
                var nextIndex = i + 1;
                if (nextIndex >= args.length || !checkIfValidArgument(args[nextIndex])) {
                    continue;
                }

                argMap.put(arg.substring(1).toLowerCase(), args[nextIndex].trim().toLowerCase());
                i++;
            }
        }

        ApplicationType type = ApplicationTypeConverter(argMap.getOrDefault("application-type", ""));

        return new AppConfig(type);
    }

    /// This method should probably be implemented in a generic Converter class
    private ApplicationType ApplicationTypeConverter (String type) {
        return switch (type) {
            case "web" -> ApplicationType.Web;
            case "window" -> ApplicationType.Window;
            default -> ApplicationType.Console;
        };
    };

    private boolean checkIfValidArgument(String arg) {
        return !arg.isEmpty() && !arg.startsWith("-") && !arg.startsWith("--");
    }
}
