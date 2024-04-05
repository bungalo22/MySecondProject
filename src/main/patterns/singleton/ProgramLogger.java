package patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger() {

    }
    public void addLogInfo(String loginfo) {
        logfile += loginfo + "\n";
    }
    public void showLogFile() {
        System.out.println(logfile);
    }
}
