package patterns.facade;

public class BugTracker {
    public boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSpring() {
        System.out.println("sprint is active.");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("sprint is not active.");
        activeSprint = false;
    }
}
