package patterns.visitor;

import arrayList.Test;
import patterns.adapter.Database;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);
}
