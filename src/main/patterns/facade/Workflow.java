package patterns.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
