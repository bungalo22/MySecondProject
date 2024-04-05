package patterns.abstractFactory.website;

import patterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage Website project...");
    }
}
